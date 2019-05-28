import org.junit.Test;

import static org.junit.Assert.*;



public class StringCalculatorTest {

    private StringCalculator sc = new StringCalculator();


    @Test
    public void AddNewTest() throws NegativeNumberException {
        String numbers = "//[***]\n***2***3,2";
        String del = sc.delimitorDetect(numbers);
        sc.AddNew(numbers,del);

            }

    @Test
    public void testNul1() throws NegativeNumberException {
        String totalNum = "1,3,;,,,,1000,2,;;;2,2\n\n...";
        Integer exp = 10;
        Integer ans = sc.Add(totalNum);
        System.out.println("TOTAL COUNT "+sc.GetCalledCount());
        assertEquals(exp,ans);
    }


}