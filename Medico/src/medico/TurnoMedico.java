package medico;

public class TurnoMedico {
	
	private String profesional;
	private String paciente;
	private ESTADO estado;
	private ESPECIALIDAD especialidadMedica;
	private DIAS diaSemana;
	
	public TurnoMedico(String pr, String pac, ESTADO est, ESPECIALIDAD esM, DIAS dia) {
		this.diaSemana = dia;
		this.especialidadMedica = esM;
		this.estado = est;
		this.paciente = pac;
		this.profesional = pr;
	}

	@Override
	public String toString() {
		return "TurnoMedico [profesional=" + profesional + ", paciente=" + paciente + ", estado=" + estado
				+ ", especialidadMedica=" + especialidadMedica + ", diaSemana=" + diaSemana + "]";
	}
	
	
}
