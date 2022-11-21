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
                    menuReproduccion();
                    break;
                case 5: // cambiar a modo telefono
                    menuTelefono();
                    break;
                case 6: // cambiar a modo productividad
                    r.cambiarModo("Productividad");
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
                case 5:
                    v.mostrarMensaje(ac.cargaremisora());
                    break;
                case 6: // salir de modo radio
                    bandera = false;
                    break;
            }
        }
    }

    /*
    * System.out.println("-------------- MODO REPRODUCCION --------------\n" +
                "Elija una de las opciones siguientes: \n 1) Colocar un CD \n 2) Canciones MP3 " +
                "\n 3) Conectar Spotify \n 4) Cambiar cancion " +
                " 5) Salir de modo reproduccion  ");*/

    public void menuReproduccion(){
        r.cambiarModo("Reproduccion");
        boolean bandera = true;
        ac.seleccionarListaReproduccion("Spotify");
        while(bandera){
            v.mostrarMensaje(estadoRadio());
            switch(v.menuReproduccion()){
                case 1: // colocar un CD
                    v.mostrarMensaje(ac.seleccionarListaReproduccion("CD"));
                    break;
                case 2: // MP3
                    v.mostrarMensaje(ac.seleccionarListaReproduccion("MP3"));
                    break;
                case 3: // Spotify
                    v.mostrarMensaje(ac.seleccionarListaReproduccion("Spotify"));
                    break;
                case 4: // cambiar cancion
                    v.mostrarMensaje(ac.escucharCancion(v.menuMostrarCanciones(r.getListaCanciones())));
                    break;
                case 5: // escuchar cancion
                    v.mostrarMensaje(ac.cambiarCancion());
                    break;
                case 6: // salir de modo reproduccion
                    bandera = false;
                    break;
            }
        }
    }

/*
 * System.out.println("-------------- MODO TELEFONO --------------\n" +
                "Elija una de las opciones siguientes: \n 1) Conectar/desconectar Telefono" +
                " \n 2) Mostrar contactos " +
                "\n 3) Llamar contactos \n 4) Finalizar llamada " +
                " 5) Cambiar llamada en espera  ");
 */
    public void menuTelefono(){
        r.cambiarModo("Telefono");
        boolean run  = true;
        while(run){

            v.mostrarMensaje(estadoRadio());
            switch(v.menuTelefono()){
                case 1: // Mostrar Contactos
                    v.mostrarMensaje(ac.MostrarContactos());
                    break;
                case 2: // Llamar Contacto
                    v.mostrarMensaje(ac.LlamarContacto());
                    break;
                case 3: // Modo Espera
                    v.mostrarMensaje(ac.PonerEnEspera());
                    break;
                case 4: // Finalizar Llamada
                    v.mostrarMensaje(ac.FinalizarLLamada()  );
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
                mensaje += "\n - Se esta reproduciendo "+r.getTipoReproduccion()+" -";
                mensaje += "\n Cancion: "+ v.MostraCancion(r.getCancionReprodiccion()) ;
            } else if(r.getModo().equals("Telefono")){
                mensaje += "\n Telefono conectado";
            } else if(r.getModo().equals("Productividad")){
                mensaje += "\n"+(ac.vertiempo());
            }
        }else{
            mensaje += "Estado: apagado";
        }
        mensaje += "\n------------------------------";

        return mensaje;
    }






}
