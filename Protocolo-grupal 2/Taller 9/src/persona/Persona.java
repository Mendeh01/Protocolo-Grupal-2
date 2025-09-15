package persona;

public class Persona {
    String nombre;
    int edad;
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void mostrarDetalles(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}