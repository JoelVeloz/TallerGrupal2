/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoplus;

import java.util.ArrayList;

/**
 *
 * @author raull
 */
public class Cliente {
    private ArrayList<Video> listaReproduccion;
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
        listaReproduccion = new ArrayList<>();
    }

    public boolean agregarLista(Video v) {
        if (listaReproduccion.size() < 5) {
            listaReproduccion.add(v);
            return true;
        }
        return false;
    }

    public void reproducir() {
        String continuar = "no";

        do {
           Video pV = listaReproduccion.get(0);
           pV.mostrarInformacion();
           pV.setNumeroReproducciones(pV.getNumeroReproducciones()+1);
           listaReproduccion.remove(0);
            
        } while (continuar.equals("si"));
    }

}
