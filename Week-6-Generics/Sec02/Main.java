import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(6);
        list.add(5);



        ReeseBingoMachine<Integer> bm1 = new ReeseBingoMachine<>();
        bm1.add(12);
        bm1.add(13);


        ReeseBingoMachine<String> bm2 = new ReeseBingoMachine<>();

        bm2.add(new String("Thing 1"));
        bm2.add("Thing 2");

        // ReeseBingoMachine<Item> bm3 = new ReeseBingoMachine<>();

        System.out.println(bm1.pickItem());
        System.out.println(bm2.pickItem());

        // HashMap<String, Integer> map = HashMap<>();
       

    }
}

