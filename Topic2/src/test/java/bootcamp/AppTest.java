package bootcamp;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

   @Test
    public void WhenRunForTheFirstTimeThenTheListIsEmpty(){
    App app = new App();
    List list = app.getList();
    app.cleanList();
    assertEquals("[]", list.toString());
    }
 
    @Test
    public void WhenIsOpenedAddToRecentFileList() {
    App file = new App();
    file.openFile("txt", "C:/");
    List list = file.getList();
    assertEquals("[txt C:/]", list.toString());
    }
 
    @Test
    public void WhenIsOpenedFileAlreadyExistsNotDuplicated() {
    App app = new App();
    app.cleanList();
    app.openFile("txt","C:/");
    app.openFile("txt","C:/");
    assertFalse(app.isDuplicated("[txt C:/]"));
    }
    
    @Test
    public void WhenIsOpenedFileAlreadyExistsItIsBumpedToTheTop() {
    App app = new App();
    app.cleanList();
    app.openFile("jpg","D:/");
    app.openFile("txt","C:/");
    app.openFile("txt","C:/");
    assertEquals("txt C:/", app.getItemList(0));
    }
    
    @Test
    public void WhenRecentFileListGetsFullOldestItemRemoved() {
    App app = new App();
    app.cleanList();
    app.openFile("1","D:/");
    app.openFile("2","C:/");
    app.openFile("3","C:/");
    app.openFile("4","D:/");
    app.openFile("5","C:/");
    app.openFile("6","E:/");
    app.openFile("7","C:/");
    app.openFile("8","F:/");
    app.openFile("9","C:/");
    app.openFile("10","D:/");
    app.openFile("11","C:/");
    app.openFile("12","C:/");
    app.openFile("13","E:/");
    app.openFile("14","C:/");
    app.openFile("15","D:/");
    app.openFile("16","C:/");
    assertEquals("16 C:/", app.getItemList(0));
    }
}

