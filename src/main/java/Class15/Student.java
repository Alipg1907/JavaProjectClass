package Class15;
//Write a java class students that hve a constructor which takes students name
//and 3 subject grades. Inside your class also have a method to calculate average grade.
//Test class for 2 different students with different marks. your program should print an average mark
//of each students name.
public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    public Student(String name, double grade1, double grade2, double grade3){
        this.name=name;
        this.grade1=grade1;
        this.grade2=grade2;
        this.grade3=grade3;
    }
    public double calculateAverage(){
        return (grade1 + grade2 + grade3) / 3.0;
    }
public String getName(){
        return name;
}

}
