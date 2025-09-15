package animal;

public class Animal {
    String especie;
    public Animal(String especie){
        this.especie=especie;
    }
    public String getEspecie(){
        return especie;
    }
    public void  mostrarDatos(){
        System.out.println("La especie es: "+especie);
    }
}
