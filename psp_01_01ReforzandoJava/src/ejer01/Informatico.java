package ejer01;

public final class Informatico extends Trabajador {

	private int horasGuardias;
	private double precioGuardia;
	private int sueldoBase;
	
	private final int PAGAS = 14;
	/**
	 * @param nombre
	 * @param puesto
	 * @param direccion
	 * @param telefono
	 * @param nSS
	 */
	public Informatico(String nombre, String puesto, String direccion, String telefono, String nSS, int horasGuardias, double precioGuardia, int sueldoBase) {
		super(nombre, puesto, direccion, telefono, nSS);
		this.horasGuardias = horasGuardias;
		this.precioGuardia = precioGuardia;
		this.sueldoBase = sueldoBase;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the horasGuardias
	 */
	public int getHorasGuardias() {
		return horasGuardias;
	}
	/**
	 * @param horasGuardias the horasGuardias to set
	 */
	public void setHorasGuardias(int horasGuardias) {
		this.horasGuardias = horasGuardias;
	}
	/**
	 * @return the precioGuardia
	 */
	public double getPrecioGuardia() {
		return precioGuardia;
	}
	/**
	 * @param precioGuardia the precioGuardia to set
	 */
	public void setPrecioGuardia(double precioGuardia) {
		this.precioGuardia = precioGuardia;
	}
	/**
	 * @return the sueldoBase
	 */
	public int getSueldoBase() {
		return sueldoBase;
	}
	/**
	 * @param sueldoBase the sueldoBase to set
	 */
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public double calcularPaga() {
		return (this.sueldoBase+(this.horasGuardias*this.precioGuardia))/PAGAS;
	}
	@Override
	public String toString() {
		return "Informatico [horasGuardias=" + horasGuardias + ", precioGuardia=" + precioGuardia + ", sueldoBase="
				+ sueldoBase + ", PAGAS=" + PAGAS + ", calcularPaga()=" + calcularPaga() + ", "
				+ (getNombre() != null ? "getNombre()=" + getNombre() + ", " : "")
				+ (getPuesto() != null ? "getPuesto()=" + getPuesto() + ", " : "")
				+ (getDireccion() != null ? "getDireccion()=" + getDireccion() + ", " : "")
				+ (getTelefono() != null ? "getTelefono()=" + getTelefono() + ", " : "")
				+ (getnSS() != null ? "getnSS()=" + getnSS() : "") + "]";
	}

}
