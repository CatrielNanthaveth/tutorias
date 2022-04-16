package empresa;

public abstract class Empleado {

	private double salario;
	private int horasTrabajadas;
	private double salarioFamiliar = 200;
	private int hijos;
	private boolean casado;
	
	public abstract double getSalario();
	
}
