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
                    menuTelefono();
                    break;
                case 6: // cambiar a modo productividad
                    ac.vertiempo();
                    break;
            }
        }
    }

/*
* "Elija una de las opciones siguientes: \n 1) Cambiar de AM a FM \n 2) Cambiar emisora " +
                "\n 3) Guardar emisora \n 4) Mostrar emisoras guardadas \n 5) Salir de modo radio ");
* */
    public void menuRadio(){
        r.cambiarModo("Radio");
        
        boolean bandera = true;
        while(bandera){
            v.mostrarMensaje(estadoRadio());
            switch(v.menuRadio()){
                case 1: // cambiar am a fm
                v.mostrarMensaje(ac.cambiarbanda());
                    break;
                case 2: // cambiar emisora
                v.mostrarMensaje(ac.cambiaremisoras(v.cambioEmisora()));
                    break;
                case 3: // guardar emisora
                v.mostrarMensaje(ac.guardaremisora());
                    break;
                case 4: // mostrar emisoras guardadas
                v.mostrarMensaje(r.getEmisorasGuardadas().toString());
                    break;
                case 5: // salir de modo radio
                    bandera = false;
                    break;
            }
        }
    }

/*
 * Menu para el modo teléfono del radio
 */
    public void menuTelefono(){
        boolean run  = true;
        while(run){
            v.mostrarMensaje(estadoRadio());
            switch(v.menuTelefono()){
                case 1: // Mostrar Contactos
                    ac.MostrarContactos();
                    break;
                case 2: // Llamar Contacto
                    ac.LlamarContacto();
                    break;
                case 3: // Modo Espera
                    ac.PonerEnEspera();
                    break;
                case 4: // Finalizar Llamada
                    ac.FinalizarLLamada();
                    break;
                case 5: // salir de modo radio
                    run = false;
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
                mensaje += "\nEmisora: "+r.getEmisoraR(); 
                mensaje +="\nFrecuencia: "+r.getFrecuencia();
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
