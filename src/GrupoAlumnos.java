public class GrupoAlumnos {
    private String nombre;
    private Alumno[] listaAlumnos;
    private int numAlumnos;
    private int maximo;

    public GrupoAlumnos() {
        this.nombre = "GrupoDesconocido";
        this.listaAlumnos = new Alumno[maximo];
        this.numAlumnos = 0; 
        this.maximo = 10;
    }
}
