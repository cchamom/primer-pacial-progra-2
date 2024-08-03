package gt.edu.miumg.Pasteleria;

public class Brownie extends  Postre {

    public Brownie(String nombre, String tamano, double precio, String tipoQueso) {
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