/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.io.Serializable;
import java.util.Objects;

public class Paciente implements Serializable{
    
    int codigo;
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

    public Paciente() {
    }

    public Paciente(String NombreString, String ApellidoString, String EdadString, String TemperaturaString,
            Boolean DificultadRespirarBoolean, Boolean TosSecaBoolean, Boolean CansancioBoolean,
            Boolean DolorCabezaBoolean, Boolean DolorGargantaBoolean, Boolean DolorPechoBoolean,
            Boolean PerdidaGustoBoolean, Boolean PerdidaOlfatoBoolean, int contadorSintomas, int codigo) {
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
        this.codigo = codigo;
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

    private String devuelveSiNo(boolean booleano){
        return booleano ? "Si" : "No";
    }
    
    @Override
    public String toString() {        
        return "\nPaciente: " + NombreString + " " + ApellidoString + "\n- Codigo: " + codigo + "\n- Edad: " + EdadString + "\n- Temperatura: " + TemperaturaString
                + " C\n- Sintomas: " + "(" + contadorSintomas + ") \n * Dificultad para respirar: " + devuelveSiNo(DificultadRespirarBoolean) + "\n * Tos Seca: " + devuelveSiNo(TosSecaBoolean)
                + "\n * Cansancio: " + devuelveSiNo(CansancioBoolean) + "\n * Dolor de Cabeza: " + devuelveSiNo(DolorCabezaBoolean) + "\n * Dolor de garganta: " + devuelveSiNo(DolorGargantaBoolean)
                + "\n * Dolor de pecho: " + devuelveSiNo(DolorPechoBoolean) + "\n * Perdida de gusto: " + devuelveSiNo(PerdidaGustoBoolean) + "\n * Perdida de Olfato: "
                + devuelveSiNo(PerdidaOlfatoBoolean) + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.NombreString);
        hash = 37 * hash + Objects.hashCode(this.ApellidoString);
        hash = 37 * hash + Objects.hashCode(this.EdadString);
        hash = 37 * hash + Objects.hashCode(this.TemperaturaString);
        hash = 37 * hash + Objects.hashCode(this.DificultadRespirarBoolean);
        hash = 37 * hash + Objects.hashCode(this.TosSecaBoolean);
        hash = 37 * hash + Objects.hashCode(this.CansancioBoolean);
        hash = 37 * hash + Objects.hashCode(this.DolorCabezaBoolean);
        hash = 37 * hash + Objects.hashCode(this.DolorGargantaBoolean);
        hash = 37 * hash + Objects.hashCode(this.DolorPechoBoolean);
        hash = 37 * hash + Objects.hashCode(this.PerdidaGustoBoolean);
        hash = 37 * hash + Objects.hashCode(this.PerdidaOlfatoBoolean);
        hash = 37 * hash + this.contadorSintomas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        if (this.contadorSintomas != other.contadorSintomas) {
            return false;
        }
        if (!Objects.equals(this.NombreString, other.NombreString)) {
            return false;
        }
        if (!Objects.equals(this.ApellidoString, other.ApellidoString)) {
            return false;
        }
        if (!Objects.equals(this.EdadString, other.EdadString)) {
            return false;
        }
        if (!Objects.equals(this.TemperaturaString, other.TemperaturaString)) {
            return false;
        }
        if (!Objects.equals(this.DificultadRespirarBoolean, other.DificultadRespirarBoolean)) {
            return false;
        }
        if (!Objects.equals(this.TosSecaBoolean, other.TosSecaBoolean)) {
            return false;
        }
        if (!Objects.equals(this.CansancioBoolean, other.CansancioBoolean)) {
            return false;
        }
        if (!Objects.equals(this.DolorCabezaBoolean, other.DolorCabezaBoolean)) {
            return false;
        }
        if (!Objects.equals(this.DolorGargantaBoolean, other.DolorGargantaBoolean)) {
            return false;
        }
        if (!Objects.equals(this.DolorPechoBoolean, other.DolorPechoBoolean)) {
            return false;
        }
        if (!Objects.equals(this.PerdidaGustoBoolean, other.PerdidaGustoBoolean)) {
            return false;
        }
        return Objects.equals(this.PerdidaOlfatoBoolean, other.PerdidaOlfatoBoolean);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

        
    
    
}
