public abstract  class Animal {
    boolean canFly;
    //only subclasses can now invoke the constructor
    protected  Animal(){
      this.canFly=false;
    }
    int age;
    // as it default age will not be accessible by classes;
    // outside this package
    public abstract void sayHello();
    public void sleep(){
        System.out.println("zzz...");
    }
}
