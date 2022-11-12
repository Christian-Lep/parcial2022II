package uni.edu.pe.hospital;

public class HospitalException extends RuntimeException {

    private static String mensaje = "El error a ocurrido por ";

    public HospitalException(String motivo) {
        super(mensaje + " : " + motivo);
    }

    public HospitalException() {
        super(mensaje);
    }
}
