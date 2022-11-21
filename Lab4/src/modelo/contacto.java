package modelo;
import java.util.HashMap; // importar the HashMap class para diccionarios
import java.util.Scanner;


public class contacto {
    HashMap<String, Integer> contactos = new HashMap<String, Integer>(); //Hashmap a manera de diccionario, guarda un String y un enteros

    public contacto() {
        agrContacto();
    }

    public void agrContacto(){

        //Contactos pre-definidos.
        contactos.put("Juan Pablo Solís", 78951234);
        contactos.put("Esteban Zamorano", 68741125);
        contactos.put("César Monroy", 74569823);
        contactos.put("Adrián Recinos", 96784425);

    }
    public String MostrarContactos(){
        String mensaje = "";
        for (String i : contactos.keySet()) {
             mensaje += ("\nNombre: " + i + ", Número: " + contactos.get(i)); //Imprime el hashmap entero
        }
        return mensaje;
    }
     public String LlamarContacto(String nombreSel){
        String mensaje = ("Llamando a " + contactos.get(nombreSel) + "..."); //Llama a un contacto del hashmap
        return mensaje;
    }
    public String FinalizarLLamada(String nombreSel){
        String mensaje=("Llamada finalizada con " + contactos.get(nombreSel) + "..."); //Finaliza una llamada
        return mensaje;
    }
    public String LlamadaEnEspera(String nombreSel){
        String mensaje =("La llamada con " + contactos.get(nombreSel) + " está en espera"); //Pone una llamada en espera una llamada
        return mensaje;
    }


}
