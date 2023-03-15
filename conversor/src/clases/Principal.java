package clases;

import javax.swing.JOptionPane;

import servicios.ConversionDivisas;
import servicios.ConversionTemperaturas;

public class Principal {
       public static void main(String[] args) {
    	   String [] menu = {"Convertir Divisas","Convertir temperatura", "Salir"};
    	   String elige = (String) JOptionPane.showInputDialog( null, "Que quieres hacer?", "Conversor de divisas", JOptionPane.QUESTION_MESSAGE,null, menu,"Convertir");

    	   ConversionDivisas conversion = new ConversionDivisas();
    	   ConversionTemperaturas temp = new ConversionTemperaturas();
    	   
    	   if (elige.equals("Salir")){
    		   JOptionPane.showMessageDialog(null, "Programa cerrado");
    		   System.exit(0);
    		   }
    	   else if(elige.equals("Convertir Divisas") ){
    		  conversion.convertirDivisas();

           }else if(elige.equals("Convertir temperatura")) {
        	   temp.convertirTemperaturas();
           }
       }
	
    	 
}
