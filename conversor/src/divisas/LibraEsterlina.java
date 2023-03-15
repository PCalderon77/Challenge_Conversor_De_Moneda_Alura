package divisas;

public class LibraEsterlina {
	 private static final String SIMBOLO_LIBRA_ESTERLINA = "£";
	 private final Double valorLibra = 459.94;
	 private Double importe;
	 private Double libra;
	 
	public LibraEsterlina() {
		
	}

	public LibraEsterlina(Double importe, Double libra) {
		this.importe = importe;
		this.libra = libra;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public Double getLibra() {
		return libra;
	}

	public void setLibra(Double libra) {
		this.libra = libra;
	}

	public static String getSimboloLibraEsterlina() {
		return SIMBOLO_LIBRA_ESTERLINA;
	}

	public Double getValorLibra() {
		return valorLibra;
	}

	@Override
	public String toString() {
		return "LibraEsterlina [valorLibra=" + valorLibra + ", importe=" + importe + ", libra=" + libra + "]";
	}
	
	
	 
	
	 
}
