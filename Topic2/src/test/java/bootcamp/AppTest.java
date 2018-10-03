package bootcamp;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

   @Test
    public void WhenRunForTheFirstTimeThenTheListIsEmpty(){
    App app = new App();
    List list = app.getList();
    assertTrue(list.isEmpty());
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
    assertEquals("jpg D:/", app.getItemList(1));
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
    assertEquals("2 C:/", app.getItemList(1));
    assertEquals("3 C:/", app.getItemList(2));
    assertEquals("4 D:/", app.getItemList(3));
    assertEquals("5 C:/", app.getItemList(4));
    assertEquals("6 E:/", app.getItemList(5));
    assertEquals("7 C:/", app.getItemList(6));
    assertEquals("8 F:/", app.getItemList(7));
    assertEquals("9 C:/", app.getItemList(8));
    assertEquals("10 D:/", app.getItemList(9));
    assertEquals("11 C:/", app.getItemList(10));
    assertEquals("12 C:/", app.getItemList(11));
    assertEquals("13 E:/", app.getItemList(12));
    assertEquals("14 C:/", app.getItemList(13));
    assertEquals("15 D:/", app.getItemList(14));
    }
}

