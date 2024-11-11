package OOPSinJAVA;
public class StudentClass {
    // creating a new data type

    public static int change(Student s){
        s.rno=50;
        return s.rno;

    }
    public static void main(String[] args) {

           Student s2 = new Student("hah",12,22);
           Student s1 = new Student("moksh",s2.rno,58);  // declaration
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
