package com.esLiceu.clientServidor.Member;

public class Member {

    private String url;
    private static Member member = null;


    public Member(){

    }

    private Member(String url){
        this.url = url;
    }



    public String getUrl() {
        return url;
    }


}
