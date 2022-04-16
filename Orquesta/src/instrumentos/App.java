package instrumentos;

public class App {

	public static void main(String[] args) {
		Metal flauta = new Metal("flauta", "flauta q flautea");
		Madera flautaMadera = new Madera("flauta", "flauta q flautea pero de madera");
		Percusion triangulo = new Percusion("triangulo", "triangulo q triangulea");
		Cuerda guitarra = new Cuerda("guitarra", "son como las mujeres, nunca toqué una");
		
		Instrumento[] listita = {flauta, flautaMadera, triangulo, guitarra};
		
		Orquesta orquestita = new Orquesta(listita);
		
		System.out.println(guitarra.toString());
		
		System.out.println(orquestita.getListaInstrumentos().toString());
	}
}
