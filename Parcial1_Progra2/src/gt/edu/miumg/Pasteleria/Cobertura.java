package gt.edu.miumg.Pasteleria;

public class Cobertura implements  Ingrediente{
    private String sabor;
    private double cantidad;

    public  Cobertura(double Cantidad, String Sabor){
        this.cantidad = Cantidad;
        this.sabor = Sabor;
    }

    public Cobertura(String vainilla, int i) {
    }

    @Override
    public String Obtener_Nombre(){
        return  "Agua";
    }

    @Override
    public double Obtener_Cantidad(){
        return  cantidad;
    }
}