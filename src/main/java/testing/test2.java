package testing;

public class test2 {
    public static void main(String[] args) {
        int[] a = {12, 15, 11, 13, 9, 25};
        int[] a2 = {12, 15, 11, 13, 9, 25};
        int sum = 0;
        for (int i = 0; i <a.length; i++) {
            if (a[i] % 2== a2[i ] % 5)  {
                sum += i * i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
//modulus gives you the remainder  - kalan amk
//sum += 2 ---- sum = sum + 2
// sum += i * i; ==== sum = sum + i * i;\
//100 .1/4 ----- 100 * 0.25 if(i*0.35 >= 50)