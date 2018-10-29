public interface LoadBalancer {

    String checkStatusMember();

    void sendToStrategy();
}
