package servicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import temperaturas.Celcius;
import temperaturas.Fahrenheit;
import temperaturas.Kelvin;

public class ConversionTemperaturas {
	
	Celcius celcius = new Celcius();
	Fahrenheit fahrenheit = new Fahrenheit();
	Kelvin kelvin= new Kelvin();
	
	public void convertirTemperaturas() {
		DecimalFormat formatearDivisa = new DecimalFormat("#.##");
		boolean continuarPrograma = true;
		while(continuarPrograma) {
			String [] opciones = {"Celcius a Fahrenheit","Celcius a Kelvin","Fahrenheit a Celcius","Kelvin a Celcius"};
			String opcion = (String) JOptionPane.showInputDialog(null, "Elija una opcion", "Conversor de Temperaturas",JOptionPane.QUESTION_MESSAGE,null, opciones,"Celcius a Fahrenheit");
			
			String valorNominal = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
			
			try {
				celcius.setTemperatura(Double.parseDouble(valorNominal));
			}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Valor no valido");
				System.exit(0);
			}
			if(opcion.equals("Celcius a Fahrenheit")) {
				fahrenheit.setFahrenheit(((celcius.getTemperatura()*9)/5)+32);
				JOptionPane.showMessageDialog(null, celcius.getTemperatura() + " grados celcius son: "+ formatearDivisa.format(fahrenheit.getFahrenheit()) + "Grados Farenheit.");
			}else if(opcion.equals("Celcius a Kelvin")) {
				kelvin.setKelvin(celcius.getTemperatura()+273.15);
				JOptionPane.showMessageDialog(null, celcius.getTemperatura() + " grados celcius son: "+ formatearDivisa.format(kelvin.getKelvin()) + "Grados Kelvin.");
			}else if(opcion.equals("Fahrenheit a Celcius")) {
				celcius.setCelcius(((celcius.getTemperatura()-32)*5)/9);
				JOptionPane.showMessageDialog(null, celcius.getTemperatura() + " grados Farenheit son: "+ formatearDivisa.format(celcius.getCelcius()) + "Grados Celcius.");
			}else if(opcion.equals("Kelvin a Celcius")) {
				celcius.setCelcius(celcius.getTemperatura()-273.15);
				JOptionPane.showMessageDialog(null, celcius.getTemperatura() + " grados Kelvin son: "+ formatearDivisa.format(celcius.getCelcius()) + "Grados Celcius.");
			}
			int confirm = JOptionPane.showConfirmDialog(null, "Desea continuar utilizando el programa","Confirmar",JOptionPane.YES_NO_OPTION);
			if(confirm == JOptionPane.NO_OPTION ) {
			continuarPrograma = false;
			JOptionPane.showMessageDialog(null,"programa finalizado");
			}



  }
 }
}
