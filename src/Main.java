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

        GrupoAlumnos gal = new GrupoAlumnos("GX11", 20);
        gal.insertarAlumno(al1);
        gal.insertarAlumno(al2);
        gal.insertarAlumno(al3);
        gal.insertarAlumno(al4);

        gal.mostrarGrupo();
        System.out.println(gal.getAlumno(1));

        System.out.println("La media del grupo es de " + gal.mediaCalif());

        System.out.println(gal.mejorAlumno().getNombre() + " tiene la mejor nota de su grupo.");
    }
}
