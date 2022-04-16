package instrumentos;

public class Cuerda extends Instrumento implements Afinable{

	public Cuerda(String nombre, String desc) {
		super(nombre, desc);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("*toca el instrumento de cuerda*");
	}
	public void afinarManual() {
		System.out.println("*afina instrumento de cuerda de forma manual*");
	}
	public void afinarAuto() {
		System.out.println("*afina instrumento de cuerda de forma automatica*");
	}

}
