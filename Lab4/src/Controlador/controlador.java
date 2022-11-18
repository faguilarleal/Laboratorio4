package Controlador;
import Vista.*;
import modelo.radio;

public class controlador {

    vista v = new vista();
    radio r = new radio();
    acciones ac = new acciones(r);



    public void empezar(){
        v.mostrarMensaje("\nBienvenido\n");
        boolean bandera = true;
        while(bandera){
            v.mostrarMensaje(estadoRadio());
            switch (v.menuInicial()){
                case 1: // enciende el radio y procede a mostrar opciones
                    ac.encenderApagar();
                    menuPrincipal();
                    break;
                case 2: // termina el programa
                    v.mostrarMensaje("Adios!");
                    bandera = false;
                    break;
            }
        }
    }

    public void menuPrincipal(){
        boolean bandera = true;
        while(bandera){
            v.mostrarMensaje(estadoRadio());
            switch (v.menuPrincipal()) {
                case 1: // apagar radio, se sale del menu
                    ac.encenderApagar();
                    bandera = false;
                    break;
                case 2: // cambiar volumen
                    ac.cambiarVolumen(v.menuVolumen());
                    break;
                case 3: // cambiar a modo radio
                    break;
                case 4: // cambiar a modo reproduccion
                    break;
                case 5: // cambiar a modo telefono
                    break;
                case 6: // cambiar a modo productividad
                    break;
            }
        }
    }

    /**
     * @return string del estado de la radio
     */
    public String estadoRadio(){
        String mensaje = "------------radio------------\n";
        if(r.getEstado()){
            mensaje += "Estado: encendido";
            mensaje += "\nVolumen: "+ r.getVolumen();
        }else{
            mensaje += "Estado: apagado";
        }
        mensaje += "\n------------------------------";

        return mensaje;
    }




}
