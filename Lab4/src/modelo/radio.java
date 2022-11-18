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

    private String tipoReproduccion;                    // saber si es cd, mp3 o spotify
    private ArrayList<cancion> cancionesCD = new ArrayList<cancion>();        // lista de reproduccion
    private ArrayList<cancion> cancionsMP3 = new ArrayList<cancion>();
    private ArrayList<cancion> cancionesSpotify = new ArrayList<cancion>();
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
        // canciones CD (Folklore)
        cancionesCD.add(new cancion("cardigan", "Taylor Swift", "3:59"));
        cancionesCD.add(new cancion("my tears ricochet", "Taylor Swift", "4:15"));
        cancionesCD.add(new cancion("seven", "Taylor Swift", "3:28"));
        cancionesCD.add(new cancion("august", "Taylor Swift", "4:21"));
        cancionesCD.add(new cancion("mad woman", "Taylor Swift", "3:57"));

        // canciones MP3
        cancionsMP3.add(new cancion("Swing","Danny Ocean", "2:35"));
    }

    public void cambiarCancion(int indice){
       if (tipoReproduccion == "CD"){
           cancionReprodiccion = cancionesCD.get(indice);
       } else if (tipoReproduccion == "MP3"){
           cancionReprodiccion = cancionsMP3.get(indice);
       } else if (tipoReproduccion == "Spotify"){
           cancionReprodiccion = cancionesSpotify.get(indice);
       }
    }
    


    // -------- MODO TELEFONO ---------

    // -------- MODO PRODUCTIVIDAD ------







}
