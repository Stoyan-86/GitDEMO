package Demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class largestElementH {
        public static int getLargest(Integer[] a, int total){
        List<Integer> list= Arrays.asList(a);
        Collections.sort(list);
            return list.get(total-1);
    }
        public static void main(String[] args) {
        Integer a[]={1,2,5,6,3,2};
        Integer b[]={44,66,99,77,33,22,55};
        System.out.println("Largest: "+getLargest(a,6));
        System.out.println("Largest: "+getLargest(b,7));
    }
}
