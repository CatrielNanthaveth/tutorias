package instrumentos;

import java.util.Arrays;

public class Orquesta {

	private Instrumento[] listaInstrumentos;
	
	public Orquesta(Instrumento[] listaIns) {
		this.listaInstrumentos = listaIns;
	}

	public Instrumento[] getListaInstrumentos() {
		return listaInstrumentos;
	}

	@Override
	public String toString() {
		return "Orquesta [listaInstrumentos=" + Arrays.toString(listaInstrumentos) + "]";
	}
	

	
}
