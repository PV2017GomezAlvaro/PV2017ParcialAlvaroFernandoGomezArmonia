/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import aplicacion.modelo.dominio.Numeros;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class NumeroFormBean implements Serializable {
    private Numeros numeros;
    private int numeroing;
    private double prom;
    private int menor;
    private String texto; 

    public NumeroFormBean() {
        numeros = new Numeros();
        texto = " ";
    }
    public void agregarNum(){
        numeros.agregarNumero(numeroing);
    }
    
    public String calculoArr(){
        String arreglo = "Numeros ingresados: [";
        for(int a : numeros.getNumeros())
        {
            arreglo = arreglo + "(" + a + ")";
        }
        return arreglo;
    }
    
    public String calculodeNum(){
        String calculo = "";
        calculo = calculo + "Menor: " + numeros.numMenor();
        calculo = calculo + "\n Promedio: " + numeros.calcularPromedio();
        return calculo;
    }
    
    public Numeros getNumeros() {
        return numeros;
    }

    public void setNumeros(Numeros numeros) {
        this.numeros = numeros;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }

    public int getNumeroing() {
        return numeroing;
    }

    public void setNumeroing(int numeroing) {
        this.numeroing = numeroing;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    
}
