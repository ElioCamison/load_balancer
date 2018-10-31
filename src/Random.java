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
    public int sentToStrategy() {
        return (int) Math.floor(Math.random()* randoList.size() + 1);
    }

    @Override
    public RoundRobin clonar() {
        if(RoundRobin.getInstance() != null)
            return RoundRobin.getInstance().clonar();

        return RoundRobin.getInstance();
    }
}
