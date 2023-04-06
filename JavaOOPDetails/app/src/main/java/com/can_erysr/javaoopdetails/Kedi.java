package com.can_erysr.javaoopdetails;

public class Kedi {

    String isim;
    String gozRengi;
    String tuyRengi;

    public static  String turIsmi = "felis";

    public Kedi(){

    }

    public Kedi(String isim, String gozRengi, String tuyRengi) {
        this.isim = isim;
        this.gozRengi = gozRengi;
        this.tuyRengi = tuyRengi;
    }

    public static void konusKediStatic(){
        System.out.println("Benim türüm : " +turIsmi);
    }
    public void konusKedi(){
        System.out.println("Benim ismim : " + this.isim + "Benim türüm : " +turIsmi);
    }
}
