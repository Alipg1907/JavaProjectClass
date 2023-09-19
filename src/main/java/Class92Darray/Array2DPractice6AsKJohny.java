package Class92Darray;

public class Array2DPractice6AsKJohny {
    public static void main(String[] args) {
        String[][] cars = {
                {"Ford", "Chevrolet", "Dodge"},
                {"Mercedes-Benz", "BMW", "Audi"},
                {"Hyundai", "Kia", "Genesis"},
                {"Ferrari", "Lamborghini", "Maserati"}
        };
        for (String [] row:cars){  //enhanced loop - for each loop
            for (String colValue:row){
                System.out.print(colValue+ " ");
            }
            System.out.println();


        }
// index way
        System.out.println();
        for (int i = 0; i < cars.length ; i++){
            for (int j = 0; j < cars[i].length ; j++) {
                System.out.print(cars[i][j]+ " ");
            }
            System.out.println();
            }

    }
}
////Create 2D array of cars: american, german,korean,italian.
////Then retrieve all values from that array using 2 different loops

