package com.subha;

public class Address {
    private final String HouseNo;
    private final String Locality;
    private final String Taluka;
    private final String District;
    private final String  State;

    Address(String H,String L,String T,String D,String S){
        HouseNo=H;
        Locality=L;
        Taluka=T;
        District=D;
        State=S;
    }

    String showAddress(){
        String sol=("House:"+HouseNo+"\n"
                +"Locality:"+Locality+"\n"
                +"Taluka:"+Taluka+"\n"
                +"District:"+District+"\n"
                +"State:"+State+"\n");

        return sol;
    }
}
