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
public class Lista {

    protected NodoSegundario inicio;
    protected int tamaño;

    public Lista() {
        inicio = null;
        tamaño = 0;
    }

    public void print() {
        NodoSegundario aux = inicio;
        while (aux != null) {
            System.out.println("valor: " + aux.getInfo());
            aux = aux.getSiguiente();
        }
    }

    public NodoSegundario getnodo(String o) {
        NodoSegundario s = inicio;
        while (!s.getInfo().toString().equals(o) && s.getSiguiente()!=null) {
            s = s.getSiguiente();
        }
        return s;
    }

    public NodoSegundario getInicio() {
        return inicio;
    }

    public void setInicio(NodoSegundario inicio) {
        this.inicio = inicio;
    }

    public int getTamaño() {
        return tamaño;
    }
    
    public void ordenar() {
        for (int i = 0; i < tamaño; i++) {
            NodoSegundario ant = inicio.getAnterior();
            NodoSegundario q = inicio;
            NodoSegundario sgte = inicio.getSiguiente();
            while (sgte != null) {
                if (sgte.getInfo().toString().compareTo(q.getInfo().toString()) < 0) {
                    if (ant == null) {
                        q.setSiguiente(sgte.getSiguiente());
                        sgte.setSiguiente(q);
                        inicio = sgte;
                    } else {
                        ant.setSiguiente(q.getSiguiente());
                        q.setSiguiente(sgte.getSiguiente());
                        sgte.setSiguiente(q);
                    }
                    ant = sgte;
                    sgte = q.getSiguiente();
                } else {
                    ant = q;
                    q = sgte;
                    sgte = sgte.getSiguiente();
                }
            }
        }
    }
    
}
