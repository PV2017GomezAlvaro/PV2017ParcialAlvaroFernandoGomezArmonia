/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Alumno
 */
public class Numeros implements Serializable {

    private ArrayList<Integer> numeros;
    private int carga;

    public Numeros() {
        numeros = new ArrayList();
        carga = 0;

    }

    public Numeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public void agregarNumero(int a) {
        getNumeros().add(a);
        setCarga(getCarga() + 1);
        //setTexto(Arrays.toString(getNumeros()));
    }

    public double calcularPromedio() {
        double promedio = 0;
        if (numeros.isEmpty()) {
            return 0;
        } else {
            for (int i = 0; i < getCarga(); i++) {
                promedio = promedio + getNumeros().get(i);
            }
        }
        promedio = promedio / getCarga();
        return promedio;
    }

    public double numMenor() {
        if (numeros.isEmpty()) {
            return 0;
        }
        
        double menor = numeros.get(0);
        
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < menor) {
                menor = numeros.get(i);
            }
        }
        return menor;
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

}
