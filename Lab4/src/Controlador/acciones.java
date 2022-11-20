package Controlador;
import Interfaces.*;
import modelo.*;

public class acciones implements iProductividad, iRadio, iReproduccion, iTelefono{
    radio r;
    tiempo clima = new tiempo();
    contacto contactos = new contacto();

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
        return ("Se predice un clima de: " + (int) clima.generarTiempo() + " grados");
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
        return "Se ha cargado la emisora " + r.cargarEmisora();
    }

    @Override
    public String seleccionarListaReproduccion(String tipo) {
        r.setTipoReproduccion(tipo);
        return "Se ha cambiado a "+tipo;
    }

    @Override
    public String cambiarCancion() {
        r.siguienteCancion();
        return "Se ha cambiado a la siguiente cancion";
    }

    @Override
    public String escucharCancion(int i) {
        r.cambiarCancion(i);
        return "Se ha cambiado la cancion";
    }

    @Override
    public String Conectar() {

        return "telefono conectado";
    }

    @Override
    public String desconectar() {

        return "Telefono desconectado";
    }

    @Override
    public String MostrarContactos() {
        return contactos.MostrarContactos();
    }

    @Override
    public String LlamarContacto() {
        return contactos.LlamarContacto("Esteban Zamorano");
    }

    @Override
    public String FinalizarLLamada() {
        return contactos.FinalizarLLamada("Esteban Zamorano");
    }

    @Override
    public String PonerEnEspera() {
        return contactos.LlamadaEnEspera("Esteban Zamorano");
    }

}
