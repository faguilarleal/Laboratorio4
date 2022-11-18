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
}
