import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import static java.lang.System.currentTimeMillis;

public class Lotto {
    public static void main(String[] args){
        boolean stop = false;
        long start,end;
        start = currentTimeMillis();
        int draws=0;
        while(!stop){
            stop = Gamble(args);
            draws++;
        }
        end = currentTimeMillis();
        System.out.println("Congrats! \n time of execution: "+(end-start)+"ms");
        System.out.println("Number of draws: "+draws);
    }
    public static Boolean Gamble(String[] args){
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int hits=0;
        for (int i = 0;i<6;i++) {
            int r = rand.nextInt(50);
            list.add(r);
            //System.out.println(list.get(i));
            if(list.get(i)== Integer.parseInt(args[i])){
                //System.out.println("Right!");
                hits++;
            }
            //else System.out.println("Wrong");
        }
        //System.out.println("You've hit "+hits +" times!");
        return hits == 6;
    }

}