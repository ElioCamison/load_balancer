package com.esLiceu.clientServidor.Probe;

// Classe Sonda
public class Probe {

    //Probe tendría que ser una estrategia

    private int cpu;
    private int network;
    private int memory;
    private int disc;

    public Probe(){

    }


    Probe(int cpu, int network, int memory, int disc) {

        this.cpu = cpu;
        this.network = network;
        this.memory = memory;
        this.disc = disc;

    }


    public Boolean checkStatusMember() {

        if (this.getCpu() > 80 || this.getMemory() > 80 || this.getNetwork() > 80 || this.getDisc() > 80 )
            return true;
        else
            return false;

    }

    public int getCpu() {
        return cpu;
    }

    public int getNetwork() {
        return network;
    }

    public int getMemory() {
        return memory;
    }

    public int getDisc() {
        return disc;
    }

    @Override
    public String toString() {
        return "com.esLiceu.clientServidor.Probe.Probe{" +
                "cpu=" + cpu + " % "+
                ", network=" + network + " % "+
                ", memory=" + memory + " % "+
                ", disc=" + disc + " %"+
                '}';
    }
}
