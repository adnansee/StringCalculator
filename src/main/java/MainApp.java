


public class MainApp {
    public static void main(String[] args) throws NegativeNumberException {

        StringCalculator c = new StringCalculator();
        String numbers = "//[ABC";

        String del = c.delimitorDetect(numbers);
        c.AddNew(numbers,del);


    }



}
