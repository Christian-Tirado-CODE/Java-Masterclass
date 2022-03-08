package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Account timsAccount = new Account("Tim");
    timsAccount.deposit(1000);
    timsAccount.withdraw(500);
    timsAccount.withdraw(-20);
    timsAccount.deposit(-20);
    timsAccount.calculateBalance();
    //timsAccount.balance = 5000; Error

    System.out.println("Balance on account is " + timsAccount.getBalance());
    //timsAccount.transactions.add(4500); Error
    timsAccount.calculateBalance();
    }

    /*
      NOTES:
       - We cannot have a private class at the top level.
       - Only classes, interfaces and enums can exist at the top level.

         Top level:
            - public: the object is visible to all classes everywhere, whether they are in the same package or have imported the package containing the public class.
            - package-private: the object is only available within its own package(and is visible to every class within the same package). Package-private is specified by not specifying, i.e it is the default if you do not specify public. There is not a "package-private" keyword.
         Member level:
            - public: At the member level, public has the same meaning as at the top level. A public class member(or field) and public method can be accessed from any other class anywhere, even in a different package.
            - package-private: this also has the same meaning as it does at the top level. An object with no access modifier is visible to every class within the same package(but not to classes in external packages).
            - private: the object is only visible within the class it is declared. It is not visible anywhere else(incluiding in subclasses of its class).
            - protected: The object is visible anywhere in its own package(like package-private) but also in subclasses even if they are in another package.

     */
}
