/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class ConversorFormBean implements Serializable{
    private ArrayList<String> op;
    private double temping;
    private String temp;
    private String tempconver;

    /**
     * Creates a new instance of ConversorFormBean
     */
    public ConversorFormBean() {
        op = new ArrayList();
        op.add("Celsius");
        op.add("Fahrenheit");
        temping = 0;
        tempconver = "";
    }
    
    public void calcularTemp(){
        if (getTemp().equals("Celsius")){
            setTempconver("Temperatura en Fahrenheit: " + (1.8 *(getTemping()) + 32));
        }
        else
        {
            if(getTemp().equals("Fahrenheit")){
                setTempconver("Temperatura en Celsius: " + ((getTemping()-32)/1.8));
            }
        }
    }

    public ConversorFormBean(ArrayList<String> op, double temping, String temp, String tempconver) {
        this.op = op;
        this.temping = temping;
        this.temp = temp;
        this.tempconver = tempconver;
    }

    public ArrayList<String> getOp() {
        return op;
    }

    public void setOp(ArrayList<String> op) {
        this.op = op;
    }

    public double getTemping() {
        return temping;
    }

    public void setTemping(double temping) {
        this.temping = temping;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getTempconver() {
        return tempconver;
    }

    public void setTempconver(String tempconver) {
        this.tempconver = tempconver;
    }
    
    
    
}
