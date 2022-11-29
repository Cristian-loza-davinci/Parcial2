package Logica;

public class Ventas {
	private int id_venta;
	private Cafes cafe;
	private int cantidad;
	private boolean tarjetaSocio;
	private double montofinal;
	
	public Ventas(int id_venta, Cafes cafe, int cantidad, boolean tarjetaSocio, double montofinal) {
		super();
		this.id_venta = id_venta;
		this.cafe = cafe;
		this.cantidad = cantidad;
		this.tarjetaSocio = tarjetaSocio;
		this.montofinal = montofinal;
	}

	public int getId_venta() {
		return id_venta;
	}

	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}

	public Cafes getCafe() {
		return cafe;
	}

	public void setCafe(Cafes cafe) {
		this.cafe = cafe;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isTarjetaSocio() {
		return tarjetaSocio;
	}

	public void setTarjetaSocio(boolean tarjetaSocio) {
		this.tarjetaSocio = tarjetaSocio;
	}

	public double getMontofinal() {
		return montofinal;
	}

	public void setMontofinal(double montofinal) {
		this.montofinal = montofinal;
	}

	@Override
	public String toString() {
		return "Ventas [id_venta=" + id_venta + ", cafe=" + cafe + ", cantidad=" + cantidad + ", tarjetaSocio="
				+ tarjetaSocio + ", montofinal=" + montofinal + "]";
	}
	
	
	

	
	
	
	
	
	

}
