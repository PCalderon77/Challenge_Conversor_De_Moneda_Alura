package temperaturas;

public class Fahrenheit {

	private static final String SIMBOLO_FAHRENHEIT = "°F";
    private Double temperatura;
    private Double fahrenheit;
    
	public Fahrenheit() {

	}

	public Fahrenheit(Double temperatura, Double fahrenheit) {
		this.temperatura = temperatura;
		this.fahrenheit = fahrenheit;
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

	public Double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(Double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public static String getSimboloFahrenheit() {
		return SIMBOLO_FAHRENHEIT;
	}

	@Override
	public String toString() {
		return "Fahrenheit [temperatura=" + temperatura + ", fahrenheit=" + fahrenheit + "]";
	}
	
	
	
	
	
    
    
}
