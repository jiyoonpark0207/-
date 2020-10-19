package practice.p1019;

public abstract class Parent {
    String familyName = "Yoon", name;
    int age;

    Parent(String name, String familyName){
        this.name = name;
        this.familyName = familyName;

    }
    Parent(String name, String familyName, int age){
        this(name, familyName);
        this.age = age;
    }
    void printInfo(){
        System.out.println(name + " "+ familyName + " is "+ age+ " years old");
    }
}
