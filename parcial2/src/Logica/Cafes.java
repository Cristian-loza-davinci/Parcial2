package Logica;

public class Cafes {
	private String tipoCafe;
	private double precio;
	
	public Cafes(String tipoCafe, double precio) {
		super();
		this.tipoCafe = tipoCafe;
		this.precio = precio;
	}
	public String getTipoCafe() {
		return tipoCafe;
	}
	public void setTipoCafe(String tipoCafe) {
		this.tipoCafe = tipoCafe;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Cafes [tipoCafe=" + tipoCafe + ", precio=" + precio + "]";
	}
	
	
	

}
