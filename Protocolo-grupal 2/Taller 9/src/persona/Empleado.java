package persona;

class Empleado extends Persona{
    String departamento;
    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento=departamento;
    }
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Departamento: "+departamento);
    }
}
