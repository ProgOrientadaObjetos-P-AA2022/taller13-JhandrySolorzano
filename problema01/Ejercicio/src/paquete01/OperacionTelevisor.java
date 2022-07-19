/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class OperacionTelevisor {
    
    double precioTotal;
    ArrayList<Televisor> televisores;
    String marcasVendidas;
    double caro;
    
   public void establecerTelevisores(ArrayList<Televisor> t){
       televisores = t;
   }
   
   public ArrayList<Televisor> obtenerTelevisores(){
       return televisores;
   }
   
    
    
    public void establecerPrecioTvs(){
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            s = s + televisores.get(i).obtenerPrecio();
           
        }
        precioTotal = s;
    }
    
    public double obtenertotalPrecioTvs(){
        return precioTotal;
    }
    
    
    public void establecerMarcasVendidas(ArrayList<Televisor> t){
        String s = "";
        for (int i = 0; i < televisores.size(); i++) {
            s = String.format("%s%s: %s\n", s, televisores.get(i).obtenerMarca(),
                    televisores.get(i).obtenerPrecio());
        }
        
        marcasVendidas=s;
        
    }
    
    public String obtenerMarcasVendidas(){
        return marcasVendidas;
    }
    
    
    
    public void establecerTelevisorMasCaro(ArrayList<Televisor> t){
        for(int i =0; i < t.size(); i++){
            if(televisores.get(i).obtenerPrecio() > caro){
                caro = televisores.get(i).obtenerPrecio();
            }
                    
        }
    }
    
    public double obtenerTelevisorMasCaro(){
        return caro;
    }
    
    
    @Override
    public String toString(){
        return String.format("Precio total: %.2f "
                + "\nMarca mas cara: %s\n",
                obtenertotalPrecioTvs(), obtenerTelevisorMasCaro());
    }
           
}
