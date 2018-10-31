public class Member {

    private String url;
    private static Member member = null;

    private Member(String url){
        this.url = url;
    }

    private synchronized static void createInstance(){
        if(member == null)
            member = new Member("https://www.esliceu.com");
    }

    public static Member getInstance() {
        if (member == null)
            createInstance();

        return member;
    }

    public String getUrl() {
        return url;
    }


}
