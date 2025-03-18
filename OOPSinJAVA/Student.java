package OOPSinJAVA;

public  class Student {
    public String name;
    public int rno;
    private double percent;
    final String schoolName = "vps";
    private static int numberOfStudents;




   public static int getNumberOfStudents(){
       return numberOfStudents;
   }

    public double getPercent(){
        return percent;
    }
    public void setPercent(double percent){
          this.percent = percent;
    }

   public Student(){

    }
   public Student(String name, int rno, double percent){
        this.name=name;
        this.rno=rno;
        this.percent=percent;
        numberOfStudents++;
//        System.out.println(this.rno+" "+"hello");
    }
}