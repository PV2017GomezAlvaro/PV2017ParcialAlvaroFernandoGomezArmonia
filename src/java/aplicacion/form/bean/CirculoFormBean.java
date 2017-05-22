/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import aplicacion.modelo.datos.ColeccionCirculo;
import aplicacion.modelo.dominio.Circulo;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class CirculoFormBean implements Serializable {

    private ColeccionCirculo circulos;
    private Circulo circulo;
    private double radio;

    public CirculoFormBean() {
        circulos = new ColeccionCirculo();
    }

    public void agregarCirculo() {
        setCirculo(new Circulo(getRadio()));
        getCirculos().agregarCirculo(getCirculo());
    }

    public CirculoFormBean(ColeccionCirculo circulos, Circulo circulo, double radio) {
        this.circulos = circulos;
        this.circulo = circulo;
        this.radio = radio;
    }

    public ColeccionCirculo getCirculos() {
        return circulos;
    }

    public void setCirculos(ColeccionCirculo circulos) {
        this.circulos = circulos;
    }

    public Circulo getCirculo() {
        return circulo;
    }

    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
