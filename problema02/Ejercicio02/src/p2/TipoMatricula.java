/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;


import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
public class TipoMatricula {
    private double promedioMatriculas;
    private ArrayList<Matricula> matriculas;
    
    
    
    public void establecerMatriculas(ArrayList<Matricula> m){
        matriculas = m;
        
    }
    
    public ArrayList<Matricula> obtenerMatriculas(){
        return matriculas;
    }
    
    
    public void establecerPromedioMatricular(){
        double suma = 0;
        for (int i = 0; i < obtenerMatriculas().size(); i++) {
            suma = suma + obtenerMatriculas().get(i).obtenerMatricula();
        }
        promedioMatriculas = suma / obtenerMatriculas().size();
    }
    
    public double obtenerPromedioMatriculas(){
        return promedioMatriculas;
    }
    
     @Override

    public String toString() {
    String cadena = String.format("Lista de Matriculas\n");
     for (int i = 0; i < obtenerMatriculas().size(); i++) {
            cadena = String.format("%s%s" ,
                    cadena,
                    matriculas.get(i));
        }
        cadena = String.format("%s\nPromedio Matricula: %.2f", 
                cadena,
                promedioMatriculas);
        return cadena;
    
    }

    
    
    
    
    }

