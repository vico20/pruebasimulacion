
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
public class MetodoMultiplicativo {
    int Xn,k,g;             
    float rdoTruncado;               
    float numeroAleatorio; 
    
    MetodoMultiplicativo(int ZXn, int Zk, int Zg){
        Xn= ZXn;
        k= Zk;
        g= Zg;
        
    }
    
    
    public Float calcular1NumeroAleatorio() {
        int a= 3 +(8*k);
        int m= (int) Math.pow(2, g); 
        Xn=(Xn*a) % m;                 
        numeroAleatorio = (float)Xn/(m-1) ;
        rdoTruncado = (float) (Math.floor(numeroAleatorio * 10000) / 10000);
                          
        return rdoTruncado;
    }
}

