package uni.edu.pe.hospital;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Hospital {
    private String nombre;
    private int plantas;
    private int habPlanta;
    Map<Paciente, Habitacion> habitciones = new TreeMap<>();
    Set<Habitacion> libres = new TreeSet<>();

    public String getNombre() {
        return nombre;
    }

    public int getPlantas() {
        return plantas;
    }

    public int getHabPlanta() {
        return habPlanta;
    }

    public Map<Paciente, Habitacion> getHabitciones() {
        return habitciones;
    }

    public Set<Habitacion> getLibres() {
        return libres;
    }

    public Hospital(String nombre, int plantas, int habPlanta) {
        this.nombre = nombre;
        this.plantas = plantas;
        this.habPlanta = habPlanta;
        validaCampos(nombre, plantas, habPlanta);


    }

    public void validaCampos(String nombre, int plantas, int habPlanta){
        if (nombre.equals(null)){
            throw new HospitalException("No se encentra nombre");
        }
        if (plantas < 0){
            throw new HospitalException("El numero de plantas no puede ser negativo");
        }
        if (habPlanta < 0){
            throw new HospitalException("El numero de habitaciones de plantas no puede ser negativo");
        }
    }

    public void alta(Paciente p){

    }

    public void baja(String nuss){
        habitciones.keySet()
    }

    public Paciente[] seleccion(Criterio c){

    }

    public void leePacientes(String relacionPacientes){

    }

    @Override
    public String toString() {
        return "Hospital [" +
                "nombre=<" + nombre + '\'' +
                ">, pacientes=<" + habitciones.toString() +
                ">, libres=<" + libres.toString() + ">]";
    }
}
