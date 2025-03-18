package Heap;

import java.lang.reflect.Array;
import java.util.Arrays;

class Student implements Comparable<Student>{
    int rno;
    String name;
    double perc;

    Student(int rno, String name,double perc){
        this.name = name;
        this.rno = rno;
        this.perc = perc;
    }
    public int compareTo(Student s){
        return this.name.compareTo(s.name);
    }
}
public class customComparator {
    public static void print(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].name+" ");
            System.out.print(arr[i].perc+" ");
            System.out.println(arr[i].rno);
        }
    }
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student(33,"moksh",34.4);
        s[1] = new Student(34,"samy",50.5);
        s[2] = new Student(35,"ambani",40.4);
        s[3] = new Student(36,"vijay",90.4);
        print(s);
        Arrays.sort(s);
        System.out.println();
        print(s);
    }
}
