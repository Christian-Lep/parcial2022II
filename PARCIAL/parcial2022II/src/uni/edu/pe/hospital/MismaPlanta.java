package uni.edu.pe.hospital;

public class MismaPlanta implements Criterio{
    private int planta;

    public MismaPlanta(int planta) {
        this.planta = planta;
    }

    @Override
    public boolean cumpleCondicion(Paciente p, Habitacion h) {
        if (h.getPlanta() == planta){
            return true;
        }
        else return false;
    }
}
