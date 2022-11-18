package Controlador;
import Interfaces.*;
import modelo.*;

public class acciones implements iProductividad, iRadio, iReproduccion, iTelefono{
    radio r;

    public acciones(radio r){
        this.r = r;
    }

    public void encenderApagar(){
        r.cambiarEstado();
    }

    public void cambiarVolumen(int i){
        r.cambiarVolumen(i);
    }

    @Override
    public String vertiempo() {
        return null;
    }

    @Override
    public String cambiarbanda() {

        return null;
    }

    @Override
    public String cambiaremisoras() {

        return null;
    }

    @Override
    public String guardaremisora() {

        return null;
    }

    @Override
    public String cargaremisora() {

        return null;
    }

    @Override
    public String seleccionarListaReproduccion() {

        return null;
    }

    @Override
    public String cambiarCancion() {

        return null;
    }

    @Override
    public String escucharCancion() {

        return null;
    }

    @Override
    public String Conectar() {

        return null;
    }

    @Override
    public String desconectar() {

        return null;
    }

    @Override
    public String MostrarContactos() {

        return null;
    }

    @Override
    public String LlamarContacto() {

        return null;
    }

    @Override
    public String FinalizarLLamada() {

        return null;
    }

    @Override
    public String PonerEnEspera() {

        return null;
    }

}
