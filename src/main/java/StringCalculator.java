import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


        String[] numberSeperated = numbers.split(",");          // Separate number by all "," and putting them in an int array.
        int[] ints = new int[numberSeperated.length];                   // Ignores numbers larger then or equal to 1000
        for (int i = 0; i < numberSeperated.length; i++) {
            if (numberSeperated[i].equals("")) {
                numberSeperated[i] = String.valueOf(0);
            }

            if (numberSeperated[i].contains("-")) {                     // If any of the numbers are negative it grabs and puts in the negative number array
                negIntArray.add(Integer.valueOf(numberSeperated[i]));

            }
        }

        System.out.println("Negative numbers: "+negIntArray);

        if (!negIntArray.isEmpty()) {                                   // Throws exception of negative number when negative number detected
            throw new NegativeNumberException(negIntArray);
        }


        for (int i = 0; i < numberSeperated.length; i++) {
            ints[i] = Integer.parseInt(numberSeperated[i]);
            if (ints[i] >= 1000) {
                ints[i] = 0;
            }
        }
        sum = Arrays.stream(ints).sum();
        System.out.println(sum);                                        // Prints the sum of the selected numbers on console
        return sum;                                                     // Returns the sum of the short listed numbers
    }


    public int testNul(String num) {                                    // OLD OPDRACHT Ignored numbers that are null i.e. - "" - and puts them as zero
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



    public Integer AddNew(String numbers,  String d) throws NegativeNumberException {


        String [] startArray =numbers.split("]\n");
       numbers = startArray[1];
        System.out.println(numbers);


        numbers = numbers.replaceAll("[.\n//]", "");
        numbers = numbers.replaceAll(d, ",");
        int sum = 0;
        ArrayList<Integer> negIntArray = new ArrayList<>();


        String[] numberSeperated = numbers.split(",");          // Separate number by all "," and putting them in an int array.
        int[] ints = new int[numberSeperated.length];                   // Ignores numbers larger then or equal to 1000
        for (int i = 0; i < numberSeperated.length; i++) {
            if (numberSeperated[i].equals("")) {
                numberSeperated[i] = String.valueOf(0);
            }

            if (numberSeperated[i].contains("-")) {                     // If any of the numbers are negative it grabs and puts in the negative number array
                negIntArray.add(Integer.valueOf(numberSeperated[i]));

            }
        }

        System.out.println("Negative numbers: "+negIntArray);

        if (!negIntArray.isEmpty()) {                                   // Throws exception of negative number when negative number detected
            throw new NegativeNumberException(negIntArray);
        }


        for (int i = 0; i < numberSeperated.length; i++) {
            ints[i] = Integer.parseInt(numberSeperated[i]);
            if (ints[i] >= 1000) {
                ints[i] = 0;
            }
        }
        sum = Arrays.stream(ints).sum();
        System.out.println(sum);                                        // Prints the sum of the selected numbers on console
        return sum;                                                     // Returns the sum of the short listed numbers
    }

    public String delimitorDetect(String s){

        ArrayList<String> del = new ArrayList<>();
        String delimiters;
        ArrayList<String> del1 = new ArrayList<>();
        String[] secondBraket = new String[0];

        String anotherTry = null;

        String firstSplit = s;
        firstSplit = s.replaceAll("\\[", "è").replaceAll("]","°");
        if(firstSplit.contains("è")) {
            String[] arrOfStr = firstSplit.split("è");
            List<String> itemList = Arrays.asList(arrOfStr);
            String secondSplit = (String) itemList.get(1);
            secondBraket = secondSplit.split("°");


          

            for (int i = 0; i < secondBraket.length; i++) {
                del1.add(secondBraket[i]);
            }
       //     System.out.println(del1);
             anotherTry = secondBraket[0];

                   //< String.valueOf(del1).replaceAll("[//[//]","");
        }


        return anotherTry;
    }




}
