import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class javaShuffleProgram {
    public static void main(String[] args){


       Integer[] arr ={1,2,3,4,5,6,7};
       List<Integer> list= Arrays.asList(arr);
        Collections.shuffle(list);
        list.toArray(arr);
        System.out.println("After Shuffling :" +Arrays.toString(arr));
    }






}
