import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LoadManager implements LoadBalancer,Strategy {

    private List<Member> memberList = new ArrayList<Member>();
    private Probe probe = new Probe();
    private static LoadManager loadManager = null;
    private static RoundRobin roundRobin;
    private static Random random;
    private HashMap<Integer,LoadManager> cacheLoadManager = new HashMap<Integer, LoadManager>();

    private LoadManager(){
        
    }

    private synchronized static void createInstance() {
        if(loadManager == null)
            loadManager = new LoadManager();
    }

    public static LoadManager getInstance() {
        if (loadManager == null)
            createInstance();

        return loadManager;
    }

    public HashMap<Integer, LoadManager> getCopyLoadManager() throws CloneNotSupportedException {
        if (loadManager != null)
              cacheLoadManager.put(1, (LoadManager) loadManager.clone());

        return cacheLoadManager;
    }

    @Override
    public String checkStatusMember() {
        if (probe.getCpu() > 80 || probe.getDisc() > 80 || probe.getNetwork() > 80 || probe.getMemory() > 80 )
            return "Valor per damunt el permés";
        else
            return "Valors correctes";
    }

    @Override
    public int sentToStrategy() {
        return 0;
    }

    @Override
    public LoadManager clonar() {
        if(LoadManager.getInstance() != null)
            return LoadManager.getInstance().clonar();

        return LoadManager.getInstance();
    }
}


