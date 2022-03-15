package Persons;

import java.util.ArrayList;
import java.util.Scanner;

public class Persons{
      private String names;
      private int age;
      private double weight;
      private double height;
      private String hobbies;
      static int nums = 1;
    

    public Persons(String names, int age, double weight, double height, String hobbies){
        this.names = names;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.hobbies = hobbies;
        
    }

    public Persons(){
        
    }

    public String getNames(){
        return names;
    }

    public void setNames(){
        System.out.println("\nName:");
        Scanner named = new Scanner(System.in);
        String namesPerson = named.next();
        names = namesPerson;

    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        System.out.println("Age:");
        Scanner aged = new Scanner(System.in);
        int agePerson = aged.nextInt();
        age = agePerson;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(){
        System.out.println("Weight:");
        Scanner weighted = new Scanner(System.in);
        double weightPerson = weighted.nextDouble();
        weight = weightPerson;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(){
        System.out.println("Height:");
        Scanner heighted = new Scanner(System.in);
        double heightPerson = heighted.nextDouble();
        height = heightPerson;
    }

    public String getHobbies(){
        return hobbies;
    }

    public void setHobbies(){
        System.out.println("Hobbies:");
        Scanner hobbied = new Scanner(System.in);
        String hobbiesPerson = hobbied.next();
        hobbies = hobbiesPerson;
    }


    public static void main(String[] args){
        System.out.println("How many persons do you want to create:");
        Scanner persons = new Scanner(System.in);
        int nPersons = persons.nextInt();
        ArrayList<Persons> addingPersons = new ArrayList<>();

        for (int i = 0; i < nPersons; i++) {
            Persons addedPerson = new Persons();
            addingPersons.add(addedPerson);  
            addedPerson.setNames();
            addedPerson.setAge();
            addedPerson.setWeight();
            addedPerson.setHeight();
            addedPerson.setHobbies(); 
 }

 for(int i=0; i < addingPersons.size();i++){
     System.out.println((addingPersons.get(i).toString().replaceAll("\\[|\\]|,", "")));
 }

    }

    public String toString(){
    return "\nPerson number: " + nums++ + "\nName: " + getNames() + "\nAge: " + getAge() + "\nWeight: " + getWeight() + "\nHeight: " + getHeight() + "\nHobbies: " + getHobbies();  
}


    
}


