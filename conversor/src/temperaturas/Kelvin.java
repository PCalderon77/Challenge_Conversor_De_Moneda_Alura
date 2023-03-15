package temperaturas;

public class Kelvin {

	private static final String SIMBOLO_FAHRENHEIT = "K";
    private Double temperatura;
    private Double kelvin;
	public Kelvin() {
		
	}
	
	public Kelvin(Double temperatura, Double kelvin) {
		super();
		this.temperatura = temperatura;
		this.kelvin = kelvin;
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

	public Double getKelvin() {
		return kelvin;
	}

	public void setKelvin(Double kelvin) {
		this.kelvin = kelvin;
	}

	public static String getSimboloFahrenheit() {
		return SIMBOLO_FAHRENHEIT;
	}

	@Override
	public String toString() {
		return "Kelvin [temperatura=" + temperatura + ", kelvin=" + kelvin + "]";
	}
	
	
	
	
    
    
}
