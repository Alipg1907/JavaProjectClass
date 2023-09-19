package Class13;

public class SyntaxEmployee {

    String empId;
    int salary;
    static String CEO="Sumair"; //Static value should be write upperCASE

    public static void main(String[] args) {
        SyntaxEmployee ashgar=new SyntaxEmployee();
        ashgar.empId="I123";
        ashgar.salary=-20;

        SyntaxEmployee moazzam=new SyntaxEmployee();
        moazzam.empId="1456";
        moazzam.salary=95;

        System.out.println(moazzam.salary);
        System.out.println(ashgar.empId);



    }
}
