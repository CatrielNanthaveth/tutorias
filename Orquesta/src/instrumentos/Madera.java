package instrumentos;

public class Madera extends Viento{

	public Madera(String nombre, String desc) {
		super(nombre, desc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("*toca el instrumento de viento de madera*");
	}
	
	public void afinarManual() {
		// TODO Auto-generated method stub
		System.out.println("*afina instrumento de viento de madera de forma manual*");
	}

	public void afinarAuto() {
		// TODO Auto-generated method stub
		System.out.println("*afina instrumento de viento de madera de forma automática*");
	}

	@Override
	public void lustrar() {
		// TODO Auto-generated method stub
		System.out.println("*Lustra instrumento de viento de madera*");
	}

	
}
