/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionfinalprograii;

/**
 *
 * @author luiss
 */
public class Repartidor extends Empleado {
    private String zona;
    private String tipo;
    private static String tipoEm ="Repartidor";

    public Repartidor(String nombre, int edad, double salario, String zonaR) {
        super(nombre, edad, salario);
        this.zona= zonaR;
        this.tipo= Repartidor.tipoEm;
    }
    
    //getters
    public String getZona() {
        return this.zona;
    }

    public String getTipo() {
        return tipo;
    }
    
    //setters

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    
    
    //Plus
    public void addPlus()
    {
        int edad= this.getEdad();
        if (edad<25) 
        {
            if (this.zona.equals("zona 3")) {
                double salario= this.getSalario();
                salario= salario + Empleado.getPlus();
                this.setSalario(salario);
            }
        }
    }
    
    
    
}
