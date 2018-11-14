package com.esLiceu.clientServidor.Strategy;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Random implements Strategy {

    List<Member> randoList = new ArrayList<Member>();

    private static Random random = null;

    private Random(){

    }

    private synchronized static void createInstance(){
        if(random == null)
            random = new Random();
    }

    public static Random getInstance() {
        if (random == null)
            createInstance();

        return random;
    }


    @Override
    public Object sentToStrategy(Object obj) {
        return null;
    }

    @Override
    public RoundRobin clonar() {
        if(RoundRobin.getInstance() != null)
            return RoundRobin.getInstance().clonar();

        return RoundRobin.getInstance();
    }
}
