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
      
   Blog Mockblog = mock(Blog.class);
   MainBlog mainblog = new MainBlog(Mockblog);
   
   @Test
   public void testPostEntry(){
//      entry = "Hello world";
      when(Mockblog.postEntry("Hello world")).thenReturn("Hello world");
      assertEquals("Hello world", mainblog.postEntry("Hello world"));
   }
   
   @Test
   public void testDeleteEntry() { 
      int i = 0;
      when(Mockblog.deleteEntry(i)).thenReturn(null);
      assertEquals(null, mainblog.deleteEntry(i));
   }
      
   @Test
   public void testMostRecentEntries() {
    List mockList = new ArrayList();
    when(Mockblog.recentEntries(entry)).thenCallRealMethod();
    mockList.add(mainblog.recentEntries(entry = "a"));
    mockList.add(mainblog.recentEntries(entry = "b"));
    mockList.add(mainblog.recentEntries(entry = "c"));
    mockList.add(mainblog.recentEntries(entry = "d"));
    mockList.add(mainblog.recentEntries(entry = "e"));
    mockList.add(mainblog.recentEntries(entry = "f"));
    mockList.add(mainblog.recentEntries(entry = "g"));
    mockList.add(mainblog.recentEntries(entry = "h"));
    mockList.add(mainblog.recentEntries(entry = "i"));
    mockList.add(mainblog.recentEntries(entry = "j"));
    mockList.add(mainblog.recentEntries(entry = "k"));
    mockList.add(mainblog.recentEntries(entry = "l"));
    when(Mockblog.recentEntryList()).thenReturn(mockList);
    assertEquals("[k, l, c, d, e, f, g, h, i, j]", mainblog.recentEntryList().toString());
   }
}