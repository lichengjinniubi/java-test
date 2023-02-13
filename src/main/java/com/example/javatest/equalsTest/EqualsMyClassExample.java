package com.example.javatest.equalsTest;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsMyClassExample {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Java");
        person1.setAge(18);

        Person person2 = new Person();
        person2.setName("Java");
        person2.setAge(18);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());



















//        System.out.println(person1.hashCode());
//        System.out.println(person2.hashCode());
//
//        Set<Person> set = new HashSet<Person>();
//        set.add(person1);
//        set.add(person2);
//
//        set.forEach(p -> {
//            System.out.println(p);
//        });
    }
}



class Person {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        return  age == person.getAge() && Objects.equals(name, person.getName());
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

