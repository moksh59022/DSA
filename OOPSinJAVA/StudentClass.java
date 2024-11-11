package OOPSinJAVA;
public class StudentClass {
    // creating a new data type
    public static class student{
        String name;
        int rno;
        double percent;

        student(String name,int rno,double percent){
            this.name=name;
            this.rno=rno;
            this.percent=percent;
            System.out.println(this.rno+" "+"hello");
        }
    }
    public static int change(student s){
        s.rno=50;
        return s.rno;

    }
    public static void main(String[] args) {

           student s2 = new student("hah",12,22);
           student s1 = new student("moksh",s2.rno,58);  // declaration
//           s1.name = "Moksh";
//           s1.rno = 76;
//           s1.percent=92.5;

//        change(s1);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);



//        System.out.println(s1.rno);
//        change(s1);
//        System.out.println(s1.rno);






    }
}
