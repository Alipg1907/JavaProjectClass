package Class16;

public class Person {
    private String name;
    private int age;
    private double weight;
    private char gender;
    private int salary;
    private String hairColor;


    //public void Person(){ YOU should never create method name with class name
    // but you can create same constructor with class
        public Person(String pName, int pAge, double pWeight, char pGender, int salary, String hairColor){
            name=pName;
            age=pAge;
            weight=pWeight;
            gender=pGender;

            //pGender=gender will not work if you change places of parameter, it will be initialize.
            // OR WE caN WRITE THIS WAY!!
            //this.name = name;
            //this.age=age;
            //this.weight=weight;
            //this.gender = gender;
        //public void printInfo(){
            //            System.out.println(this.name+" "+this.age+" "+weight+" "+gender);
            //        }
            //If there is confusing or complicate situation with name use this.variable name

        }

        public Person(String pName, int pAge, double pWeight, char pGender){

        }

        public void printInfo(){
            System.out.println(name+" "+age+" "+weight+" "+gender);
        }
}
