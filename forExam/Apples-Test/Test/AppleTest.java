import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppleTest {

  private Apple almacska;


    @Test
    public void alma() {
        almacska = new Apple("Apple");
        String expectedName = "Apple";
        String resultName = almacska.getName();
        System.out.println("nameCheck");
        //TODO Assert
        assertEquals("Apple is not Apple", expectedName, resultName);
        //Check that a condition is true
        //assertTrue (val1 < val2);

        //Check that a condition is false
        //assertFalse(val1 > val2);

        //Check that an object isn't null
        //assertNotNull(str1);

        //Check that an object is null
        //assertNull(str3);

        //Check if two object references point to the same object
        //assertSame(str4,str5);

        //Check if two object references not point to the same object
        //assertNotSame(str1,str3);

        //Check whether two arrays are equal to each other.
        //assertArrayEquals(expectedArray, resultArray);

    }
}