import bl.com.maxmin.FindMaximum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringMaximumTest {
    @Test
    public void findMaxTC1(){
        String stringValue1 = "Mango" , stringValue2 = "PineApple" , stringValue3 = "Orange";
        FindMaximum find = new FindMaximum(stringValue1, stringValue2, stringValue3);
        String maxStringValue = (String) find.testMaximum();
        Assertions.assertEquals("PineApple", maxStringValue);
    }
    @Test
    public void findMaxTC2(){
        String stringValue1 = "Guava" , stringValue2 = "PineApple" , stringValue3 = "Orange";
        FindMaximum find = new FindMaximum(stringValue1, stringValue2, stringValue3);
        String maxStringValue = (String) find.testMaximum();
        Assertions.assertEquals("PineApple", maxStringValue);
    }
    @Test
    public void FindMaxTC3(){
        String stringValue1 = "Guava" , stringValue2 = "Apple" , stringValue3 = "Pineapple";
        FindMaximum find = new FindMaximum(stringValue1, stringValue2, stringValue3);
        String maxStringValue = (String) find.testMaximum();
        Assertions.assertEquals("Pineapple", maxStringValue);
    }
}
