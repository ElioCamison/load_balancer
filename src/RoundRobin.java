import java.util.ArrayList;
import java.util.List;

public class RoundRobin implements Strategy {

    List<Member> memberList = new ArrayList<Member>();

    private static RoundRobin roundRobin = null;

    private RoundRobin(){

    }

    private synchronized static void createInstance(){
        if(roundRobin == null)
            roundRobin = new RoundRobin();
    }

    public static RoundRobin getInstance() {
        if (roundRobin == null)
            createInstance();

        return roundRobin;
    }

    @Override
    public Object sentToStrategy(Object roundRobin) {

        return RoundRobin.getInstance();
    }

    @Override
    public RoundRobin clonar() {
        if(RoundRobin.getInstance() != null)
           return RoundRobin.getInstance().clonar();

        return RoundRobin.getInstance();
    }
}
