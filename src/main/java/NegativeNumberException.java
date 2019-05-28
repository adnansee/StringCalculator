import java.util.ArrayList;

public class NegativeNumberException extends Exception{

    public NegativeNumberException(ArrayList<Integer> negativeNumber) {

        System.out.println("NO NEGATIVE NUMBERS ALLOWED "+ negativeNumber); //Message for exception of negative number
    }
}
