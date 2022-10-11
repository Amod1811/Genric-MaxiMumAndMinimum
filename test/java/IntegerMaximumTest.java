import bl.com.maxmin.FindMaximum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerMaximumTest {
    @Test
    public void findMaxTC1(){
        Integer intValue1 = 800, intValue2 = 557, intValue3 = 500;
        FindMaximum find = new FindMaximum(intValue1,intValue2,intValue3);
        Integer maxIntvalue = (Integer) find.testMaximum();
        Assertions.assertEquals(800,maxIntvalue);
    }
    @Test
    public void findMaxTC2(){
        Integer intValue1 = 800, intValue2 = 850, intValue3 = 500;
        FindMaximum find = new FindMaximum(intValue1,intValue2,intValue3);
        Integer maxIntvalue = (Integer) find.testMaximum();
        Assertions.assertEquals(850,maxIntvalue);
    }
    @Test
    public void FindMaxTC3(){
        Integer intValue1 = 800, intValue2 = 557, intValue3 = 930;
        FindMaximum find = new FindMaximum(intValue1,intValue2,intValue3);
        Integer maxIntvalue = (Integer) find.testMaximum();
        Assertions.assertEquals(800,maxIntvalue);
    }
}
