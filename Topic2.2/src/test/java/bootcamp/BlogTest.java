import bootcamp.Blog;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

public class BlogTest {
    
   Blog blog = new Blog();
   String entry = null;
    
   @Test
   public void testPostEntry() {
   assertThat(blog.postEntry("hello"), is("hello"));
   }
   
   @Test
   public void testDeleteEntry() {
   blog.postEntry("hello");
   assertTrue(blog.deleteEntry(0));
   }
   
   @Test
   public void whenAddMoreThanTenRecentEntriesThenDeleteOldestEntries() {
    blog.recentEntries(entry = "a");
    blog.recentEntries(entry = "b");
    blog.recentEntries(entry = "c");
    blog.recentEntries(entry = "d");
    blog.recentEntries(entry = "e");
    blog.recentEntries(entry = "f");
    blog.recentEntries(entry = "g");
    blog.recentEntries(entry = "h");
    blog.recentEntries(entry = "i");
    blog.recentEntries(entry = "j");
    blog.recentEntries(entry = "k");
    blog.recentEntries(entry = "l");
    assertEquals("[k, l, c, d, e, f, g, h, i, j]", blog.recentEntryList().toString());
   }

}