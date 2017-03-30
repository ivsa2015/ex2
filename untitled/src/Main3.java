import java.util.Arrays;

/**
 * Created by Dendi on 3/13/2017.
 */
public class Main3 {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 5, 6, 7};
//        int a=i++ + i++;
//        System.out.println(a);
        System.out.println(Arrays.toString(i));
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }
        for (int j = 0; j < i.length; j++) {
            int i1 = i[j];
            System.out.println(i1);
        }
        for (int i1 : i) {
            System.out.println(i1);

        }
        int g= 5;
        System.out.println();

    }
}
