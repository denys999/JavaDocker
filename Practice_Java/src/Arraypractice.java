import java.util.Arrays;

public class Arraypractice {
    public static void main(String[] args) {
        int n =10; //primitive boolean,char, int // [10]
        String s ="lol"; // not primitive
        // num refer to -->[array] Object array , num is reference to new object of size 5
        //in array
        int[] num0 ={0,1,2,3,4,5};
        System.out.println("known array: "+ Arrays.toString(num0));
        int[] num = new int[5];
        for (int i = 0; i<num.length ;i++ ){
            num[i] = i*5;
            System.out.println("loop array : "+num[i]);
        }
        System.out.println(Arrays.toString(num));
    }
}
