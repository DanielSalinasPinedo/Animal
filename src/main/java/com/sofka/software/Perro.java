package com.sofka.software;

import com.sofka.software.interfaces.AnimalInterface;
import com.sofka.software.abstracts.Animal;

import java.util.logging.Logger;

public class Perro extends Animal implements AnimalInterface {
    @Override
    public void mostrarTipodeSonido() {
        logger.info("Soy un perro y ladro");
    }

    @Override
    public void mostrarTipodeJuego() {
        logger.info("Soy un perro y juego con una pelota");
    }

    @Override
    public void getEstado() {
        logger.info("El perro esta corriendo");
    }
}
