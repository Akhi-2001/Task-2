/*
    Name : Akhi Roy
    ID :2012020150
    Sec: 53(D)
    Email :cse_2012020150@lus.ac.bd
    Date : 09.06.2021
 */
package akhi;

public class Student {String name;
    int id;
    static String universityName;
    Student()
    {
        System.out.println("Default Constructor");
    }
    Student (String name)
    {
        this.name = name;
        System.out.println("Name :- " + name);
    }
    Student (int id)
    {
        this.id = id;
        System.out.println("Id :- " + id);
    }
    void display()
    {
        System.out.println("University name :- "+ universityName);
    }
}



