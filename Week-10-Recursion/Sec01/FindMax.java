import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3 ,99, -1);

        int max = getMax(list);

        System.out.println(max);
    }

    public static <T extends Comparable<T>> T getMax(List<T> list){
        if (list.size() == 1) {
            return list.get(0);
        }

        T cur = list.get(0);
        List<T> remainingList = list.subList(1, list.size());

        if(cur.compareTo(getMax(remainingList)) == 1){
            return cur;
        }
        else {
            return getMax(remainingList);
        }


    }
}
