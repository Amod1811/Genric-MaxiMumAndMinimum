import bl.com.maxmin.FindMaximum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerMaximumTest {
    @Test
    public void findMaxTC1(){
        Float floatValue1 = 6.3f , floatValue2 = 2.5f , floatValue3 = 3.3f;
        FindMaximum find = new FindMaximum(floatValue1, floatValue2, floatValue3);
        Float maxFloatValue = (float) find.testMaximum();
        Assertions.assertEquals(6.3f, maxFloatValue);
    }
    @Test
    public void findMaxTC2(){
        Float floatValue1 = 1.5f , floatValue2 = 12.7f , floatValue3 = 7.9f;
        FindMaximum find = new FindMaximum(floatValue1, floatValue2, floatValue3);
        Float maxFloatValue = (float) find.testMaximum();
        Assertions.assertEquals(12.7f, maxFloatValue);
    }
    @Test
    public void FindMaxTC3(){
        Float floatValue1 = 5.7f , floatValue2 = 1.5f , floatValue3 = 15.1f;
        FindMaximum find = new FindMaximum(floatValue1, floatValue2, floatValue3);
        Float maxFloatValue = (float) find.testMaximum();
        Assertions.assertEquals(15.1f, maxFloatValue);
    }
}
