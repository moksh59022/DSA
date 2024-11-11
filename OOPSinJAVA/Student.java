package OOPSinJAVA;

public  class Student {
    String name;
    int rno;
    double percent;

    Student(String name, int rno, double percent){
        this.name=name;
        this.rno=rno;
        this.percent=percent;
        System.out.println(this.rno+" "+"hello");
    }
}