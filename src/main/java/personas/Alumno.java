package personas;

import lombok.Getter;
import lombok.Setter;
import sistema.Materia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Alumno {

    private String nombre;
    private String apellido;
    private String legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void agregarMateriasAprobadas(Materia ... materiasAprobadas)
    {
        Collections.addAll(this.materiasAprobadas, materiasAprobadas);
    }
}
