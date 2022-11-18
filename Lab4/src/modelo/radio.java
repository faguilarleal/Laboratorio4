package modelo;

import java.util.ArrayList;
public class radio {

    private boolean encendido;                          // indica si la radio esta encendida(true)o apagada(false)
    private String modo;                                // indica si esta en modo radio, reproduccion o telefono

    private String frecuencia;                          // indica si es AM o FM
    private String emisoraR;                            // indica la emisora en reproduccion
    private ArrayList<String> emisoras;                 // arraylist de todas las emisoras
    private ArrayList<String> emisorasGuardadas;        // indica las emisoras guardadas
    private int volumen;                                // volumen de la radio

    private cancion[] cancionesGuardadas;      // lista de reproduccion
    private cancion cancionReprodiccion;                // cancion que se reproduce

    private boolean telefono;                           // indica si existe un telefono conectado
    private String[] contactos;                         // lista de contactos

    private String pronostico;                          // guarda el pronostico del tiempo

    // constructor
    radio(){
        this.encendido = false;
        this.modo = "radio";
    }

    // -------- general --------
    public void cambiarEstado(){
        if (encendido)
            this.encendido = false;
        else
            this.encendido = true;
    }

    public boolean getEstado(){
        return encendido;
    }

    public void cambiarModo(String nmodo){
        this.modo = nmodo;
    }

    public String getModo(){
        return modo;
    }

    // -------- MODO RADIO ----------

    // -------- MODO REPRODUCIR -------

    public void crearCanciones(){

    }

    // -------- MODO TELEFONO ---------

    // -------- MODO PRODUCTIVIDAD ------







}
