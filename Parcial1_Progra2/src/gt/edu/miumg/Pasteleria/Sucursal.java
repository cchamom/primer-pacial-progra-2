package gt.edu.miumg.Pasteleria;

import java.util.ArrayList;
import java.util.List;

public abstract class Sucursal {
    private static String Nombre;
    private static String Direccion;

    protected Sucursal(String direccion,String nombre) {
        Sucursal.Nombre = nombre;
        Sucursal.Direccion = direccion;
    }

    public abstract void Agregar_Empleado(Empleado empleado);
    public abstract void Agregar_Equipo(Equipo equipo);
    public abstract void Agregar_Ingrediente(Postre postre);
    public abstract void Agregar_Especialidad();


    public void agregar_Empleado(Empleado empleado1) {
    }

    public void agregar_Ingrediente(Masa masa) {
    }

    public void agregarEquipo(Equipo equipo1) {
    }

    public void agregarEspecialidad(Pastel crepa) {
    }

    public void mostrarInformacion() {

    }
}