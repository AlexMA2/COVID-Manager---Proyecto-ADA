/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Objetos.Paciente;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 *
 * @author Documentos
 */
public class PacientesComparador implements Comparator<Paciente>{

    public final static byte NOMBRE = 1;
    public final static byte APELLIDO = 2;
    public final static byte EDAD = 3;
    public final static byte TEMPERATURA = 4;
    public final static byte NROSINTOMAS = 5;
    private byte tipo;

    public PacientesComparador(byte tipo) {
        this.tipo = tipo;
    }
        
    @Override
    public int compare(Paciente o1, Paciente o2) {
        switch(tipo){
            case NOMBRE:
                return o1.getNombreString().compareToIgnoreCase(o2.getNombreString());
            case APELLIDO:
                return o1.getApellidoString().compareToIgnoreCase(o2.getApellidoString());
            case EDAD:
                return o1.getEdadString().compareToIgnoreCase(o2.getEdadString());
            case TEMPERATURA:
                return o1.getTemperaturaString().compareToIgnoreCase(o2.getTemperaturaString());
            case NROSINTOMAS:
                return new Integer(o1.getContadorSintomas()).compareTo(new Integer(o2.getContadorSintomas()));
            default:
                return o1.getNombreString().compareToIgnoreCase(o2.getNombreString());
        }
    }
    
}
