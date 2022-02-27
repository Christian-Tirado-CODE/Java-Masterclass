package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();


        /*
          NESTED CLASSES: 4 TYPES
            1. STATIC NESTED CLASSES
            2. NON-STATIC NESTED CLASSES(INNER CLASSES)
            3. LOCAL CLASS - NESTED INSIDE A SCOPE BLOCK
            4. ANONYMOUS CLASS - NESTED CLASS WITHOUT A CLASS NAME.
         */

        Gearbox mcLaren = new Gearbox(6);
       mcLaren.addGear(1, 5.3);
       mcLaren.addGear(2, 10.6);
       mcLaren.addGear(3, 15.9);
       mcLaren.operateClutch(true);
       mcLaren.changeGear(1);
       mcLaren.operateClutch(false);
       mcLaren.wheelSpeed(1000);
       mcLaren.changeGear(2);
       mcLaren.changeGear(2);
       System.out.println(mcLaren.wheelSpeed(3000));
       mcLaren.operateClutch(true);
       mcLaren.changeGear(3);
       mcLaren.operateClutch(false);
       System.out.println(mcLaren.wheelSpeed(6000));
    }
}
