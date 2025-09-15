package persona;

class Main{
    public static void main(String[] args) {
        Persona p1= new Persona("Raul",17);
        Empleado e1 = new Empleado("Alonso", 20, "Ninguno");

        System.out.println("Persona:");
        p1.mostrarDetalles();
        System.out.println("Empleado:");
        e1.mostrarDetalles();
    }
}
