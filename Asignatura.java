/**
 * Clase que representa una asignatura y gestiona una lista de alumnos.
 */
import java.util.ArrayList;

public class Asignatura {
    /** Lista de alumnos inscritos en la asignatura */
    private ArrayList<Alumno> lista = new ArrayList<>();

    /**
     * Da de alta un nuevo alumno en la asignatura.
     * @param nombre Nombre del alumno
     * @param n1 Nota 1 (0-10)
     * @param n2 Nota 2 (0-10)
     * @param n3 Nota 3 (0-10)
     */
    public void altaAlumno(String nombre, double n1, double n2, double n3) {
        Alumno a = new Alumno(nombre, n1, n2, n3);
        lista.add(a);
    }

    /**
     * Muestra el listado de alumnos con sus notas y promedio.
     */
    public void mostrarAlumnos() {
        System.out.println(Mensajes.ENCABEZADO);
        System.out.println(Mensajes.SEPARADOR);
        for (Alumno a : lista) {
            System.out.println(a.getNombre() + "\t" +
                String.format("%.1f", a.getNota1()) + "\t" +
                String.format("%.1f", a.getNota2()) + "\t" +
                String.format("%.1f", a.getNota3()) + "\t" +
                String.format("%.1f", a.promedio()));
        }
    }

    /**
     * Calcula la nota media del grupo de alumnos.
     * @return Nota media del grupo
     */
    public double promedioGeneral() {
        double suma = 0;
        for (Alumno a : lista) {
            suma += a.promedio();
        }
        return lista.size() > 0 ? suma / lista.size() : 0;
    }
}
