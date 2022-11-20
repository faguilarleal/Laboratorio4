package Controlador;
import Interfaces.*;
import modelo.*;

public class acciones implements iProductividad, iRadio, iReproduccion, iTelefono{
    radio r;
    tiempo clima;
    contacto contactos;

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
        System.out.println("Se predice un clima de: " + (int)clima.generarTiempo() + " grados");
        return null;
    }

    @Override
    public String cambiarbanda() {
        r.cambiarFrecuencia();
        return "Se ha cambiado la frecuencia";
    }

    @Override
    public String cambiaremisoras(int i) {
        r.cambiarEmisora(i);
        return "Se ha cambiado la emisora";
    }

    @Override
    public String guardaremisora() {
        r.guardarEmisora();
        return "Se ha guardado la emisora";
    }

    @Override
    public String cargaremisora() {
        r.cargarEmisora();
        return "Se ha cargado la emisora";
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
        contactos.MostrarContactos();
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
