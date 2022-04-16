package empresa;

public class Temporal extends Empleado {
	
	private double salario;
	private int horasTrabajadas;
	private double salarioFamiliar = 200;
	private int hijos;
	private boolean casado;
	
	public Temporal(int hT, int hijos, boolean casado) {

		this.horasTrabajadas = hT;
		this.hijos = hijos;
		this.casado = casado;
	
		if(casado) {
			this.salario = horasTrabajadas * 200 + salarioFamiliar * hijos + 100; 
		} else 			this.salario = horasTrabajadas * 200 + salarioFamiliar * hijos;
	}

	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		return this.salario;
	}
}
