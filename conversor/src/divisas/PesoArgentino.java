package divisas;

public class PesoArgentino {
	private static final String SimboloPesoArgention = "$";
    private Double importe;
    private Double pesoArgentino;
    
    
    
	public PesoArgentino() {
		
	}
	
	
	
	public PesoArgentino(Double importe, Double pesoArgentino) {
		this.importe = importe;
		this.pesoArgentino = pesoArgentino;
	}



	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	public Double getPesoArgentino() {
		return pesoArgentino;
	}
	public void setPesoArgentino(Double pesoArgentino) {
		this.pesoArgentino = pesoArgentino;
	}
	public static String getSimbolopesoargention() {
		return SimboloPesoArgention;
	}



	@Override
	public String toString() {
		return "PesoArgentino [importe=" + importe + ", pesoArgentino=" + pesoArgentino + "]";
	}
    
	
    
}
