package com.company;

public class Recepitionist {
    private int staffId;
    private String name;
    private String telephoneNumber;

    public Recepitionist(){
        this.staffId = 0;
        this.name = "";
        this. telephoneNumber = "";
    }
    public Recepitionist(int staffId, String name, String telephoneNumber){
        this.staffId = staffId;
        this.name= name ;
        this. telephoneNumber = telephoneNumber;
    }


    public Boolean checkRoomAvailability(){
        return true;
    }
    public double genarateBill(){
        return 1;
    }
    public void takeCustomerFeedback(){

    }

}
