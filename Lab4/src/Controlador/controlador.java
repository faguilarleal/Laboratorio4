package Controlador;
import Vista.*;
public class controlador {

    vista v = new vista();
    acciones ac = new acciones();

    public void empezar(){
        switch (v.menuInicial()){
            case 1:
                v.mostrarMensaje(ac.encenderApagar());
                break;
            case 2:
                v.mostrarMensaje("Adios!");
                break;
        }
    }
}
