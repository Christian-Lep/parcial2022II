package uni.edu.pe.hospital;

public class NacidoAntesDe implements Criterio{
    private int anio;

    public NacidoAntesDe(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumpleCondicion(Paciente p, Habitacion h) {
        if (p.getAnio() < anio){
            return true;
        }
        else return false;
    }
}
