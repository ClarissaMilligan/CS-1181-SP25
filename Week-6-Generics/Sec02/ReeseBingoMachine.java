import java.util.ArrayList;
import java.util.Random;

public class ReeseBingoMachine <E extends Comparable<E>> {
    private Random rng;
    private ArrayList<E> contents;
   
    public ReeseBingoMachine(){

        this.rng = new Random();
        this.contents = new ArrayList<>();
    }

    public void add(E newItem){
        this.contents.add(newItem);
    }


    public E pickItem(){
        int max = this.contents.size();

        int chosen = this.rng.nextInt(max);

        return this.contents.get(chosen);
    }


    public boolean isEmpty(){
        return this.contents.isEmpty();
    }

    public void clear(){
        this.contents.clear();
    }
}

