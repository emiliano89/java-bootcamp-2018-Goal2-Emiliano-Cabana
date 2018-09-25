package bootcamp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    @Test
    public void WhenRunForTheFirstTimeThenTheListIsEmpty(){
    App app = new App();
    List recent = app.RecentFiles();
    //assertEquals(recent.size(), 0);
    assertTrue(recent.isEmpty());
     }
    
}

