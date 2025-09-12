import java.util.HashMap;
import java.util.Map;

public class GestorNotas {
    private static GestorNotas instancia;
    private Map<String, Double[]> notasAlumnos; // [nota1, nota2, nota3]
    private String[] materias = { "Matemáticas", "Ciencias", "Historia" };

    private GestorNotas() {
        notasAlumnos = new HashMap<>();
        System.out.println("Gestor de notas inicializado");
    }

    public static GestorNotas getInstancia() {
        if (instancia == null) {
            instancia = new GestorNotas();
        }
        return instancia;
    }

    public void agregarAlumno(String nombre, double notaMat, double notaCien, double notaHist) {
        notasAlumnos.put(nombre, new Double[] { notaMat, notaCien, notaHist });
        System.out.println("👨‍🎓 Alumno " + nombre + " registrado");
    }

    public double getPromedioAlumno(String nombre) {
        Double[] notas = notasAlumnos.get(nombre);
        if (notas == null)
            return 0;

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public double getPromedioMateria(int indiceMateria) {
        double suma = 0;
        int count = 0;

        for (Double[] notas : notasAlumnos.values()) {
            suma += notas[indiceMateria];
            count++;
        }

        return count > 0 ? suma / count : 0;
    }

    public String[] getMaterias() {
        return materias;
    }

    public Map<String, Double[]> getNotasAlumnos() {
        return new HashMap<>(notasAlumnos);
    }
}
