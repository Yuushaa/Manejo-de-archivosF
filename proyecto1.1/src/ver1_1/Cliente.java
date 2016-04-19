/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ver1_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */

public class Cliente {
    private String nombre;
    private String direccion;
    private int noUs;
     public void Cliente(String noUsuario,String nombre,String direccion)
     {
         this.nombre=nombre;
         this.noUs=Integer.parseInt( noUsuario);
         this.direccion=direccion;
     }
     
     
    public void leerDatos() {
        cargar();
    }
    
    
    
    // Cargar lista de alumnos
    public void cargar() {
        try {
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Victor\\Documents\\NetBeansProjects\\proyecto1.1\\src\\ver1_1\\Clientes.txt"));
                String linea;
                while((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    int noCliente = Integer.parseInt(st.nextToken().trim());
                    String Nombre = st.nextToken().trim();
                    String Direccion = st.nextToken().trim();
                }
            } 
         
catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e);
        }   
    }
    
}
