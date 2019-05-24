import java.util.ArrayList;

public class NegativeNumberException extends Exception{

    public NegativeNumberException(ArrayList<Integer> nu) {

        System.out.println("NO NEGATIVE NUMBERS ALLOWED "+nu);
    }
}
