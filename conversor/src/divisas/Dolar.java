package divisas;

public class Dolar {
	
    private static final String SIMBOLO_DOLAR = "US$";
    private final Double valorDolar = 376.00;
    private Double importe;
    private Double dolar;
	
    public Dolar(Double importe, Double dolar) {
		this.importe = importe;
		this.dolar = dolar;
	}
    
    public Dolar() {
    	
    }

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public Double getDolar() {
		return dolar;
	}

	public void setDolar(Double dolar) {
		this.dolar = dolar;
	}

	public static String getSimboloDolar() {
		return SIMBOLO_DOLAR;
	}

	public Double getValorDolar() {
		return valorDolar;
	}

	@Override
	public String toString() {
		return "Dolar [valorDolar=" + valorDolar + ", importe=" + importe + ", dolar=" + dolar + "]";
	}
    
    
    
    
}
