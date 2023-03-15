package divisas;

public class Yen {
	private static final String SIMBOLO_YEN = "¥";
	private final Double valorYen= 2.7898;
    private Double importe;
    private Double yen;
    
	public Yen() {
		
	}

	public Yen(Double importe, Double yen) {
		this.importe = importe;
		this.yen = yen;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public Double getYen() {
		return yen;
	}

	public void setYen(Double yen) {
		this.yen = yen;
	}

	public static String getSimboloYen() {
		return SIMBOLO_YEN;
	}

	public Double getValorYen() {
		return valorYen;
	}

	@Override
	public String toString() {
		return "Yen [valorYen=" + valorYen + ", importe=" + importe + ", yen=" + yen + "]";
	}
	
	
    
    
    
}
