public class Suite extends Habitacion {
    private boolean tieneJacuzzi;
    private boolean tieneVistaMar;

    public Suite(int numero, double precioPorNoche, boolean tieneJacuzzi, boolean tieneVistaMar) {
        super(numero, precioPorNoche);
        this.tieneJacuzzi = tieneJacuzzi;
        this.tieneVistaMar = tieneVistaMar;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Suite");
        System.out.println("Jacuzzi: " + (tieneJacuzzi ? "Sí" : "No"));
        System.out.println("Vista al mar: " + (tieneVistaMar ? "Sí" : "No"));
        System.out.println("----------------------------------");
    }
}
