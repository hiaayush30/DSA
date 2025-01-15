public interface Inter { 
    //can have abstract methods and static constants

    //public,final and static redundant
    // public static final int MAX_AGE=150;
    int MAX_AGE=150;
    public abstract void eat();
    //public and abstract are redundant here
    void sleep();
    
    public static void info(){
        System.out.println("This is an Interface");
    }//static methods can only be executed using the Interface itself

    //Default methods in interface
    default void concrete(){
        //can use this in here
        System.out.println("This is a concrete method in Interface");
    }
    //can also be used via the instance of the sub classes
    //used for adding a method to all its sub classes
}
