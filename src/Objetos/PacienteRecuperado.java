/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.io.Serializable;

public class PacienteRecuperado implements Serializable {

    String NombreString;
    String ApellidoString;
    String EdadString;
    String FechaAltaString;

    public PacienteRecuperado(String NombreString, String ApellidoString, String EdadString, String FechaAltaString) {
        this.NombreString = NombreString;
        this.ApellidoString = ApellidoString;
        this.EdadString = EdadString;
        this.FechaAltaString = FechaAltaString;
    }

    public String getNombreString() {
        return NombreString;
    }

    public void setNombreString(String NombreString) {
        this.NombreString = NombreString;
    }

    public String getApellidoString() {
        return ApellidoString;
    }

    public void setApellidoString(String ApellidoString) {
        this.ApellidoString = ApellidoString;
    }

    public String getEdadString() {
        return EdadString;
    }

    public void setEdadString(String EdadString) {
        this.EdadString = EdadString;
    }

    public String getFechaAltaString() {
        return FechaAltaString;
    }

    public void setFechaAltaString(String FechaAltaString) {
        this.FechaAltaString = FechaAltaString;
    }

    
}
