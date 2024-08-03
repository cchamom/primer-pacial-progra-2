package gt.edu.miumg.Pasteleria;

public abstract class Postre {
    protected String nombre;
    protected String tamano;
    protected double precio;

    public Postre(String nombre, String tamano, double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }
    public  abstract  void  Preparar();

    public abstract void Servir();

    public abstract void agregarIngrediente(Relleno relleno);
}