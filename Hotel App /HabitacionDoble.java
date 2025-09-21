package hotel;
public class HabitacionDoble extends Habitacion {
    private int camasDobles;

    public HabitacionDoble(int numero, double precioPorNoche, int camasDobles) {
        super(numero, precioPorNoche);
        this.camasDobles = camasDobles;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Doble");
        System.out.println("Camas dobles: " + camasDobles);
        System.out.println("----------------------------------");
    }
}

