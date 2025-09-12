public class SistemaEscolar {
    public static void main(String[] args) {
        // Todas las clases acceden a la MISMA instancia del GestorNotas

        // 1. Configurar el gestor principal
        GestorNotas gestor = GestorNotas.getInstancia();

        // 2. Agregar alumnos
        gestor.agregarAlumno("Ana García", 8.5, 9.0, 7.5);
        gestor.agregarAlumno("Carlos López", 7.0, 8.5, 6.0);
        gestor.agregarAlumno("María Torres", 9.5, 9.0, 8.5);
        gestor.agregarAlumno("Juan Pérez", 6.5, 7.0, 8.0);

        // 3. Generar reportes (usa la misma instancia)
        GeneradorReportes reportes = new GeneradorReportes();
        reportes.generarReporteCompleto();
        reportes.generarReporteMaterias();

        // 4. Calcular estadísticas (usa la misma instancia)
        CalculadorEstadisticas stats = new CalculadorEstadisticas();
        stats.mostrarEstadisticas();

        // 5. Demostrar que es la misma instancia
        System.out.println("\n🔍 Demostración Singleton:");
        GestorNotas otraReferencia = GestorNotas.getInstancia();
        System.out.println("Misma instancia? " + (gestor == otraReferencia));
        System.out.println("Total alumnos desde otra referencia: " +
                otraReferencia.getNotasAlumnos().size());
    }
}
