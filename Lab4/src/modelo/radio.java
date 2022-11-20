package modelo;

import java.util.ArrayList;
public class radio{

    private boolean encendido;                          // indica si la radio esta encendida(true)o apagada(false)
    private String modo;                                // indica si esta en modo radio, reproduccion o telefono
    private int volumen;                                // volumen de la radio

    private boolean frecuencia;                          // indica si es AM o FM. Verdadero es AM Y Falso es FM
    private double emisoraR=80.5;                            // indica la emisora en reproduccion
 



    private ArrayList<String> emisorasGuardadas = new ArrayList<String>();        // indica las emisoras guardadas

    private int cont = 0;                                   //Contador de emisoras


    private String tipoReproduccion;                    // saber si es cd, mp3 o spotify
    private ArrayList<cancion> cancionesCD = new ArrayList<cancion>();        // lista de reproduccion
    private ArrayList<cancion> cancionsMP3 = new ArrayList<cancion>();
    private ArrayList<cancion> cancionesSpotify = new ArrayList<cancion>();
    private cancion cancionReprodiccion;                // cancion que se reproduce

    // modo telefono
    private boolean telefono;                           // indica si existe un telefono conectado
    private String[] contactos;                         // lista de contactos
    // modo productividad
    private String pronostico;                          // guarda el pronostico del tiempo

    // constructor
    public radio(){
        this.encendido = false;
        this.modo = "radio";
        crearCanciones();
    }

    // -------- general --------
    /**
     * funcion para cambiar el estado de la radio, apagar encender
     */
    public void cambiarEstado(){
        if (encendido)
            this.encendido = false;
        else
            this.encendido = true;
    }

    /**
     * funcion de cambiar el volumen
     * @param i indica si se sube (1) o baja (2) el volumen.
     */
    public void cambiarVolumen(int i){
        if (i == 1){
            volumen ++;
        }else{
            if (volumen != 0){
                volumen --;
            }
        }
    }

    public int getVolumen(){
        return volumen;
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
    public ArrayList<String> getEmisorasGuardadas() {
        return emisorasGuardadas;
    }
    public double getEmisoraR() {
        return emisoraR;
    }
    public String getFrecuencia(){
        String respuesta = "";
        if (frecuencia){
            respuesta = "AM";  
        }
        else {
            respuesta = "FM";
        }
        return respuesta;
    }

    /**
     * funcion para cambiar el estado de la frecuencia, AM o FM
     */
    public void cambiarFrecuencia(){
        if (frecuencia)
            this.frecuencia = false;
        else
            this.frecuencia = true;
    }
    public void cambiarEmisora(int i){
        if (i == 1){
            emisoraR +=0.5;
        }else{
            emisoraR -=0.5;
        }
    }
    /*
     * funcion para guardar una emisora 
     */
    public void guardarEmisora(){
       emisorasGuardadas.add(String.valueOf(emisoraR));
    }
    /*
     * funcion para cargar emisora
     */
    public double cargarEmisora(){
        cont = cont%emisorasGuardadas.size();
        emisoraR = Double.parseDouble(emisorasGuardadas.get(cont));
        cont++;
        return emisoraR;
    }

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
        cancionsMP3.add(new cancion("Te felicito","Shakira", "2:52"));
        cancionsMP3.add(new cancion("Antologia","Shakira", "4:14"));
        cancionsMP3.add(new cancion("Muerte en Hawaii","Calle 13", "3:10"));
        cancionsMP3.add(new cancion("Con altura","La Rosalia", "2:35"));

        // canciones Spotify
        cancionesSpotify.add(new cancion("Llamada perdida", "Morat","2:45"));
        cancionesSpotify.add(new cancion("Stand by me", "Oasis","5:56"));
        cancionesSpotify.add(new cancion("Vienna", "Billie Joel","3:34"));
        cancionesSpotify.add(new cancion("Something", "The Beatles","3:02"));

    }

    public cancion getCancionReprodiccion(){
        return cancionReprodiccion;
    }

    public void setTipoReproduccion(String tipo){
        tipoReproduccion = tipo;
        cambiarCancion(0);
    }

    public String getTipoReproduccion(){
        return tipoReproduccion;
    }

    /**
     * @return lista de canciones correspondientes al modo en el que este
     */
    public ArrayList<cancion> getListaCanciones(){
        ArrayList<cancion> respuesta = new ArrayList<cancion>();
        if (tipoReproduccion == "CD"){
            respuesta = cancionesCD;
        } else if (tipoReproduccion == "MP3"){
            respuesta = cancionsMP3;
        } else if (tipoReproduccion == "Spotify"){
            respuesta = cancionesSpotify;
        }
        return respuesta;
    }

    /**
     * @param indice, indica que cancion se escoge
     */
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
