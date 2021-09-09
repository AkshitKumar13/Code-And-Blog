package com.knoldus.ISP;

class  participant implements SwimmingAthlete {

    @Override
    public void compete() {
        System.out.println("participant started competing");
    }

    @Override
    public void swim() {
        System.out.println("participant started swimming");
    }

}
/// participant will not have to implement actions that he is not capable of performing:

class main {
    public static void main(String...arg){
        participant obj=new participant();
        obj.compete();
        obj.swim();
    }

}