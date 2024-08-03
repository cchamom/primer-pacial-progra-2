package gt.edu.miumg.Pasteleria;

public class Relleno implements  Ingrediente{
    private String sabor;
    private double cantidad;

    public  Relleno(String chocolate, double Cantidad){
        this.cantidad = Cantidad;
        String Sabor = "";
        this.sabor = Sabor;
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
