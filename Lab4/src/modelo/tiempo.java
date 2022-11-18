package modelo;
import java.util.Random;

public class tiempo {
    int tiempo;
    Random random = new Random();

    int generarTiempo(){
        return tiempo = random.nextInt(50); //Generar un número aleatorio que simula una predicción de tiempo
    }
}
