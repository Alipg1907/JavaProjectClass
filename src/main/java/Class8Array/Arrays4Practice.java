package Class8Array;

public class Arrays4Practice {
    public static void main(String[] args) {

        boolean[] conds={true,false,true,false,true,true};

        int i=0;
        while(i<conds.length){
            System.out.println(conds[i]);
            i++;
        }

    }
}
//if you say i<= you will gey error because lenght is 6 but index has only 5 elements