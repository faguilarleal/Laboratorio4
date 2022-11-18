package Vista;

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
                "\n 3) Guardar emisora \n 4) Mostrar emisoras guardadas \n 5) Salir de modo radio ");
        opi = sc.nextInt();
        return opi;
    }

    public int menuEmisora(){
        int opi;
        System.out.println("Elija una de las opciones siguientes: " +
                "\n 1) Cambiar emisora para arriba \n 2) Cambiar emisora para abajo");
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
                "\n 3) Conectar Spotify \n 4) Cambiar cancion " +
                " 5) Salir de modo reproduccion  ");
        opi = sc.nextInt();
        return opi;
    }

    public int menuTelefono(){
        int opi;
        System.out.println("-------------- MODO TELEFONO --------------\n" +
                "Elija una de las opciones siguientes: \n 1) Conectar/desconectar Telefono" +
                " \n 2) Mostrar contactos " +
                "\n 3) Llamar contactos \n 4) Finalizar llamada " +
                " 5) Cambiar llamada en espera  ");
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
