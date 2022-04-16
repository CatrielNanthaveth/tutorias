package empresa;

public class Gerente extends Permanente {

	private double salario;
	private int horasTrabajadas;
	private double salarioFamiliar = 200;;
	private int antiguedad;
	private int hijos;
	private boolean casado;
	
	public Gerente(int hT, int antiguedad, int hijos, boolean casado) {
		super(hT, antiguedad, hijos, casado);
		
		if(casado) {
			this.salario = hT * 400 + antiguedad * 150 + salarioFamiliar * hijos + 100;
		} else this.salario = horasTrabajadas * 400 + antiguedad * 150 + salarioFamiliar * hijos;
	}

	@Override
	public double getSalario() {
		return this.salario;
	}
}
