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
    }
}