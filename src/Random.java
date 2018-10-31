import java.util.ArrayList;
import java.util.List;

public class Random implements Strategy {

    List<Member> randoList = new ArrayList<Member>();

    Random(List randoList){
        this.randoList = randoList;
    }

    @Override
    public int sentToStrategy() {
        return (int) Math.floor(Math.random()* randoList.size() + 1);
    }

    @Override
    public void clonar() {

    }
}
