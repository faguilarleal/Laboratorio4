package Interfaces;

public interface iReproduccion {
    //para escoger la playlist que se quiere usar
    public String seleccionarListaReproduccion(String tipo);

    //para cambiar de cancion
    public String cambiarCancion();

    //ensena la cancion que se esta escuchando
    public String escucharCancion(int i);
}
