import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadManager implements LoadBalancer,Strategy {

    private List<Member> memberList = new ArrayList<Member>();
    private Probe probe = new Probe();
    private static LoadManager loadManager;
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
    public void sendToStrategy() {

    }


}


