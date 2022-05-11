package singleton;

public class singleton {

    //Singleton Design Pattern :  Only one object should be created.
    // example-> NetBanking : mobile or browser
    //Steps for singleton design pattern:
    //1- Make Private constructor to restrict instantiation of the class from other classes.
    //2- MAke Private static variable of the same class that is the only instance of the class.
    //3- Make Public static method that returns the instance of the class, this is the
    //   global access point for outer world to get the instance of the singleton class.


    //step 1:
    private singleton(){}

    //step 2:
    private static singleton instance = new singleton(); // eager initialization

    //step 3:
    public singleton getInstance(){
        if (instance == null){
            return new singleton();
        }
        else{
            return instance ;
        }
    }

}

//Q.What will happen in a Multithreaded environment?
//If the design pattern is accessed in a multithreaded environment then we will use "Synchronised" keyword.
//With the help of this keyword only one thread will be able to access the object at a time.
//Hence we'll be able to get the desired result.
