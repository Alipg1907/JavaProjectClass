package Class8Array;

public class Array1 {
    public static void main(String[] args) {
        //String name="Shawn";
        String name2="Hind";
        String [] names={"Ali","Ahmed","Johny","PG"};
        //System.out.println(name);
        //System.out.println(names[3]);

        for (String name: names) {
            System.out.println(name);
        }
    }
}


//Arrays are datastructures that help us store large amounts of similar data.
// Arrays use indexing to manipulate data inside them.
//indexes always starts from zero.
//Why should we use arrays?
//Arrays help us store and manipulate large amounts of data.
//easily with the help of loops. whenever we have more than 3 similar items
//that we can to store and process together we should always go with arrays.
//Syntax:
//There are two ways of creating the arrays
//Method 1:
//  Datatype[]nameOfTheArray={element1,element2,element3};
//Method2:
//DataType[] nameOfTheArrays= new DataTypes[Size};
//int length = sizeof(arr)/sizeof(arr[0]);
// printf("Number of elements present in given array: %d", length);