package com.esLiceu.clientServidor.Member;

import com.esLiceu.clientServidor.Probe.Probe;

public class Member {

    private String url;
    private static Member member = null;
    private Probe probe = new Probe();


    public Member(){

    }

    private Member(String url){
        this.url = url;
    }



    public String getUrl() {
        return url;
    }


}
