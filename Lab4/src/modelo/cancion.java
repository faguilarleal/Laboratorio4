package modelo;

public class cancion {

    String nombre;
    String autor;
    String duracion;

    cancion(String nombre, String autor, String duracion){
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;
    }

    public String getNombre(){
        return nombre;
    }

    public String getAutor(){
        return autor;
    }

    public String getDuracion(){
        return duracion;
    }


}
