package sistema;

import personas.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Inscripcion {

    private Alumno alumnoSolicitante;
    private List<Materia> materias;

    public Inscripcion(Alumno alumnoSolicitante) {
        this.alumnoSolicitante = alumnoSolicitante;
        this.materias = new ArrayList<>();
    }

    public Alumno getAlumnoSolicitante() {
        return alumnoSolicitante;
    }

    public void setAlumnoSolicitante(Alumno alumnoSolicitante) {
        this.alumnoSolicitante = alumnoSolicitante;
    }

    public void agregarMateria(Materia ... materias)
    {
        Collections.addAll(this.materias, materias);
    }

    public Boolean aprobada() {
        List<Materia> materiasCorrelativas = this.materias.stream().flatMap(materia -> materia.getMateriasCorrelativas().stream()).collect(Collectors.toList());
        List<String> codMateriasCorrelativas = materiasCorrelativas.stream().map(materia -> materia.getCodMateria()).collect(Collectors.toList());
        List<String> codMateriasAprobadas = this.alumnoSolicitante.getMateriasAprobadas().stream().map(materia -> materia.getCodMateria()).collect(Collectors.toList());

        return codMateriasAprobadas.containsAll(codMateriasCorrelativas);
    }

}
