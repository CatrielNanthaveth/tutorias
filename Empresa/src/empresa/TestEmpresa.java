package empresa;

public class TestEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Temporal t1 = new Temporal(80, 0, true);
		Permanente t2 = new Permanente(80, 6, 2, true);
		Permanente t3 = new Permanente(160, 4, 0, false);
		Gerente t4 = new Gerente(160, 10, 1, true);
		
		Empleado[] empleados = {t1, t2, t3, t4};
		
		Empresa em1 = new Empresa(empleados, 2000000, "SA");
		
		System.out.println(em1.montoTotal());
		
	}

}
