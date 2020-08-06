
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
public class AleatoriosJava {
    
    
    ArrayList<Float> array_aleatorios = new ArrayList<Float>();
    
    public ArrayList generarAleatorios(int x){
        for (int i = 0 ; i < x ; i++){
            float numeroAleatorio = (float) Math.random() ;
            float rdoTruncado = (float) (Math.floor(numeroAleatorio * 10000) / 10000);
            array_aleatorios.add(rdoTruncado);
            
        
        }
        return array_aleatorios;
   
    
    }
}
