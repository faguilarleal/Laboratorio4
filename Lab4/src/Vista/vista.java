package Vista;

import modelo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class vista {
    Scanner sc = new Scanner(System.in);

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public int menuInicial(){
        int opi;
        System.out.println("Elija una de las opciones siguientes: \n 1) Encender Radio \n 2) Salir");
        opi = sc.nextInt();
        return opi;
    }

    public int menuPrincipal(){
        int opi;
        System.out.println("Elija una de las opciones siguientes: \n 1) Apagar Radio \n 2) Cambiar Volumen " +
                "\n 3) Modo Radio \n 4) Modo Reproduccion \n 5) Modo telefono \n 6) Modo productividad");
        opi = sc.nextInt();
        return opi;
    }

    public int menuVolumen(){
        int opi;
        System.out.println("Elija una de las opciones siguientes: " +
                "\n 1) Subir Volumen \n 2) Bajar Volumen");
        opi = sc.nextInt();
        return opi;
    }

    public int menuRadio(){
        int opi;
        System.out.println("-------------- MODO RADIO --------------\n" +
                "Elija una de las opciones siguientes: \n 1) Cambiar de AM a FM \n 2) Cambiar emisora " +
                "\n 3) Guardar emisora \n 4) Mostrar emisoras guardadas \n 5) Cargar emisora guardada" +
                " \n 6) Salir de modo radio ");
        opi = sc.nextInt();
        return opi;
    }

    public int cambioEmisora(){
        int opi;
        System.out.println("Elija una de las opciones siguientes: \n 1) Siguiente emisora \n 2) Emisora anterior");
        opi = sc.nextInt();
        return opi;
    }

    public int menuReproduccion(){
        int opi;
        System.out.println("-------------- MODO REPRODUCCION --------------\n" +
                "Elija una de las opciones siguientes: \n 1) Colocar un CD \n 2) Canciones MP3 " +
                "\n 3) Conectar Spotify \n 4) Escuchar cancion " +
                "\n 5) Siguiente cancion \n 6) Salir de modo reproduccion" );
        opi = sc.nextInt();
        return opi;
    }

    public int menuMostrarCanciones(ArrayList<cancion> can){
        int opi;
        System.out.println("Elija la cancion que desee reproducir: ");
        for (int i = 0; i < can.size() ; i++) {
            System.out.println((i+1)+") "+MostraCancion(can.get(i)));
        }
        opi = sc.nextInt();
        return opi-1;
    }

    public String MostraCancion(cancion c){
        String r = "Nombre: "+ c.getNombre()+", Autor: "+c.getAutor()+ ", Duracion: "+ c.getDuracion();
        return r;
    }

    public int menuTelefono(){
        int opi;
        System.out.println("-------------- MODO TELEFONO --------------\n" +
                "Elija una de las opciones siguientes:  "+
                " \n 1) Mostrar contactos " +
                "\n 2) Llamar contactos \n 3) Cambiar llamada en espera  " +
                "\n 4) Finalizar llamada\n 5) Salir de modo telefono ");
        opi = sc.nextInt();
        return opi;
    }

    public int menuProductividad(){
        int opi;
        System.out.println("-------------- MODO PRODUCTIVIDAD --------------\n" +
                "Elija una de las opciones siguientes: \n 1) Ver pronostico del tiempo \n 2) Salir de modo productividad");
        opi = sc.nextInt();
        return opi;
    }



}
