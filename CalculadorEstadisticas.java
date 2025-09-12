public class CalculadorEstadisticas {
    private GestorNotas gestor;

    public CalculadorEstadisticas() {
        this.gestor = GestorNotas.getInstancia();
    }

    public void mostrarEstadisticas() {
        System.out.println("\n📈 === ESTADÍSTICAS ===");
        System.out.println("Total alumnos: " + gestor.getNotasAlumnos().size());

        String[] materias = gestor.getMaterias();
        for (int i = 0; i < materias.length; i++) {
            double promedio = gestor.getPromedioMateria(i);
            System.out.println("Promedio " + materias[i] + ": " + String.format("%.2f", promedio));
        }
    }
}
