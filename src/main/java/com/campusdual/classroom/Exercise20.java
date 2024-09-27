package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> personas = new ArrayList<>();
        personas.add( new Person("Javi","Potter"));
        personas.add(new Teacher("Laura","Iglesias","Ingles"));
        personas.add(new PoliceOfficer("Manuel","Blanco","Z-35"));
        personas.add(new Doctor("Juan","Montoya","Traumatologia"));
        return personas;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (Person persona:stringList){
            persona.getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
