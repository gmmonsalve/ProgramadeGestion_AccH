/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author LUIS POTTE
 */
public class NodoSegundario {

    private NodoSegundario siguiente;
    private NodoSegundario anterior;
    private Object info;

    public NodoSegundario(Object i) {
        this.info = i;
        this.siguiente = null;
        this.anterior = null;
    }

    public NodoSegundario getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoSegundario anterior) {
        this.anterior = anterior;
    }

    public NodoSegundario getSiguiente() {
        return siguiente;
    }

    public Object getInfo() {
        return info;
    }

    public void setSiguiente(NodoSegundario siguiente) {
        this.siguiente = siguiente;
    }

    public void setInfo(Object valor) {
        this.info = valor;
    }    
    
}
