package gt.edu.miumg.Pasteleria;

public class Pastel extends  Postre {

    public Pastel(String nombre, String tamano, double precio, String sabor) {
        super(nombre, tamano, precio);
        System.out.println("Nombre, Tamanio, Precio");
    }

    @Override
    public void Preparar() {
        System.out.println("Preparando." +nombre);
    }

    @Override
    public void Servir() {
        System.out.println("Sirviendo."+nombre);
    }

}