package Ej1;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", 220, 4);
        coche.mostrarInfo();
    }

    public static class Coche extends Vehiculo {
        private int numeroDePuertas;

        public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
            super(marca, velocidadMaxima);
            this.numeroDePuertas = numeroDePuertas;
        }

        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Número de puertas: " + numeroDePuertas);
        }
    }
}
