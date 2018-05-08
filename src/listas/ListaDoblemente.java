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
public class ListaDoblemente extends Lista {

    public ListaDoblemente() {
        super();
    }

    public void agregaralfinal(Object n) {
        NodoSegundario nvo = new NodoSegundario(n);
        if (inicio == null) {
            inicio = nvo;
        } else {
            NodoSegundario aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            nvo.setAnterior(aux);
            aux.setSiguiente(nvo);
        }
        tamaño++;
    }

    public void print() {
        NodoSegundario aux = inicio;
        while (aux != null) {
            System.out.println("valor: " + aux.getInfo());
            aux = aux.getSiguiente();
        }
    }

    public void recorridoL() {
        NodoSegundario aux = getult();
        while (aux != null) {
            System.out.println("valor: " + aux.getInfo());
            aux = aux.getAnterior();
        }
    }

    private NodoSegundario getult() {
        NodoSegundario p = inicio;
        while (p.getSiguiente() != null) {
            p = p.getSiguiente();
        }
        return p;
    }

    public void eliminar(Object info) {
        try{
        NodoSegundario p = inicio;
        while (p != null && !p.getInfo().equals((String) info)) {
            p = p.getSiguiente();
        }
        if (p == inicio) {
            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);
        } else {
            NodoSegundario ultm = getult();
            if (p == ultm) {
                p.getAnterior().setSiguiente(null);
            } else {
                p.getAnterior().setSiguiente(p.getSiguiente());
                p.getSiguiente().setAnterior(p.getAnterior());
            }
        }
        p = null;
        }catch (NullPointerException e){
        }
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

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

}
