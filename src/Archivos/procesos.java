/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import listas.*;
/**
 *
 * @author labcienciascomputacion6
 */
public class procesos {
    
    public void add_registro(String nombre_archivo, String registro) throws IOException {
        // agrega un registro dentro de un archivo
        File v = new File(nombre_archivo+".txt");
        FileWriter w = new FileWriter(v, true);
        BufferedWriter x = new BufferedWriter(w);
        PrintWriter y = new PrintWriter(x);
        y.println(registro);
        y.close();
        x.close();
        w.close();
    }
    
    public Multilista cargar_listas() throws FileNotFoundException, IOException{
        Multilista mt = new Multilista();
        String archivo = null;
            File v = new File(archivo);
            FileReader fr = new FileReader(v);
            BufferedReader br = new BufferedReader(fr);
            String line, nm = "";
            while (br.ready()) {
                line = br.readLine();
                boolean bo = true;
                int j = 0;
                while(bo == true){
                    if (line.substring(j, j + 1).equals("-")){
                        nm = nm + line.substring(j, j + 1);
                    }else{
                        bo = false;
                    }
                }
                switch(nm){
                    case "-":
                        mt.add_nodoprincipal(nm);
                        break;
                    case "--":
                        mt.add_sublista(j, bo);
                        break;
                    case "---":
                        mt.add_elmento_sublist(j, j, j);
                        break;
                }
//                while (j < line.length()) {
//                    if (line.substring(j, j + 1).equals(";")) {
//                        switch (sw) {
//                            case 1:
//                                combofer.addItem(nm);
//                                break;
//                        }
//                        nm = "";
//                        break;
//                    } else {
//                        nm = nm + line.substring(j, j + 1);
//                    }
//                    j++;
//                }
            }
            br.close();
            fr.close();
        return mt;
    }
    
    public void actualizar_archivos(String Nombre_archivo, Multilista list) throws IOException {
        File archivo = new File(Nombre_archivo+".txt");
        FileWriter w = new FileWriter(archivo, true);
        BufferedWriter x = new BufferedWriter(w);
        PrintWriter y = new PrintWriter(x);
        NodoPrincipal aux = list.getInicioMulti();
        while (aux != null) {
            this.add_registro(Nombre_archivo, "-"+(String) aux.getInfo());
            NodoSegundario subaux = aux.getNodos().getInicio();
            while(subaux != null){
                NodoSegundario no = (NodoSegundario) subaux.getInfo();
                y.println ("--"+(no.getInfo()));
                no = no.getSiguiente();
                while (no != null){
                    y.println("---"+no.getInfo());
                    no = no.getSiguiente();
                }
                subaux = subaux.getSiguiente();
            }
            //y.println(aux.getlinea());
            aux = aux.getSiguiente();
        }
        y.close();
        x.close();
        w.close();
    }
}
