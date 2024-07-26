package com.mywork.optional;

import com.mywork.model.Student;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Student student = getStudentWithName("Hidayath");
        if(student != null){
            System.out.println(student.getName());
        }else {
            System.out.println("no Student with the given name ");
        }

        Optional<Student> studentOptional = Optional.ofNullable(getStudentWithName("Hidayath1"));
        if(studentOptional.isPresent()) {
            System.out.println(studentOptional.get().getName());
        }
        else {
            System.out.println("Student  is not present");
        }

        Student student1 = Optional.ofNullable(getStudentWithName("Hidayath2")).orElse(new Student(2, "xyz", "BSc"));
        System.out.println(student1.toString());

        try {
            Student student2 = Optional.ofNullable(getStudentWithName("Hidayath3")).orElseThrow(()->new Exception("Student not found!!"));
            System.out.println(student2.getName());
        } catch (Exception e) {
            System.out.print("-----Exception"+e.getMessage());
            throw new RuntimeException(e);
        }

    }

    public  static Student  getStudentWithName(String name ){
        // lets suppose that our database contain only 2 students ahmed and hamza .
        if (name.equals("Hidayath") || name.equals("Khan")) {
            return new Student(1 , name , "Engineering");
        } else {
            return null ;
        }
    }
}
