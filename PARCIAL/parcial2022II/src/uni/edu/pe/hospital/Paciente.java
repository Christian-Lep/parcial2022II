package uni.edu.pe.hospital;

import java.util.Objects;
import java.util.Comparator;

public class Paciente {
    private String nombre;
    private String apellido;
    private String nuss;
    private int anio;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNuss() {
        return nuss;
    }

    public int getAnio() {
        return anio;
    }

    public Paciente(String nombre, String apellido, String nuss, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nuss = nuss;
        this.anio = anio;
        validaCampos(nombre,apellido,nuss,anio);
        ;

    }

    public void validaCampos(String nombre, String apellido, String nuss, int anio){
        if (nombre.equals(null)){
            throw new HospitalException("No puede haber campos vacios");
        }
        if (apellido.equals(null)){
            throw new HospitalException("No puede haber campos vacios");
        }
        if (anio <= 0){
            throw new HospitalException("No puede haber campos vacios");
        }
        if (nombre.equals(null)){
            throw new HospitalException("No puede haber campos vacios");
        }
        if (apellido.equals(null)){
            throw new HospitalException("No puede haber campos vacios");
        }
        if (anio <= 0){
            throw new HospitalException("No puede haber campos vacios");
        }
        int intnuss = Integer.parseInt(nuss);
        int a = intnuss % 100;
        int b = (intnuss/100)/97 + a*100;
        if (intnuss != b){
            throw new HospitalException("El nuss ingresado no es valido");
        }
    }

    @Override
    public String toString() {
        return "Paciente [" + "nombre=" + nombre + ", apellido=" + apellido +
                 ", nuss=" + nuss + ", anio=" + anio + "]";
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return anio == paciente.anio && Objects.equals(nombre, paciente.nombre) && Objects.equals(apellido, paciente.apellido) && Objects.equals(nuss, paciente.nuss);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, nuss, anio);
    }


    public int compareTo(Paciente o) {
        int comparar = this.anio - o.getAnio();
        if (comparar >= 0){
            comparar = 1;
        }
        else comparar = -1;
        return comparar;
    }
}
