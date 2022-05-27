package com.sofka.software;

import com.sofka.software.abstracts.Animal;
import com.sofka.software.interfaces.AnimalInterface;

import java.util.logging.Logger;

public class Gato extends Animal implements AnimalInterface {
    @Override
    public void mostrarTipodeSonido() {
        logger.info("Soy un gato y maullo");
    }

    @Override
    public void mostrarTipodeJuego() {
        logger.info("Soy un gato y juego con un estambre");
    }

    @Override
    public void getEstado() {
        logger.info("El gato esta durmiendo");
    }
}
