package divisas;

public class Won {
	
    private static final String SIMBOLO_WON_COREANO = "₩";
    private final Double valorWon = 0.29029;
	private Double importe;
	private Double won;
	public Won() {
		
	}
	
	public Won(Double importe, Double won) {
		this.importe = importe;
		this.won = won;
	}
	
	public Double getImporte() {
		return importe;
	}
	
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	
	public Double getWon() {
		return won;
	}
	
	public void setWon(Double won) {
		this.won = won;
	}
	
	public static String getSimboloWonCoreano() {
		return SIMBOLO_WON_COREANO;
	}
	
	public Double getValorWon() {
		return valorWon;
	}
	
	@Override
	public String toString() {
		return "Won [valorWon=" + valorWon + ", importe=" + importe + ", won=" + won + "]";
	}
	
	
}
