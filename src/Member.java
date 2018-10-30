public class Member {

    private String url;
    private int cpu;
    private int network;
    private int memory;
    private int disc;
    private boolean statMember = true;



    private static Member member = null;

    public Member(boolean statMember){
        this.statMember = statMember;
    }

    public Member(int cpu, int network, int memory, int disc){
        this.cpu = cpu;
        this.network = network;
        this.memory = memory;
        this.disc = disc;
    }

    private Member(String url){
        this.url = url;
    }

    private synchronized static void createInstance(){
        if(member == null)
            member = new Member("https://www.esliceu.com");
    }

    public static Member getInstance() {
        if (member == null)
            createInstance();

        return member;
    }


    public String getUrl() {
        return url;
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

    public boolean getStatMember(){
        return statMember;
    }
}
