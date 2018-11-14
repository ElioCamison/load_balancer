import com.esLiceu.clientServidor.Probe.Probe;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LoadManager loadManager = LoadManager.getInstance();
        RoundRobin roundRobin = RoundRobin.getInstance();
        Random random = Random.getInstance();
        Probe probe = new Probe();

        if (probe.checkStatusMember()) {

            loadManager.sentToStrategy(roundRobin);
            loadManager.sentToStrategy(random);

        }



        List<Member> memberList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Member member = new Member();
            memberList.add(member);
        }

        Monitoring monitoring = new Monitoring();






    }
}
