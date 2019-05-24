import java.util.Arrays;


import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class BULLSHIT {

        public Integer Add(String numbers) throws NegativeNumberException {
            numbers = numbers.replaceAll("[.\n//;]", "");
            String[] numberSeperated = numbers.split(",");
            int[] ints = new int[numberSeperated.length];
            for (int i = 0; i < numberSeperated.length; i++) {
                ints[i] = Integer.parseInt(numberSeperated[i]);
            }
            if (numbers.contains("-")) {
                int negativeNumber = numbers.indexOf('-');
                System.out.println(negativeNumber);
                // throw new NegativeNumberException(numbers.charAt(negativeNumber+1));
            } else {
                int num = 0;
                int sum = Arrays.stream(ints).sum();
                while (num != 0) {

                    int lastDigit = num % 10;

                    sum = sum + lastDigit;

                    num = num / 10;
                }


                System.out.println(sum);
                return sum;
            }
            return null;
        }

        public int testNul(String num) {
            int numberFinal;

            if (num.equals("")) {
                return 0;

            } else if (num.equals("0")) {
                return 0;
            } else if (num.equals("1")) {
                return 1;
            } else if (num.equals("2")) {
                return 2;
            }
            return 0;
        }
    }

    /*
    *
    * import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StringCalculator {

    private int count = 0;

    {
        count++;
    }

    public int getCount() {
        return count;
    }

    public int GetCalledCount() {

        return getCount();
    }


    public StringCalculator() {
    }

    public Integer Add(String numbers) throws NegativeNumberException {

        numbers = numbers.replaceAll("[.\n//]", "");
        numbers = numbers.replaceAll(";", ",");
        int sum = 0;
        ArrayList<Integer> negIntArray = new ArrayList<>();

        String[] numberSeperated = numbers.split(",");
        for (int i = 0; i < numberSeperated.length; i++) {
            if (numberSeperated[i].equals("")) {
                numberSeperated[i] = String.valueOf(0);
            }
        }

        for (int i = 0; i < numberSeperated.length; i++) {
            if (numberSeperated[i].contains("-")) {
                negIntArray.add(Integer.valueOf(numberSeperated[i]));
                throw new NegativeNumberException(negIntArray);
            }
        }
        System.out.println(negIntArray);


        int[] ints = new int[numberSeperated.length];
        for (int i = 0; i < numberSeperated.length; i++) {
            ints[i] = Integer.parseInt(numberSeperated[i]);
            if (ints[i] >= 1000) {
                ints[i] = 0;
            }
        }
        sum = Arrays.stream(ints).sum();
        System.out.println(sum);
        return sum;
    }





    public int testNul(String num) {
        int numberFinal;

        if (num.equals("")) {
            return 0;

        } else if (num.equals("0")) {
            return 0;
        } else if (num.equals("1")) {
            return 1;
        } else if (num.equals("2")) {
            return 2;
        }
        return 0;
    }
}

    *
    *
    * */


