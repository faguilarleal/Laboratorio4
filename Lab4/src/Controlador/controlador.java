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
                    menuRadio();
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
/*
* "Elija una de las opciones siguientes: \n 1) Cambiar de AM a FM \n 2) Cambiar emisora " +
                "\n 3) Guardar emisora \n 4) Mostrar emisoras guardadas \n 5) Salir de modo radio ");
*
*
* */
    public void menuRadio(){
        v.mostrarMensaje(estadoRadio());
        r.cambiarModo("Radio");
        boolean bandera = true;
        while(bandera){
            switch(v.menuRadio()){
                case 1: // cambiar am a fm
                    break;
                case 2: // cambiar emisora
                    break;
                case 3: // guardar emisora
                    break;
                case 4: // mostrar emisoras guardadas
                    break;
                case 5: // salir de modo radio
                    bandera = false;
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
            if (r.getModo().equals("Radio")){
                mensaje += "\nEmisora: "; // agregar emisora
            } else if(r.getModo().equals("Reproduccion")){
                mensaje += "\nCancion: " ; // agregar atributos canciones
            } else if(r.getModo().equals("Telefono")){

            } else if(r.getModo().equals("Productividad")){

            }
        }else{
            mensaje += "Estado: apagado";
        }
        mensaje += "\n------------------------------";

        return mensaje;
    }






}
