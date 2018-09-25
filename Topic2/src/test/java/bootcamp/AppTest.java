package bootcamp;

import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest 
    //extends TestCase
{
    @Test
    public void WhenRunForTheFirstTimeThenTheListIsEmpty(){
    App app = new App();
    
    assertEquals(app.getFile().getName(), null);
     }
    
    
}

