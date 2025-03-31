import java.util.Arrays;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3 ,99, -1);
        List<String> words = Arrays.asList("d", "a", "f", "z", "x");

        String maxWord = getMax(words);
        int max = getMax(list);

        System.out.println(max);
        System.out.println(maxWord);
    }

    public static <T extends Comparable<T>> T getMax(List<T> list){
        if (list.size() == 1) {
            return list.get(0);
        }

        T cur = list.get(0);
        List<T> remainingList = list.subList(1, list.size());

        if(cur.compareTo(getMax(remainingList)) > 0){
            return cur;
        }
        else {
            return getMax(remainingList);
        }
    }
}
