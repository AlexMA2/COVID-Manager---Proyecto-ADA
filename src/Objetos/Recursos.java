/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author AlexisRM
 */
public class Recursos {

    int disponibles;
    int ocupados;
    int total;

    public Recursos(int disponibles, int ocupados) {
        this.disponibles = disponibles;
        this.ocupados = ocupados;
        this.total = disponibles+ocupados;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    public int getOcupados() {
        return ocupados;
    }

    public void setOcupados(int ocupados) {
        this.ocupados = ocupados;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void pacienteNuevo(){
        
    }
    
}
