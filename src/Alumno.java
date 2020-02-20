public class Alumno {
    private String nombre, matricula;
    private double calificacion;
    private int numAsigs;
    private String[] asignaturas;

    public Alumno() {
        nombre = "";
        matricula = "";
        calificacion = 0;
        numAsigs = 0;
        asignaturas = new String[5];
    }

    public Alumno(String nombre, String matricula, double calificacion) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion = calificacion;
        numAsigs = 0;
        asignaturas = new String[5];
    }

    public String getNombre() {
        return nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public int getNumAsigs() {
        for(int i=0; i<asignaturas.length; i++) {
            if(asignaturas[i] != null) {
                numAsigs++;
            }
        }
        return numAsigs;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void matricularAsignatura(String asignatura) {
        boolean arrayLleno = false;
        for(int i=0; i<asignaturas.length; i++) {
            if(asignaturas[i] == null) {
                arrayLleno = false;
            } else {
                arrayLleno = true;
            }
        }
        if(arrayLleno == true) {
            System.out.println("Se ha alcanzado el número máximo de asignaturas matriculadas (5).");
        } else {
            for(int i=asignaturas.length-1; i>=0; i--) {
                if(i != 0) asignaturas[i] = asignaturas[i-1];
            }
            asignaturas[0] = asignatura;
        }
    }

    public void mostrarAsignaturas() {
        boolean sinAsignaturas = true;
        for(int i=0; i<asignaturas.length; i++) {
            if(asignaturas[i] != null) {
                sinAsignaturas = false;
            }
        }
        if(sinAsignaturas == false) {
            System.out.println(getNumAsigs() + " asignaturas:");
            for(int i=0; i<asignaturas.length; i++) {
                if(asignaturas[i] != null) {
                    System.out.println("- " + asignaturas[i]);
                }
            }
        } else {
            System.out.println("No hay asignaturas matriculadas.");
        }
        System.out.println();
    }

    public void mostrarAlumno(){
        System.out.println(getNombre() + ". Matr:" + matricula + " ("+ getCalificacion()+").");
        mostrarAsignaturas();
    }
}
