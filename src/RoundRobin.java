import java.util.ArrayList;
import java.util.List;

public class RoundRobin implements Strategy {

    List<Member> memberList = new ArrayList<Member>();

    @Override
    public int sentToStrategy() {

        return 0;
    }

    @Override
    public void clonar() {

    }
}
