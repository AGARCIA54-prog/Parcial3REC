/**
 * Representa a un alumno con nombre y tres notas.
 */
public class Alumno {
    /** Nombre del alumno */
    private String nombre;
    /** Primera nota del alumno (0-10) */
    private double nota1;
    /** Segunda nota del alumno (0-10) */
    private double nota2;
    /** Tercera nota del alumno (0-10) */
    private double nota3;

    /**
     * Crea un nuevo alumno con nombre y tres notas.
     * @param n Nombre del alumno
     * @param n1 Nota 1 (0-10)
     * @param n2 Nota 2 (0-10)
     * @param n3 Nota 3 (0-10)
     */
    public Alumno(String n, double n1, double n2, double n3) {
        setNombre(n);
        setNota1(n1);
        setNota2(n2);
        setNota3(n3);
    }

    /**
     * Obtiene el nombre del alumno.
     * @return nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno.
     * @param nombre Nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la primera nota.
     * @return nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * Establece la primera nota (0-10).
     * @param nota1 Nota 1
     * @throws IllegalArgumentException si la nota no está entre 0 y 10
     */
    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            throw new IllegalArgumentException("Nota1 debe estar entre 0 y 10");
        }
    }

    /**
     * Obtiene la segunda nota.
     * @return nota2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * Establece la segunda nota (0-10).
     * @param nota2 Nota 2
     * @throws IllegalArgumentException si la nota no está entre 0 y 10
     */
    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            throw new IllegalArgumentException("Nota2 debe estar entre 0 y 10");
        }
    }

    /**
     * Obtiene la tercera nota.
     * @return nota3
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * Establece la tercera nota (0-10).
     * @param nota3 Nota 3
     * @throws IllegalArgumentException si la nota no está entre 0 y 10
     */
    public void setNota3(double nota3) {
        if (nota3 >= 0 && nota3 <= 10) {
            this.nota3 = nota3;
        } else {
            throw new IllegalArgumentException("Nota3 debe estar entre 0 y 10");
        }
    }

    /**
     * Calcula el promedio de las tres notas del alumno.
     * @return promedio de notas
     */
    public double promedio() {
        return (nota1 + nota2 + nota3) / 3;
    }
}