package empresa;

public class Permanente extends Empleado {

	private double salario;
	private int horasTrabajadas;
	private double salarioFamiliar = 200;
	private int antiguedad;
	private int hijos;
	private boolean casado;
	
	public Permanente(int hT, int antiguedad, int hijos, boolean casado) {

		this.horasTrabajadas = hT;
		this.hijos = hijos;
		this.antiguedad = antiguedad;
		this.casado = casado;
		
		if(casado) {
			this.salario = horasTrabajadas * 300 + antiguedad * 100 + salarioFamiliar * hijos + 100;
		} else this.salario = horasTrabajadas * 300 + antiguedad * 100 + salarioFamiliar * hijos;
	}

	@Override
	public double getSalario() {
		
		return this.salario;
	}
}
