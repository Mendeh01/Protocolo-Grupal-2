package Ej4;

public class Coche extends Vehiculo {
    public Coche(String marca) {
        super(marca);
    }

    public void mostrarMarca() {
        //tiene acceso privado en Vehiculo
        // System.out.println(marca);
    }
}
