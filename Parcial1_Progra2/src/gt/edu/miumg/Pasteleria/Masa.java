package gt.edu.miumg.Pasteleria;

public class Masa implements Ingrediente {
    private String Tipo;
    private  double Cantidad;

    public  Masa(String Tipo, double Cantidad){
        this.Tipo = Tipo;
        this.Cantidad = Cantidad;
    }

    @Override
    public  String Obtener_Nombre(){
        System.out.println("Nombre de grano a prepar");
        return "nombre";
    }

    @Override
    public  double Obtener_Cantidad(){
        System.out.println("Cantidad de granos");
        return 0;
    }

}