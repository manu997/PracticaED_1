public class Main {
    public static void main(String[] args) {
        Alumno al1 = new Alumno("Felipe Arias González", "aa1253", 3.5);
        Alumno al2 = new Alumno("Manuel García Sacedón", "ax0074", 8.35);
        Alumno al3 = new Alumno("Margarita López Medina", "mj7726", 7.70);
        Alumno al4 = new Alumno("Estela Sánchez Arellano", "bc2658", 6.75);

        al1.matricularAsignatura("Estructuras de Datos");
        al2.matricularAsignatura("Estructuras de Datos");
        al3.matricularAsignatura("Estructuras de Datos");
        al4.matricularAsignatura("Estructuras de Datos");

        al4.matricularAsignatura("Algebra");
        al4.matricularAsignatura("Estructuras de Computadores");

        al4.mostrarAsignaturas();

        al1.mostrarAlumno();
        al4.mostrarAlumno();
    }
}
