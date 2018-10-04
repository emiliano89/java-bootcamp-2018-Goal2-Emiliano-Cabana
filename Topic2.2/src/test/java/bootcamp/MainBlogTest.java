import bootcamp.Blog;
import bootcamp.MainBlog;
import java.util.ArrayList;
import java.util.List;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MainBlogTest {
    String entry = null;
      
   Blog mockblog = mock(Blog.class);
   MainBlog mainblog = new MainBlog(mockblog);
   
   @Test
   public void testPostEntry(){
      when(mockblog.postEntry("Hello world")).thenReturn("Hello world");
      assertEquals("Hello world", mainblog.postEntry("Hello world"));
   }
   
   @Test
   public void testDeleteEntry() { 
      int i = 0;
      mainblog.postEntry("hello");
      when(mockblog.deleteEntry(i)).thenReturn(true);
      assertTrue(mainblog.deleteEntry(i));
   }
      
   @Test
   public void testMostRecentEntries() {
    List mockList = new ArrayList();
    when(mockblog.recentEntries(entry)).thenCallRealMethod();
    mainblog.recentEntries(entry = "a");
    mainblog.recentEntries(entry = "b");
    mainblog.recentEntries(entry = "c");
    mainblog.recentEntries(entry = "d");
    mainblog.recentEntries(entry = "e");
    mainblog.recentEntries(entry = "f");
    mainblog.recentEntries(entry = "g");
    mainblog.recentEntries(entry = "h");
    mainblog.recentEntries(entry = "i");
    mainblog.recentEntries(entry = "j");
    mainblog.recentEntries(entry = "k");
    mockList.add(mainblog.recentEntries(entry = "l"));
    when(mockblog.recentEntryList()).thenReturn(mockList);
    assertEquals("[k, l, c, d, e, f, g, h, i, j]", mainblog.recentEntryList().toString());
   }
}