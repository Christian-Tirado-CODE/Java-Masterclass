package com.company;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;

    }

    @Override
    public void powerOn() {
        System.out.println("Mobile Phone powered up.");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now ringing " + phoneNumber + " on deskphone.");
        } else {
            System.out.println("Phone is switched off");
        }

    }

    @Override
    public void answer() {
        if(this.isRinging){
            System.out.println("Answering the desk phone");
            this.isRinging = false;
        }


    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            System.out.println("Melody ring");
            this.isRinging = true;
        } else {
            this.isRinging = false;
            System.out.println("Mobile phone not on or different");
        }

        return this.isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
