package medico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TurnoMedico tm1 = new TurnoMedico("Catriel", "Lautaro", ESTADO.ACTIVO, 
											ESPECIALIDAD.MEDICO_CLINICO, DIAS.JUEVES);
		
		System.out.println(tm1.toString());
	}

}
