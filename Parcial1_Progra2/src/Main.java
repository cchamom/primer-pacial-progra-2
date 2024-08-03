import gt.edu.miumg.Pasteleria.*;

public class Main {

    public static void main(String[] args, Relleno cobertura) {

        Masa masa = new Masa("Trigo", 5);
        Relleno relleno = new Relleno("Chocolate", 2);
        Cobertura coberturaa = new Cobertura("Vainilla", 1);

        Postre pastel = new Pastel("Pastel de Fresa", "pequeño", 15.0, "Fresa");
        Postre cheesecake = new Cheesecake("Cheesecake de fresa", "mediano", 12.0, "Cheddar");
        Postre brownie = new Brownie("Brownie de Chocolate", "mediano", 6.0, "Oscuro");

        pastel.agregarIngrediente(masa);
        pastel.agregarIngrediente(relleno);
        pastel.agregarIngrediente(cobertura);

        cheesecake.agregarIngrediente(relleno);
        brownie.agregarIngrediente(coberturaa);

        Empleado empleado1 = new Empleado("Cristian", "Cocinero", 2500);
        Empleado empleado2 = new Empleado("Miguel", "Lavaplatos", 1800);

        Equipo equipo1 = new Equipo("Horno", "Apagado");
        Equipo equipo2 = new Equipo("Liquadora", "Encendida");

        Sucursal sucursal;
        sucursal = new Sucursal("Sucursal Jalapa", "Calle principal");

        sucursal.agregar_Empleado(empleado1);
        sucursal.agregar_Empleado(empleado2);

        sucursal.agregar_Ingrediente(masa);
        sucursal.agregar_Ingrediente(relleno);
        sucursal.agregar_Ingrediente(cobertura);

        sucursal.agregarEquipo(equipo1);
        sucursal.agregarEquipo(equipo2);

        sucursal.agregarEspecialidad(pastel);
        sucursal.agregarEspecialidad(cheesecake);
        sucursal.agregarEspecialidad(brownie);

        sucursal.mostrarInformacion();
    }
}
