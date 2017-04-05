package algoritmo_monedas;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author KAICES
 */
public class Algoritmo_Monedas {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
            int tam = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de denominaciones de las monedas?"));
            double moneda = 0, monedaAux = 0;
            
            
            Vector monedas = new Vector () ;
            
            
          
            monedas.addElement(moneda);
            
            
            for ( int i = 0; i < tam ; i++) {
                    moneda = Double.parseDouble(JOptionPane.showInputDialog("Denominacion de las moneda a ingresar"));
                    while ( moneda == monedaAux )
                        {
                            JOptionPane.showMessageDialog(null,"ingrese otra denominacion","ERROR!!",JOptionPane.INFORMATION_MESSAGE);
                            moneda = Double.parseDouble(JOptionPane.showInputDialog("Denominacion de las moneda a ingresar"));
                        }               
                    monedas.addElement(moneda);
                     monedaAux = moneda;         
            }
            
            JOptionPane.showMessageDialog(null,"Denominaciones ingresadas \n"+ monedas);
            
           
        
        
    }
    
}
