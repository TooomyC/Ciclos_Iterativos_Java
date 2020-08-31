/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclositerativos;

import javax.swing.JOptionPane;

/**
 *
 * @author Berny
 */
public class CiclosIterativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
        REALIZAR UN JUEGO PARA ADIVINAR UN NUMERO. PARA ELLO, GENERAR UN NUMERO ALEATORIO
        * ENTRE 0 Y 100, Y LUEGO IR PIDIENDO NUMEROS INDICANDO SI "ES MAYOR" O "ES MENOR" 
        * RESPECTO A ESE NUMERO "N". EL PROCESO TERMINA CUANDO EL USUARIO ACIERTA ESE NUMERO
        * Y MOSTRAR LA CANTIDAD DE INTENTOS.
        **/
        /**
        int numIngr, contador = 0, numRand;
        
        numRand = (int)(Math.random() * 100); //Debe devolver double.
        JOptionPane.showMessageDialog(null, "Random: "+numRand);
        JOptionPane.showMessageDialog(null, "Adivina el numero aleatorio generado. Gana quien lo adivina en menos intentos. ¡A jugar!");
        do{
            numIngr = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
            
            if(numIngr > numRand)
                JOptionPane.showMessageDialog(null, "El numero "+numIngr+" es mayor. Ingrese otro.");
            else
                JOptionPane.showMessageDialog(null, "El numero "+numIngr+ " es menor. Ingrese otro.");
            
            contador ++;
        }
        while(numIngr != numRand);
        JOptionPane.showMessageDialog(null, "¡Has acertado!. El numero de intentos fue de: "+contador);
        **/ 
        
        //PEDIR UN NUMERO N Y MOSTRAR TODOS LOS NUMEROS DEL 1 AL N.
        /**
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        while(num > 0){
            for(int i = 1; i <= num; i ++)
                JOptionPane.showMessageDialog(null, " - "+i);
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        }
        num = Integer.parseInt(JOptionPane.showInputDialog("Numero incorrecto."));
        **/ 
        /**
        //CALCULAR EL FACTORIAL DE UN NUMERO INGRESADO.
        
        long fact = 1, num;
        
        num = Long.parseLong(JOptionPane.showInputDialog("Ingrese un numero para calcular su factorial: "));
        if(num >= 0){ //Valido negativos.
            for(int i = 1; i <= num; i ++)
                fact *= i;
        JOptionPane.showMessageDialog(null, "El factorial de "+num+" es: "+fact);
        }
        else
            JOptionPane.showMessageDialog(null, "No es posible calcular el factorial de un negativo.");
        **/
        
       //CALCULAR LAS RAICES DE UN NUMERO.         
       /**
       double a, b, c;
       
       a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del primer coeficiente a: "));
       b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del segundo coeficiente b: "));
       c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del tercer coeficiente c: "));
       
       double x1 = ((-b + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/ (2 * a));
       double x2 = ((-b - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/ (2 * a));
       
       JOptionPane.showMessageDialog(null, "X1: "+x1);
       JOptionPane.showMessageDialog(null, "X2: "+x2);
       **/
    }
    
}
