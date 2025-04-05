package sistema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private String codMateria;
    private List<Materia> materiasCorrelativas;

    public Materia(String nombre, String codMateria) {
        this.nombre = nombre;
        this.codMateria = codMateria;
        this.materiasCorrelativas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(String codMateria) {
        this.codMateria = codMateria;
    }

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void agregarMateriasCorrelativas(Materia ... materiasCorrelativas)
    {
        Collections.addAll(this.materiasCorrelativas, materiasCorrelativas);
    }
}
