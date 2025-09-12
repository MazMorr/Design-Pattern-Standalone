public class GeneradorReportes {
    private GestorNotas gestor;

    public GeneradorReportes() {
        this.gestor = GestorNotas.getInstancia();
    }

    public void generarReporteCompleto() {
        System.out.println("\n📊 === REPORTE COMPLETO ===");

        for (String alumno : gestor.getNotasAlumnos().keySet()) {
            Double[] notas = gestor.getNotasAlumnos().get(alumno);
            System.out.println("\nAlumno: " + alumno);
            for (int i = 0; i < notas.length; i++) {
                System.out.println(gestor.getMaterias()[i] + ": " + notas[i]);
            }
            System.out.println("Promedio: " + gestor.getPromedioAlumno(alumno));
        }
    }

    public void generarReporteMaterias() {
        System.out.println("\n📚 === PROMEDIOS POR MATERIA ===");
        String[] materias = gestor.getMaterias();
        for (int i = 0; i < materias.length; i++) {
            double promedio = gestor.getPromedioMateria(i);
            System.out.println(materias[i] + ": " + String.format("%.2f", promedio));
        }
    }
}