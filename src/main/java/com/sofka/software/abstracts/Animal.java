package com.sofka.software.abstracts;

import java.util.logging.Logger;

public abstract class Animal {
    protected Logger logger = Logger.getLogger("logger");
    //En que estado esta el animal ej: sentado, comiendo, durmiendo, etc.
    public abstract void getEstado();
}
