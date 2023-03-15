package temperaturas;

public class Celcius {
	private static final String SIMBOLO_CELCIUS = "°C";
    private Double temperatura;
    private Double celcius;
    
	public Celcius() {
		
	}

	public Celcius(Double temperatura, Double celcius) {
		this.temperatura = temperatura;
		this.celcius = celcius;
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

	public Double getCelcius() {
		return celcius;
	}

	public void setCelcius(Double celcius) {
		this.celcius = celcius;
	}

	public static String getSimboloCelcius() {
		return SIMBOLO_CELCIUS;
	}

	@Override
	public String toString() {
		return "Celcius [temperatura=" + temperatura + ", celcius=" + celcius + "]";
	}
	
	
    
	
    
}
