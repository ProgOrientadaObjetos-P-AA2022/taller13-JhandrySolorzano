/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import p2.Matricula;

/**
 *
 * @author reroes
 */
public class MatriculaCampamento extends Matricula{
    private double tarifa;
    
    @Override
    public void establecerMatricula(){
        // tarifa = costo transporte + costo comida + costo instructores
        tarifa = 100.2 + 30.2 + 90.2;
    }
        
    public double obtenerTarifa(){
        return tarifa;
    }
    
    @Override
        public String toString() {
            String cadena = String.format("Matricula Campamento - %.2f\n", tarifa);
             return cadena;
}
}
