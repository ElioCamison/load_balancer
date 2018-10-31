import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LoadManager implements Strategy {

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
    public Object sentToStrategy(Object strategy) {

        RoundRobin rb = RoundRobin.getInstance();

        return rb != null ? rb : Random.getInstance();

    }

    @Override
    public LoadManager clonar() {

        LoadManager lm = LoadManager.getInstance();

        return lm != null ? lm : LoadManager.getInstance().clonar();

    }
}


