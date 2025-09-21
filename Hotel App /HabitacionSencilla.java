public class HabitacionSencilla extends Habitacion {
    private int camasIndividuales;

    public HabitacionSencilla(int numero, double precioPorNoche, int camasIndividuales) {
        super(numero, precioPorNoche);
        this.camasIndividuales = camasIndividuales;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Sencilla");
        System.out.println("Camas individuales: " + camasIndividuales);
        System.out.println("----------------------------------");
    }
}

