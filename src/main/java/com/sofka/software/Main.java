package com.sofka.software;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Perro perro = new Perro();

        gato.mostrarTipodeSonido();
        gato.mostrarTipodeJuego();
        gato.getEstado();

        perro.mostrarTipodeJuego();
        perro.mostrarTipodeSonido();
        perro.getEstado();
    }
}
