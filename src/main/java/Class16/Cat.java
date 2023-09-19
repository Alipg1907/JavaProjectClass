package Class16;


    public class Cat {
        private String name;
        private String breed;
        private String color;
        private int age;

        public Cat() {
        }

        public Cat(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }

        public Cat(String name, String breed, String color) {
            this.name = name;
            this.breed = breed;
            this.color = color;
        }

        public Cat(String name, String breed, String color, int age) {
            this(name, breed, color);
            this.age = age;
        }
        public void printInfo(){
            System.out.println(name+" "+breed+" "+color+" "+age);
        }
    }


