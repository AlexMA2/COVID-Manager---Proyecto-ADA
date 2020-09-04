/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Objetos.Paciente;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Documentos
 */
public class GestionadorPacientes {

    int numberPacientes = 0;
    ListaEnlazada<Paciente> listPaciente;
    //ArrayList<Paciente> listPaciente;
    //Paciente A [] = int Paciente [numberPacientes];

    public GestionadorPacientes() {
        numberPacientes = recuperarDatos();
    }

    public void escritura(Paciente p) {
        try {
            FileOutputStream os = new FileOutputStream("PacientesCovid.obj");
            try (ObjectOutputStream oos = new ObjectOutputStream(os)) {
                listPaciente.insertar(p);
                //listPaciente.add(p);
                numberPacientes++;
                for (int i = 0; i <= numberPacientes; i++) {
                    oos.writeObject(listPaciente.obtener(i));
                    //oos.writeObject(listPaciente.get(i));
                }
            }
            JOptionPane.showMessageDialog(null, "El paciente se ha registrado con exito.", "Registro Completado", 1);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al momento de registrar.", "Registro Fallido", 0);
        }
    }

    public String lectura() {
        String pacientes;
        if (numberPacientes == -1) {
            pacientes = "Sin pacientes registrados.\n";
        } else {
            pacientes = "Pacientes:\n";
            for (int i = 0; i <= numberPacientes; i++) {
                pacientes = pacientes + "- " + listPaciente.obtener(i).getApellidoString() + ", " + listPaciente.obtener(i).getNombreString() + ".\n";
                //pacientes = pacientes + "- " + listPaciente.get(i).getApellidoString() + ", " + listPaciente.get(i).getNombreString() + ".\n";
            }
        }
        return pacientes;
    }

    private int recuperarDatos() {
        listPaciente = new ListaEnlazada<>();
        //listPaciente = new ArrayList<>();
        int contador = -1;
        try {
            FileInputStream is = new FileInputStream("PacientesCovid.obj");
            try (ObjectInputStream ois = new ObjectInputStream(is)) {
                Paciente p;
                do {
                    p = (Paciente) ois.readObject();
                    if (p != null) {
                        listPaciente.insertar(p);
                        //listPaciente.add(p);
                        contador++;
                    }
                } while (p != null);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error en Lectura");
        }

        return contador;
    }

    public String filtradoString(boolean DificultadRespirar, boolean TosSeca,
            boolean Cansancio, boolean DolorCabeza,
            boolean DolorGarganta, boolean DolorPecho,
            boolean PerdidaGusto, boolean PerdidaOlfato) {

        String pacientes;

        if (!DificultadRespirar && !TosSeca && !Cansancio && !DolorCabeza && !DolorGarganta && !DolorPecho && !PerdidaGusto && !PerdidaOlfato) {
            pacientes = "Sin resultados en la busqueda\n";
        } else {
            pacientes = "Pacientes:\n";
            for (int i = 0; i <= numberPacientes; i++) {
                pacientes = pacientes + "- " + listPaciente.obtener(i).getApellidoString() + ", " + listPaciente.obtener(i).getNombreString() + ".\n";
                //pacientes = pacientes + "- " + listPaciente.get(i).getApellidoString() + ", " + listPaciente.get(i).getNombreString() + ".\n";
            }
        }

        return pacientes;
    }

    public int getNumberPacientes() {
        return numberPacientes;
    }

    public ListaEnlazada<Paciente> getListPaciente() {
        return listPaciente;
    }

    public void setNumberPacientes(int numberPacientes) {
        this.numberPacientes = numberPacientes;
    }

    public void setListPaciente(ListaEnlazada<Paciente> listPaciente) {
        this.listPaciente = listPaciente;
    }

    public String[] getListaNombres() {
        String nombres[] = new String[listPaciente.longitud()];
        //String nombres[] = new String[listPaciente.size()];

        for (int i = 0; i < listPaciente.longitud(); i++) {
            nombres[i] = listPaciente.obtener(i).getNombreString();
            //nombres[i] = listPaciente.get(i).getNombreString();
        }
        
        return nombres;
    }

}
