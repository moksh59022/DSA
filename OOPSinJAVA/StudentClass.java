package OOPSinJAVA;
public class StudentClass {
    // creating a new data type

    public static int change(Student s){
        s.rno=50;
        return s.rno;

    }
    public static void main(String[] args) {


//           change(s2);
           Student s1 = new Student("moksh",55,58);  // declaration
        System.out.println(Student.getNumberOfStudents());
           Student s2 = new Student("hah",12,22);
        System.out.println(s2.getNumberOfStudents());
           Student s3 = new Student("mo",44,55);
        System.out.println(s3.getNumberOfStudents());

//           s1.name = "Moksh";
//            s2.rno = 76;
//           s1.percent=92.5;

//             s1.setPercent(55);
//             s1.schoolName="ll";
//        System.out.println(s1.name);
//        System.out.println(s2.rno);
//        System.out.println(s1.getPercent());
//        System.out.println(s1.schoolName);
//        System.out.println(s1.numberOfStudents);


//        System.out.println(s1.rno);
//        change(s1);
//        System.out.println(s1.rno);






    }
}
