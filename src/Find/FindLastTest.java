package Find;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class FindLastTest
{
    // this test fails!
    @Test public void lastOccurrenceInFirstElement()
    {
        int arr[] = {2, 3,5};
        int y = 2;
        assertEquals("Last occurence in first element", 0, FindLast.findLast(arr, y));
    }

    // ----------------------------------------------------------------
    @Test
    //2 not first position => not fucked
    public void lastOccNoFault(){
        int arr[] = {0,1,2,3,4};
        int y = 2;
        assertEquals("not first position still error", 2,FindLast.findLast(arr,y));

    }

    @Test
    //3 still skips first position however expected is -1 so no error
    public void lastOccNotInArray(){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int y = 0;
        assertEquals("Something else fucked?", -1,FindLast.findLast(arr,y));
    }

    @Test public void lastOccurrenceInFirstElementFixed()
    {
        int arr[] = {2, 3,5};
        int y = 2;
        assertEquals("Last occurence in first element", 0, FindLast.findLastfixed(arr, y));
    }

    // ----------------------------------------------------------------
    @Test
    //2 not first position => not fucked
    public void lastOccNoFaultFixed(){
        int arr[] = {0,1,2,3,4};
        int y = 2;
        assertEquals("not first position still error", 2,FindLast.findLastfixed(arr,y));

    }

    @Test
    //3 still skips first position however expected is -1 so no error
    public void lastOccNotInArrayFixed(){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int y = 0;
        assertEquals("Something else fucked?", -1,FindLast.findLastfixed(arr,y));
    }
    /** error without fault not possible because fault -> error*/

    // -----------------------------------------------------------------
    // Add your tests below with a comment stating which question it belongs to

}

