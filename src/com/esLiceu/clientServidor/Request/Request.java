package com.esLiceu.clientServidor.Request;

public class Request {

    private static Request request = null;

    private Request(){

    }

    private synchronized static void createInstance(){
        if(request == null)
            request = new Request();
    }

    public static Request getInstance() {
        if (request == null)
            createInstance();

        return request;
    }

}



