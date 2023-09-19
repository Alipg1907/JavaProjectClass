package Class15;

public class TestStudent {
    public static void main(String[] args) {
        Student Student1= new Student("Alice", 80.5,90,78);
        Student Student2= new Student("Ashgar",90,88,87.6);

        System.out.println(Student1.getName()+" 's Average mark:"+ Student1.calculateAverage());
        System.out.println(Student2.getName()+ " 's Average mark:"+ Student2.calculateAverage());
    }
}
