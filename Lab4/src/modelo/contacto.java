package modelo;
import java.util.HashMap; // importar the HashMap class para diccionarios
import java.util.Scanner;


public class contacto {
    String nombre;
    int numero;
    Scanner sn = new Scanner(System.in);
    HashMap<String, Integer> contactos = new HashMap<String, Integer>(); //Hashmap a manera de diccionario, guarda un String y un enteros

    void agrContacto(){
        System.out.println("Ingresar nombre del contacto");
        nombre = sn.nextLine();
        System.out.println("Ingresar número del contacto");
        numero = sn.nextInt();
        //Añadir contacto a lista
        contactos.put(nombre, numero);
    }
    void MostrarContactos(){
        for (String i : contactos.keySet()) {
            System.out.println("Nombre: " + i + " Número: " + contactos.get(i)); //Imprime el hashmap entero
        }
    }
    void LlamarContacto(String nombreSel){
        System.out.println("Llamando a " + contactos.get(nombreSel) + "..."); //Llama a un contacto del hashmap
    }
    void FinalizarLLamada(String nombreSel){
        System.out.println("Llamada finalizada con " + contactos.get(nombreSel) + "..."); //Finaliza una llamada
    }
    void LlamadaEnEspera(String nombreSel){
        System.out.println("La llamada con " + contactos.get(nombreSel) + " está en espera"); //Pone una llamada en espera una llamada
        
    }


}
