package instrumentos;

public class Percusion extends Instrumento implements Lustrable {

	public Percusion(String nombre, String desc) {
		super(nombre, desc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("*Toca instrumento de percusión*");
	}

	@Override
	public void lustrar() {
		// TODO Auto-generated method stub
		System.out.println("*Lustra instrumento de percusión*");
	}


}
