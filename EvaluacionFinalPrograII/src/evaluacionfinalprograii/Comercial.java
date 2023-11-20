/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionfinalprograii;

/**
 *
 * @author luiss
 */
public class Comercial extends Empleado {
    private double comision;
    private String tipo;
    private static String tipoEm ="Comercical";

    public Comercial(String nombre, int edad, double salario,double comision) {
        super(nombre, edad, salario);
        this.comision=comision;
        this.tipo=Comercial.tipoEm;
    }
    
    //getters
    public String getTipo() {
        return this.tipo;
    }
    
    public double getComision() {
        return this.comision;
    }
    
    //Setters

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    //Plus
    
    public void addPlus()
    {
        int edad= this.getEdad();
        if (edad>30) 
        {
            if (this.comision>200.00) {
                double salario= this.getSalario();
                salario= salario + Empleado.getPlus();
                this.setSalario(salario);
            }
        }
    }
    
    
    
    
}
