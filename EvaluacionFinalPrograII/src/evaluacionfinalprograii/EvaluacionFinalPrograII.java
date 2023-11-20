/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacionfinalprograii;

/**
 *
 * @author luiss
 */
public class EvaluacionFinalPrograII {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Comercial com= new Comercial("Pedro",34,150.00,400);
        
        System.out.println("Nombre: "+ com.getNombre());
        System.out.println("COMISION: "+ com.getComision());
        System.out.println("Salario pre Plus: "+ com.getSalario());
        com.addPlus();
        System.out.println("Salario post Plus: "+ com.getSalario());
        
        
        
        Repartidor rep= new Repartidor("Kenneth",20,200,"zona 3");
        System.out.println("Nombre: "+ rep.getNombre());
        System.out.println("Zona: "+ rep.getZona());
        System.out.println("Salario pre Plus: "+ rep.getSalario());
        rep.addPlus();
        System.out.println("Salario post Plus: "+ rep.getSalario());
        
        DatosGlobales.AddRepartidor(rep);
        DatosGlobales.AddComercial(com);
        
        ApartadoGrafico diez= new ApartadoGrafico();
        diez.setVisible(true);
        

        
    }
    
}
