package empresa;

public class Empresa {

	private Empleado[] empleados;
	private int cuit;
	private String razonSocial;
	
	public Empresa(Empleado[] empleados, int cuit, String razonSocial) {
		this.empleados = empleados;
		this.cuit = cuit;
		this.razonSocial = razonSocial;
	}
	
	public Double montoTotal() {
		
		double montoTotal = 0;
		
		for(Empleado i : empleados) {
			montoTotal += i.getSalario();
		}
		
		return montoTotal;
	}
}
