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
{
    @Test
    public void WhenRunForTheFirstTimeThenTheListIsEmpty(){
    App app = new App();
    assertEquals(app.getFile().getName(), null);
    }
    
    @Test
    public void WhenIsOpenedAddToRecentFileList() {
    App app = new App();
    App file = app.getFile();
    file.setName("txt");
    file.setPath("C:/");
    List list = app.aList(file.getName(),file.getPath());
    assertEquals("["+file.getName()+" "+file.getPath()+"]" , list.toString());
    }
}

