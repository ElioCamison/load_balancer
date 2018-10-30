// Classe Sonda
public class Probe {

    private Member member = Member.getInstance();
    private int cpu = member.getCpu();
    private int network = member.getNetwork();
    private int memory = member.getMemory();
    private int disc = member.getDisc();

    Probe(){

    }

    Probe(int cpu, int network, int memory, int disc){
        this.cpu = cpu;
        this.network = network;
        this.memory = memory;
        this.disc = disc;
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
        return "Probe{" +
                "cpu=" + cpu + " % "+
                ", network=" + network + " % "+
                ", memory=" + memory + " % "+
                ", disc=" + disc + " %"+
                '}';
    }
}
