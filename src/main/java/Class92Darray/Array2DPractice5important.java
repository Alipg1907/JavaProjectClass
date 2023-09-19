package Class92Darray;

public class Array2DPractice5important {
    public static void main(String[] args) {
        String[][] carBrands = {
                {"Ford", "Chevrolet", "Dodge"},
                {"Mercedes-Benz", "BMW", "Audi"},
                {"Hyundai", "Kia", "Genesis"},
                {"Ferrari", "Lamborghini", "Maserati"}
        };

        // Using index nested for loops
        System.out.println("Using nested for loops:");
        for (int i = 0; i < carBrands.length; i++) {
            for (int j = 0; j < carBrands[i].length; j++) {
                System.out.print(carBrands[i][j] +" ");
            }
        }

        System.out.println();

        // Using enhanced for loops
        System.out.println("Using enhanced for loops:");
        for (String[] countryBrands : carBrands) {
            for (String brand : countryBrands) {
                System.out.print(brand +" ");
            }
        }
    }
}







//Create 2D array of cars: american, german,korean,italian.
//Then retrieve all values from that array using 2 different loops