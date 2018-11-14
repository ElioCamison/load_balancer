package com.esLiceu.clientServidor.Strategy;

public interface Strategy {

    Object sentToStrategy(Object obj);

    Object clonar();
}
