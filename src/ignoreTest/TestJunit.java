package ignoreTest;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

@Ignore
public class TestJunit {

   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
     
   @Test
   public void testPrintMessage() {
      System.out.println("Inside testPrintMessage()");
      message = "Robert";
      assertEquals(message,messageUtil.printMessage());
   }

   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
   }
	
}