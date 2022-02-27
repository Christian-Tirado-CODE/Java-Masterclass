package com.company;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;

    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone.");
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
        if(phoneNumber == myNumber){
            System.out.println("Ring ring");
            this.isRinging = true;
        } else {
            this.isRinging = false;
        }

        return this.isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
