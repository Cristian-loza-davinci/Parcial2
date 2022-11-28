package Logica;

public class Ventas {
	private int id_venta;
	private Cafes cafe;
	private int cantidad;
	private boolean tarjetaSocio;
	
	public Ventas(int i, Cafes cafe, int cantidad, boolean tarjetaSocio) {
		super();
		this.id_venta = i;
		this.cafe = cafe;
		this.cantidad = cantidad;
		this.tarjetaSocio = tarjetaSocio;
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
	@Override
	public String toString() {
		return "Ventas [id_venta=" + id_venta + ", cafe=" + cafe + ", cantidad=" + cantidad + ", tarjetaSocio="
				+ tarjetaSocio + "]";
	}
	
	
	
	

}
