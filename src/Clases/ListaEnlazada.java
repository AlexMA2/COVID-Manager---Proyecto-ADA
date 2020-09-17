package Clases;

import Objetos.Paciente;

public class ListaEnlazada<T> extends Object{

    private class Nodo {

        public T dato;
        public Nodo siguiente = null;

        public Nodo(T dato) {
            this.dato = dato;
        }

    }

    private Nodo cabeza = null;
    private int tamanio = 0;

    public ListaEnlazada() {
    }

    public void insertarInicio(T data) {
        Nodo nodo = new Nodo(data);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        tamanio++;
    }

    public void insertar(T data) {
        Nodo nodo = new Nodo(data);
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            Nodo aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nodo;
        }
        tamanio++;
    }

    public void insertar(int indice, T data) {
        Nodo nodo = new Nodo(data);
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            Nodo aux = cabeza;
            int contador = 0;
            while (aux.siguiente != null && contador < indice) {
                aux = aux.siguiente;
                contador++;
            }
            nodo.siguiente = aux.siguiente;
            aux.siguiente = nodo;
        }
        tamanio++;
    }

    public int longitud() {
        return tamanio;
    }

    public T obtener(int indice) {
        if (cabeza == null) {
            return null;
        } else {
            Nodo aux = cabeza;
            int contador = 0;
            while (aux.siguiente != null && contador < indice) {
                aux = aux.siguiente;
                contador++;
            }
            return ((contador != indice) ? null : aux.dato);
        }
    }

    public boolean estaVacio() {
        return cabeza == null;
    }

    public void borrarInicio() {
        if (cabeza != null) {
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer.siguiente = null;
            tamanio--;
        }

    }

    public void borrar() {
        if (cabeza != null) {
            if (cabeza.siguiente == null) {
                cabeza = null;
                tamanio--;
            } else {
                Nodo puntero = cabeza;
                while (puntero.siguiente.siguiente != null) {
                    puntero = puntero.siguiente;
                }
                puntero.siguiente = null;
                tamanio--;
            }
        }

    }

    public void borrar(int indice) {
        if (cabeza != null) {
            if (indice == 0) {
                Nodo primer = cabeza;
                cabeza = cabeza.siguiente;
                primer.siguiente = null;
                tamanio--;
            } else if (indice < tamanio) {
                Nodo puntero = cabeza;
                int contador = 0;
                while (contador < (indice - 1)) {
                    puntero = puntero.siguiente;
                    contador++;
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;                
                tamanio--;
            }

        }
    }

    public boolean borrar(Object valor){
        for(int i=0;i<tamanio; i++){
            if(obtener(i).equals(valor)){
                borrar(i);
                return true;
            }
        }
        return false;
    }
    
    public void colocar(int indice, T data) {
        insertar(indice, data);
        borrar(indice + 1);

    }

    public Paciente[] aArray() {        
        Paciente arreglo[] = new Paciente[tamanio];
        Nodo aux = cabeza;
        int cont = 0;
        while (aux != null) {
            arreglo[cont] = (Paciente) aux.dato;
            aux = aux.siguiente;
            cont++;
        }
        return arreglo;

    }

    @Override
    public String toString() {
        String retorno = "";
        Nodo aux = cabeza;
        if (aux != null) {
            while (aux != null && aux.siguiente != null) {

                retorno = retorno + aux.dato.toString() + ", ";
                aux = aux.siguiente;
            }
            return retorno + aux.dato.toString();
        }
        else{
            return retorno;
        }

    }

}
