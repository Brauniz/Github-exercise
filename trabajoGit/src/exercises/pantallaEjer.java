package exercises;
public class pantallaEjer {

	public static void main(String[] args) {
		constructorTrabajador trabajador1 = new constructorTrabajador("Gabriel", "76283432G", 10500.34);
		constructorTrabajador trabajador2 = new constructorTrabajador("Clara", "25283432G", 1000.34);
		constructorTrabajador trabajador3 = new constructorTrabajador("Felix", "7628389H", 105056);
		constructorTrabajador trabajador4 = new constructorTrabajador("Gabriel", "76283432G", 10500.34);

		constructorEmpresa empresa1 = new constructorEmpresa("Indra", "748642380n", new constructorTrabajador[4]);
		
		empresa1.listaTrabajadores[0] = trabajador1;
		empresa1.listaTrabajadores[1] = trabajador2;
		empresa1.listaTrabajadores[2] = trabajador3;
		empresa1.listaTrabajadores[3] = trabajador4;
		
	constructorEmpresa empresa2 = new constructorEmpresa("Indra", "748642380n", new constructorTrabajador[4]);
		
		empresa2.listaTrabajadores[0] = trabajador1;
		empresa2.listaTrabajadores[1] = trabajador2;
		empresa2.listaTrabajadores[2] = trabajador3;
		empresa2.listaTrabajadores[3] = trabajador4;
		
	constructorEmpresa empresa3 = new constructorEmpresa("Indra", "7454380n", new constructorTrabajador[4]);
		
	constructorEmpresa[] arrayEmpresas = new constructorEmpresa[]{empresa1, empresa2, empresa3};

	}
}	