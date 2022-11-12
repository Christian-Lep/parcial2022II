package uni.edu.pe.hospital;

import java.util.Objects;

public class Habitacion {
    private int planta;
    private int numero;

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habitacion that = (Habitacion) o;
        return planta == that.planta && numero == that.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(planta, numero);
    }

    @Override
    public String toString() {
        return "Habitacion [" + "plana=" + planta +
                ", numero=" + numero + "]";
    }

    public Habitacion(int plana, int numero) {
        this.planta = plana;
        this.numero = numero;
    }
    public int compareTo(Habitacion o) {
        int comparar = this.planta - o.getPlanta();
        if (comparar == 0){
            comparar = this.numero - o.getNumero();
        }
        return comparar;
    }

}
