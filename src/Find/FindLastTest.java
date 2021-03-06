package Find;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class FindLastTest
{
    // this test fails!
    @Test public void lastOccurrenceInFirstElement()
    {
        int[] arr = {2, 3,5};
        int y = 2;
        assertEquals("Last occurrence in first element", 0, FindLast.findLast(arr, y));
    }

    // ----------------------------------------------------------------

    //2 not first position
    @Test(expected = NullPointerException.class)
    public void lastOccNoFault(){
        int[] arr = null;
        int y = 2;
        FindLast.findLast(arr,y);
    }

    @Test
    //3 still skips first position however expected is -1 so no error
    public void lastOccNotInArray(){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int y = 3;
        assertEquals( 2,FindLast.findLast(arr,y));
    }

    //4 typo in test => error however program still does as expected.
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

