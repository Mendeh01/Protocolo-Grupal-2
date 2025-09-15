package animal;

class Pez extends Animal{
    String tipodeAgua;
    public Pez(String especie, String tipodeAgua ) {
        super(especie);
        this.tipodeAgua=tipodeAgua;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Tipo de agua: "+tipodeAgua);
    }
}+
