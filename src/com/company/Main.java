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

//        Gearbox mcLaren = new Gearbox(6);
//       mcLaren.addGear(1, 5.3);
//       mcLaren.addGear(2, 10.6);
//       mcLaren.addGear(3, 15.9);
//       mcLaren.operateClutch(true);
//       mcLaren.changeGear(1);
//       mcLaren.operateClutch(false);
//       mcLaren.wheelSpeed(1000);
//       mcLaren.changeGear(2);
//       mcLaren.changeGear(2);
//       System.out.println(mcLaren.wheelSpeed(3000));
//       mcLaren.operateClutch(true);
//       mcLaren.changeGear(3);
//       mcLaren.operateClutch(false);
//       System.out.println(mcLaren.wheelSpeed(6000));

        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

//        Bird bird = new Bird("Parrot");
//        bird.breathe();
//        bird.eat();
        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

        /*
           Interfaces vs Abstract classes:
             Abstract classes allow you to create  instance member variables,constructors and implement methods.
             Interfaces can create variables but they are public static final,otherwise known as constants with a static scope.
             all methods of an interface are public by default where as abstract classes could have protected and private methods.

             Similarities between both: They cannot be instantiated.

             Abstract classes:
              When an abstract class is subclassed, the subclass usually provides implementations for all the abstract methods in the parent class.
              However, if the method is not implemented the subclass must be declared abstract.
              Use this type of classes when:
               - you want to share code among several closely related ones.
               - You want to declare non static and final fields.
               - You have a requirement for your base class to provide a default implementation of certain methods but other methods should be open to being overridden by child classes.
               The purpose of an abstract class is to provide a common definition of a base class that multiple derived classes can share.
         */
    }
}
