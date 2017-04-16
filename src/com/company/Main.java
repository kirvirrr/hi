package com.company;
class Person{
    String name;
    int age;
    void speak(){
        System.out.println("My name is: " + name + " and im: " + age + " years old" );
    }
    int calculateYearsToRetirement(){
        int yearsLeft = 65 - age;

        return yearsLeft;
        }
        int getAge(){
        return age;
        }
        String getName(){
            return name;
        }
    }


public class Main {

    public static void main(String[] args) {
	Person person1 = new Person();
	person1.name = "Kirill";
	person1.age = 20;
	//person1.speak();
	int years = person1.calculateYearsToRetirement();
	System.out.println("i have " + years + " years before retirement");
	int age = person1.getAge();
	String name = person1.getName();
	System.out.println("My Name is: " + name);
        System.out.println("My Age is: " + age);

    }
}
