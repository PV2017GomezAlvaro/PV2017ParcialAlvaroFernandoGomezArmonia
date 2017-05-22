/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.Circulo;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ColeccionCirculo implements Serializable {
    
    private ArrayList<Circulo> circulos;
    
    public ColeccionCirculo() {
        circulos=new ArrayList();
    }
    
    public void agregarCirculo(Circulo unCirculo){
        getCirculos().add(unCirculo);
    }

    public ColeccionCirculo(ArrayList<Circulo> circulos) {
        this.circulos = circulos;
    }

    public ArrayList<Circulo> getCirculos() {
        return circulos;
    }

    public void setCirculos(ArrayList<Circulo> circulos) {
        this.circulos = circulos;
    }

    
}
