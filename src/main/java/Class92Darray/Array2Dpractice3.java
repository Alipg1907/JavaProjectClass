package Class92Darray;

public class Array2Dpractice3 {
    public static void main(String[] args) {
        String[][] students = {{"Ayesha", "Giulia", "John", "Deepali"},
                {"A", "B", "C", "D"}
        };
        for (int i = 0; i < students.length; i++) {
            if (students[1][i].equals("A") || students[1][i].equals("B")) {

                System.out.println(students[0][i]);

            }

        }
    }
}
//Create a 2D array (shorter way) in which first array will consist of 4 names and second array will contain grades.
//then your program should print name of the students that has A and B grade.