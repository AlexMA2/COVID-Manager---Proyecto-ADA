/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Objetos.Paciente;
import Objetos.PacienteRecuperado;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Documentos
 */
public class GestionadorRecuperados {

    int numberRecuperados = 0;
    ListaEnlazada<PacienteRecuperado> listRecuperados;
    //ArrayList<PacienteRecuperado> listRecuperados;

    public GestionadorRecuperados() {
        numberRecuperados = recuperarDatos();
    }

    public void escritura(PacienteRecuperado p) {
        try {
            FileOutputStream os = new FileOutputStream("PacientesRecuperados.obj");
            try (ObjectOutputStream oos = new ObjectOutputStream(os)) {
                listRecuperados.insertar(p);
                //listRecuperados.add(p);
                numberRecuperados++;
                for (int i = 0; i <= numberRecuperados; i++) {
                    oos.writeObject(listRecuperados.obtener(i));
                    //oos.writeObject(listRecuperados.get(i));
                }
            }
            //JOptionPane.showMessageDialog(null, "El paciente se ha registrado con exito.", "Registro Completado", 1);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al momento de registrar.", "Registro Fallido", 0);
        }
    }

    public String lectura() {
        String pacientes = null;
        if (numberRecuperados == -1) {
            pacientes = "Sin pacientes recuperados.\n";
        } else {
            pacientes = "Pacientes:\n";
            for (int i = 0; i <= numberRecuperados; i++) {
                pacientes = pacientes + "- " + listRecuperados.obtener(i).getApellidoString() + ", " + listRecuperados.obtener(i).getNombreString() + ".\n";
                //pacientes = pacientes + "- " + listRecuperados.get(i).getApellidoString() + ", " + listRecuperados.get(i).getNombreString() + ".\n";
            }
        }
        return pacientes;
    }

    private int recuperarDatos() {
        listRecuperados = new ListaEnlazada<>();
        int contador = -1;
        try {
            FileInputStream is = new FileInputStream("PacientesRecuperados.obj");
            try (ObjectInputStream ois = new ObjectInputStream(is)) {
                PacienteRecuperado p;
                do {
                    p = (PacienteRecuperado) ois.readObject();
                    if (p != null) {
                        listRecuperados.insertar(p);
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
            for (int i = 0; i <= numberRecuperados; i++) {
                
                pacientes = pacientes + "- " + listRecuperados.obtener(i).getApellidoString() + ", " + listRecuperados.obtener(i).getNombreString() + ".\n";
            }
        }

        return pacientes;
    }

}
