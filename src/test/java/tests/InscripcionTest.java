package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import personas.Alumno;
import sistema.Inscripcion;
import sistema.Materia;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    public void puedeCursar() {
        Alumno alumno = new Alumno("Axel", "Caputo", "2087108");

        Materia algoritmos = new Materia("Algoritmos", "123");
        Materia syo = new Materia("syo", "234");
        Materia discreta = new Materia("discreta", "345");

        alumno.agregarMateriasAprobadas(algoritmos, syo, discreta);

        Materia pdep = new Materia("pdep", "456");
        pdep.agregarMateriasCorrelativas(algoritmos, syo, discreta);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMateria(pdep);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void noPuedeCursar() {
        Alumno alumno = new Alumno("Axel", "Caputo", "2087108");

        Materia algoritmos = new Materia("Algoritmos", "123");
        Materia syo = new Materia("syo", "234");
        Materia discreta = new Materia("discreta", "345");

        alumno.agregarMateriasAprobadas(algoritmos, syo);

        Materia pdep = new Materia("pdep", "456");
        pdep.agregarMateriasCorrelativas(algoritmos, syo, discreta);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMateria(pdep);

        Assertions.assertFalse(inscripcion.aprobada());
    }
}