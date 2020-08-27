/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.io.Serializable;

public class Paciente implements Serializable {

    String NombreString;
    String ApellidoString;
    String EdadString;
    String TemperaturaString;

    Boolean DificultadRespirarBoolean;
    Boolean TosSecaBoolean;
    Boolean CansancioBoolean;
    Boolean DolorCabezaBoolean;
    Boolean DolorGargantaBoolean;
    Boolean DolorPechoBoolean;
    Boolean PerdidaGustoBoolean;
    Boolean PerdidaOlfatoBoolean;

    int contadorSintomas;

    public Paciente(String NombreString, String ApellidoString, String EdadString, String TemperaturaString, Boolean DificultadRespirarBoolean, Boolean TosSecaBoolean, Boolean CansancioBoolean, Boolean DolorCabezaBoolean, Boolean DolorGargantaBoolean, Boolean DolorPechoBoolean, Boolean PerdidaGustoBoolean, Boolean PerdidaOlfatoBoolean, int contadorSintomas) {
        this.NombreString = NombreString;
        this.ApellidoString = ApellidoString;
        this.EdadString = EdadString;
        this.TemperaturaString = TemperaturaString;
        this.DificultadRespirarBoolean = DificultadRespirarBoolean;
        this.TosSecaBoolean = TosSecaBoolean;
        this.CansancioBoolean = CansancioBoolean;
        this.DolorCabezaBoolean = DolorCabezaBoolean;
        this.DolorGargantaBoolean = DolorGargantaBoolean;
        this.DolorPechoBoolean = DolorPechoBoolean;
        this.PerdidaGustoBoolean = PerdidaGustoBoolean;
        this.PerdidaOlfatoBoolean = PerdidaOlfatoBoolean;
        this.contadorSintomas = contadorSintomas;
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

    public String getTemperaturaString() {
        return TemperaturaString;
    }

    public void setTemperaturaString(String TemperaturaString) {
        this.TemperaturaString = TemperaturaString;
    }

    public Boolean getDificultadRespirarBoolean() {
        return DificultadRespirarBoolean;
    }

    public void setDificultadRespirarBoolean(Boolean DificultadRespirarBoolean) {
        this.DificultadRespirarBoolean = DificultadRespirarBoolean;
    }

    public Boolean getTosSecaBoolean() {
        return TosSecaBoolean;
    }

    public void setTosSecaBoolean(Boolean TosSecaBoolean) {
        this.TosSecaBoolean = TosSecaBoolean;
    }

    public Boolean getCansancioBoolean() {
        return CansancioBoolean;
    }

    public void setCansancioBoolean(Boolean CansancioBoolean) {
        this.CansancioBoolean = CansancioBoolean;
    }

    public Boolean getDolorCabezaBoolean() {
        return DolorCabezaBoolean;
    }

    public void setDolorCabezaBoolean(Boolean DolorCabezaBoolean) {
        this.DolorCabezaBoolean = DolorCabezaBoolean;
    }

    public Boolean getDolorGargantaBoolean() {
        return DolorGargantaBoolean;
    }

    public void setDolorGargantaBoolean(Boolean DolorGargantaBoolean) {
        this.DolorGargantaBoolean = DolorGargantaBoolean;
    }

    public Boolean getDolorPechoBoolean() {
        return DolorPechoBoolean;
    }

    public void setDolorPechoBoolean(Boolean DolorPechoBoolean) {
        this.DolorPechoBoolean = DolorPechoBoolean;
    }

    public Boolean getPerdidaGustoBoolean() {
        return PerdidaGustoBoolean;
    }

    public void setPerdidaGustoBoolean(Boolean PerdidaGustoBoolean) {
        this.PerdidaGustoBoolean = PerdidaGustoBoolean;
    }

    public Boolean getPerdidaOlfatoBoolean() {
        return PerdidaOlfatoBoolean;
    }

    public void setPerdidaOlfatoBoolean(Boolean PerdidaOlfatoBoolean) {
        this.PerdidaOlfatoBoolean = PerdidaOlfatoBoolean;
    }

    public int getContadorSintomas() {
        return contadorSintomas;
    }

    public void setContadorSintomas(int contadorSintomas) {
        this.contadorSintomas = contadorSintomas;
    }
    
    
    
}
