package com.mywork.problemsovling;

class Student18 implements Cloneable {
    int rollno;
    String name;

    Student18(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public static void main(String args[]) {
        try {
            Student18 s1 = new Student18(101, "amit");
            System.out.println(s1.rollno + " " + s1.name);
            Student18 s2 = (Student18) s1.clone();
            s2.name = "Hidayath";
            s2.rollno = 102;
//            s1.name = "Hidayath11";
//            s1.rollno = 103;

            System.out.println(s1.rollno + " " + s1.name);
            System.out.println(s2.rollno + " " + s2.name);

        } catch (CloneNotSupportedException c) {
        }

    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
