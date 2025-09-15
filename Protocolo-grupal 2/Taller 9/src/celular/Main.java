package celular;

class Main {
    public static void main(String[] args) {
        Celular c1 = new Celular("Nokia");

        // Error
        super.mostrarMarca();
    }
}
