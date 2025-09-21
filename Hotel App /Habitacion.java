public class Habitacion {
    private int numero;
    private double precioPorNoche;
    private boolean ocupada;

    public Habitacion(int numero, double precioPorNoche) {
        this.numero = numero;
        this.precioPorNoche = precioPorNoche;
        this.ocupada = false;
    }

    public void mostrarInfo() {
        System.out.println("Habitación Nº: " + numero);
        System.out.println("Precio por noche: $" + precioPorNoche);
        System.out.println("Estado: " + (ocupada ? "Ocupada" : "Libre"));
    }

    public void reservar() {
        if (!ocupada) {
            ocupada = true;
            System.out.println("La habitación " + numero + " ha sido reservada.");
        } else {
            System.out.println("La habitación " + numero + " ya está ocupada.");
        }
    }

    public void liberar() {
        if (ocupada) {
            ocupada = false;
            System.out.println("La habitación " + numero + " ha sido liberada.");
        } else {
            System.out.println("La habitación " + numero + " ya estaba libre.");
        }
    }

    public double calcularCosto(int noches) {
        return precioPorNoche * noches;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}

