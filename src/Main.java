public class Main {

    public static void main(String[] args) {
        LoadManager loadManager = LoadManager.getInstance();
        RoundRobin roundRobin = RoundRobin.getInstance();


        loadManager.sentToStrategy(roundRobin);


    }
}
