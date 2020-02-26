public class GrupoAlumnos {
    private String nombre;
    private Alumno[] listaAlumnos;
    private int numAlumnos;
    private int maximo;

    public GrupoAlumnos() {
        this.nombre = "GrupoDesconocido";
        this.maximo = 10;
        this.listaAlumnos = new Alumno[maximo];
        this.numAlumnos = 0; 
    }

    public GrupoAlumnos(String nombre, int maximo) {
        this.nombre = nombre;
        this.maximo = maximo;
        this.listaAlumnos = new Alumno[maximo];
        this.numAlumnos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void insertarAlumno(Alumno alumno) {
        boolean arrayLleno = false;
        for(int i=0; i<listaAlumnos.length; i++) {
            if(listaAlumnos[i] == null) {
                arrayLleno = false;
            } else {
                arrayLleno = true;
            }
        }
        if(arrayLleno == true) {
            System.out.println("Se ha alcanzado el número máximo de alumnos en este grupo ("+getMaximo()+").");
        } else {
            for(int i=listaAlumnos.length-1; i>=0; i--) {
                if(i != 0) listaAlumnos[i] = listaAlumnos[i-1];
            }
            listaAlumnos[0] = alumno;
            System.out.println(true);
            numAlumnos++;
        }
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public Alumno getAlumno(int i) {
        if(listaAlumnos[i] != null) {
            return listaAlumnos[i];
        } else {
            return null;
        }
    }

    public void mostrarGrupo() {
        System.out.println("GRUPO " + getNombre()+": " + numAlumnos +" alumnos.");
        for(int i=0; i<numAlumnos; i++) {
            getAlumno(i).mostrarAlumno();
        }
    }

    public double mediaCalif() {
        if(numAlumnos != 0) {
            double media, suma = 0;
            for(int i=0; i<numAlumnos; i++) {
                suma += getAlumno(i).getCalificacion();
            }
            return media = suma / numAlumnos;
        } else {
            return -1;
        }
    }

    public Alumno mejorAlumno() {
        Alumno mejorNota;

        mejorNota = listaAlumnos[0];
        for(int i=1; i<numAlumnos; i++) {
            if(listaAlumnos[i].getCalificacion() > mejorNota.getCalificacion()) {
                mejorNota = listaAlumnos[i];
            }
        }
        return mejorNota;
    }

    public void eliminarAlumno(String nombre) {
        Alumno[] auxArr = new Alumno[maximo];
        for (int i=0; i<numAlumnos; i++) {
            if(listaAlumnos[i].getNombre() != nombre) {
                auxArr[i] = listaAlumnos[i];
            }
        }
        numAlumnos--;
        for (int i=0; i<numAlumnos; i++) {
            listaAlumnos[i] = auxArr[i];
        }
    }
}
