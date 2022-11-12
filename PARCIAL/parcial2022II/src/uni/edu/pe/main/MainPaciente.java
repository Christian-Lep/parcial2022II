package uni.edu.pe.main;

import uni.edu.pe.hospital.HospitalException;
import uni.edu.pe.hospital.Paciente;

public class MainPaciente {

	public static void main(String[] args) {
		try {
			Paciente c1 = new Paciente("Abraham", "Lincoln", "6669444861", 1809);
			Paciente c2 = new Paciente("Adam", "Smith", "5186046392", 1723);
			Paciente c3 = new Paciente("Adam", "Smith", "5186046392", 1723);
			System.out.printf("%s %ses igual que %s\n", c1, c1.equals(c2) ? "" : "no ", c2);
			System.out.printf("%s %ses igual que %s\n", c2, c2.equals(c3) ? "" : "no ", c3);
			System.out.printf("%s %ses menor que %s\n", c1, c1.compareTo(c2) < 0 ? "" : "no ", c2);
			System.out.printf("%s %ses menor que %s\n", c2, c2.compareTo(c3) < 0 ? "" : "no ", c3);
			new Paciente("Adam", "Smith", "5186046391", 1723);
		} catch (HospitalException e) {
			e.printStackTrace();
		}
	}

}

/**
 * Expected output:
 * 
 * <pre>
 Paciente [nombre='Abraham', apellido='Lincoln', nuss='6669444861', anio=1809] no es igual que Paciente [nombre='Adam', apellido='Smith', nuss='5186046392', anio=1723]
 Paciente [nombre='Adam', apellido='Smith', nuss='5186046392', anio=1723] es igual que Paciente [nombre='Adam', apellido='Smith', nuss='5186046392', anio=1723]
 Paciente [nombre='Abraham', apellido='Lincoln', nuss='6669444861', anio=1809] no es menor que Paciente [nombre='Adam', apellido='Smith', nuss='5186046392', anio=1723]
 Paciente [nombre='Adam', apellido='Smith', nuss='5186046392', anio=1723] no es menor que Paciente [nombre='Adam', apellido='Smith', nuss='5186046392', anio=1723]
 uni.edu.pe.hospital.HospitalException: El hospital tuvo el siguiente error:  : El nuss ingresado no es valido
 at uni.edu.pe.hospital.Paciente.validaCampos(Paciente.java:32)
 at uni.edu.pe.hospital.Paciente.<init>(Paciente.java:12)
 at uni.edu.pe.main.MainPaciente.main(MainPaciente.java:17)
 * </pre>
 */