package TestExam6;

import org.junit.Assert;
import org.junit.Test;

public class BuggyTest {

    @Test
    public void bugArrayTest() {
        int[] array = {1, 2, 4, 5, 3};
        int[] array2 = {1, 2, 4, 5, 3};
        BuggyClass.SweepSort(array);
        int[] act = {1, 2, 3, 4, 5};
        Assert.assertEquals(act, array);
    }
}
