package instrumentos;

public class Metal extends Viento{

	public Metal(String nombre, String desc) {
		super(nombre, desc);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("*toca el instrumento de viento de metal*");
	}


	public void afinarManual() {
		// TODO Auto-generated method stub
		System.out.println("*afina instrumento de viento de metal de forma manual*");
	}

	public void afinarAuto() {
		// TODO Auto-generated method stub
		System.out.println("*afina instrumento de viento de metal de forma automática*");
	}


	@Override
	public void lustrar() {
		// TODO Auto-generated method stub
		System.out.println("*Lustra instrumento de viento de metal*");
	}

}
