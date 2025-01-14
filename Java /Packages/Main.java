//when you compile this file the class file will be created inside 'Packages'
//so from wherever you will run the program jvm will try to find the folder 
// 'Packages' and then the file Main.java inside it
//ie if you try to run the classs file from within the Packages file it will
//not run as it will try to find Packages/Main.class 
//so run the file from outside folder where Packages folder is present

// Classpath => The place where jvm looks for the package
package Packages;
public class Main {
 public static void main(String[] args) {
    System.out.println("Hello");
 }   
}
