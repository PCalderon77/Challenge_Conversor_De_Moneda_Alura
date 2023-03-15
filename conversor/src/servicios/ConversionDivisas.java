package servicios;


import java.text.DecimalFormat;

import javax.swing.JOptionPane;


import divisas.Dolar;
import divisas.Euro;
import divisas.LibraEsterlina;
import divisas.PesoArgentino;
import divisas.Won;
import divisas.Yen;

public class ConversionDivisas {

	PesoArgentino pesos = new PesoArgentino();
	Euro euros= new Euro();
	LibraEsterlina libras =new LibraEsterlina();
	Dolar dolares = new Dolar();
	Won wones = new Won();
	Yen yenes = new Yen();
	
	public void convertirDivisas() {
		DecimalFormat formatearDivisa = new DecimalFormat("#.##");
		boolean continuarPrograma = true;
		while(continuarPrograma) {
			String [] opciones = {"Pesos argentinos a Euros","Pesos argentinos a dolares","Pesos argentinos a Libras Esterlinas", "Pesos argentinos a Yen", "Pesos argentinos a Won"};
			
			String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opcion", "Conversor de moneda",JOptionPane.QUESTION_MESSAGE,null, opciones,"Pesos argentinos a Euros");

			String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos argentinos");
	
			try {
				pesos.setImporte(Double.parseDouble(input)); 
			}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Valor no valido");
			}
			if(cambio.equals("Pesos argentinos a Euros")) {
				euros.setEuro(pesos.getImporte()/euros.getValorEuro());
				JOptionPane.showMessageDialog(null,String.valueOf(pesos.getImporte())+ " pesos argentinos son: "+ formatearDivisa.format(euros.getEuro())+"Euros.");
			}else if(cambio.equals("Pesos argentinos a dolares")) {
				dolares.setDolar(pesos.getImporte()/dolares.getValorDolar());
				JOptionPane.showMessageDialog(null,String.valueOf(pesos.getImporte())+ "Pesos argentinos son: "+ formatearDivisa.format(dolares.getDolar())+"Dolares.");
			}else if(cambio.equals("Pesos argentinos a Libras Esterlinas")) {
				libras.setLibra(pesos.getImporte()/libras.getValorLibra());
				JOptionPane.showMessageDialog(null,String.valueOf(pesos.getImporte())+ "Pesos argentinos son: "+ formatearDivisa.format(libras.getLibra())+"Libras.");
			}else if(cambio.equals("Pesos argentinos a Yen")) {
				yenes.setYen(pesos.getImporte()/yenes.getValorYen());
				JOptionPane.showMessageDialog(null,String.valueOf(pesos.getImporte())+ "Pesos argentinos son: "+ formatearDivisa.format(yenes.getYen())+"Yen.");
			}else if(cambio.equals("Pesos argentinos a Won")) {
				wones.setWon(pesos.getImporte()/wones.getValorWon());
				JOptionPane.showMessageDialog(null,String.valueOf(pesos.getImporte())+ "Pesos argentinos son: "+ formatearDivisa.format(wones.getWon())+"Won.");
			}
			int confirm = JOptionPane.showConfirmDialog(null, "Desea continuar utilizando el programa","Confirmar",JOptionPane.YES_NO_OPTION);
			if(confirm == JOptionPane.NO_OPTION ) {
			continuarPrograma = false;
			JOptionPane.showMessageDialog(null,"programa finalizado");
			}


	}
 }
}
