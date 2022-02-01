package Find;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Test2
{
    @Test public void lastOccurrenceInFirstElementFixed()
    {
        int[] arr = {2,3,5};
        int y = 2;
        assertEquals( 0, FindLast.findLastfixed(arr, y));
    }

    // ----------------------------------------------------------------
    @Test(expected = NullPointerException.class)
    public void lastOccNoFault(){
        int[] arr = null;
        int y = 2;
        FindLast.findLast(arr,y);
    }

    @Test
    //3 still skips first position however expected is -1 so no error
    public void lastOccNotInArrayFixed(){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int y = 0;
        assertEquals( -1,FindLast.findLastfixed(arr,y));
    }

    //4
    @Test
    public void errorNoFailure(){
        int[] arr = {1,2,3,4,5,6};
        int y = 0;
        assertEquals( -1, FindLast.findLast(arr,y));
    }
    /* error without fault not possible because fault -> error*/

    // -----------------------------------------------------------------
    // Add your tests below with a comment stating which question it belongs to

}

