
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author msi
 */
public class ChiCuadrado {
    int intervalos,muestras;
    float esperado;
    float rango;
    int contador[];
    
    
    
    ChiCuadrado (int inter, int mues){
        intervalos = inter;
        muestras = mues;
        contador = new int[intervalos];
        esperado = (float) inter / (float) mues;
        rango = 1.0f / (float) inter;
        
    }

    
    public int[] contar(ArrayList aleatorios){
        int pertenece;        
        
        for (int i = 0; i< aleatorios.size(); i++){
            pertenece = (int)(((float)aleatorios.get(i)/rango)+1);
            if ((float)aleatorios.get(i)==1){
                pertenece=pertenece-1;
            }
       
            contador[(pertenece-1)]++;
        }
        return contador;
        
               
    
    
    }
}
