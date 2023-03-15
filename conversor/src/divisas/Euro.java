package divisas;

public class Euro {
	private static final String SIMBOLO_EURO = "€";
	private final Double valorEuro = 429.78;
    private Double importe;
    private Double euro;
    
	public Euro() {
		
	}

	public Euro(Double importe, Double euro) {
		this.importe = importe;
		this.euro = euro;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public Double getEuro() {
		return euro;
	}

	public void setEuro(Double euro) {
		this.euro = euro;
	}

	public static String getSimboloEuro() {
		return SIMBOLO_EURO;
	}

	public Double getValorEuro() {
		return valorEuro;
	}

	@Override
	public String toString() {
		return "Euro [valorEuro=" + valorEuro + ", importe=" + importe + ", euro=" + euro + "]";
	}
	
	
	
	
    
    
}
