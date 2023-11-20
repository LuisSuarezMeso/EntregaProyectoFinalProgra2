/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionfinalprograii;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author luiss
 */
public class DatosGlobales {
    
    private static ArrayList<Comercial> dbComercial = new ArrayList();
    private static ArrayList<Repartidor> dbRepartidor = new ArrayList();

    
    public static void AddComercial(Comercial nuevo)
    {
       String nom= nuevo.getNombre();
       DatosGlobales.dbComercial.add(nuevo);
       JOptionPane.showMessageDialog(null, nom+" ha sido añadido con exito. (Comercial)");
    }
    
    public static void AddRepartidor(Repartidor nuevo)
    {
       String nom= nuevo.getNombre();
       DatosGlobales.dbRepartidor.add(nuevo);
       JOptionPane.showMessageDialog(null, nom+" ha sido añadido con exito. (Repartidor)");
    }
    
    public static ArrayList<Comercial> getdbComercial() {
        return DatosGlobales.dbComercial;
    }
    
    public static ArrayList<Repartidor> getdbRepartidor() {
        return DatosGlobales.dbRepartidor;
    }
    
}
