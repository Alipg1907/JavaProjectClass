package Class16;

public class Person2 {



        private String name;
        private int age;
        private double weight;
        private char gender;
        private int salary;
        private String hairColor;

        public Person2() {

        }

        public Person2(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Person2(String name, int age, double weight, char gender) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.gender = gender;
        }

        public Person2(String name, int age, double weight, char gender, int salary, String hairColor) {
           /* this.name = name;
            this.age = age;
            this.weight = weight;
            this.gender = gender;*/
            this(name,age,weight,gender); // this must be first line to not give error!
            this.salary = salary;
            this.hairColor = hairColor;
        }

        public void printInfo() {
            String name = "Giu";
            System.out.println(this.name + " " + age + " " + weight + " " + gender+" "+salary+" "+hairColor);
        }

    }



