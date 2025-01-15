package OOPS.Encapsulation;
//this refers to the instance calling the method
public class Student {
    String name;
    int rollNo;
    private int age;

    public void setAge(int age){
        if(age<0){
            age=0;
        }
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }
}
