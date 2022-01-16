package k1;//第一课
import java.util.*;
public class c1 {
    public static void main(String[] args) {
        int[] a={6,5,3,2,1,15,23,89,77};

        Arrays.sort(a);

        for(int i=0;i<9;i++){
            System.out.println(a[i]);
        }

        System.out.println(a[8]);
    }
}
