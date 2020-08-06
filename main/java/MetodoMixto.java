
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
public class MetodoMixto {
    int Xn,k,g,c;             
    float rdoTruncado;               
    float numeroAleatorio;  

    MetodoMixto(int ZXn, int Zk, int Zg, int Zc){
        Xn= ZXn;
        k= Zk;
        g= Zg;
        c= Zc;
        
    }
    
    public ArrayList calcularNumerosAleatorio(int cant) {
        int a=1+(4*k);
        int m= (int) Math.pow(2, g); 
        Xn=(Xn*a + c) % m;
        ArrayList<Float> resultadosArray = new ArrayList<Float>();
        for(int i=0; i<cant; i++){                           
            Xn=(Xn*a + c) % m;                             
            numeroAleatorio = (float)Xn/(m-1) ;
            rdoTruncado = (float) (Math.floor(numeroAleatorio * 10000) / 10000);
            resultadosArray.add(rdoTruncado);
           
            }
        return resultadosArray;
    }
    
    public Float calcular1NumeroAleatorio() {
        int a=1+(4*k);
        int m= (int) Math.pow(2, g); 
        Xn=(Xn*a + c) % m;                 
        numeroAleatorio = (float)Xn/(m-1) ;
        rdoTruncado = (float) (Math.floor(numeroAleatorio * 10000) / 10000);
                          
        return rdoTruncado;
    }
}


