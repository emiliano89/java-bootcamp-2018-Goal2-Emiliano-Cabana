package bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Blog{
    private List<String> list = new ArrayList<>();
    private List<String> recentList = new ArrayList<>();
    private int i = 0;
    private int t = 0;
    boolean isFull = false;
    
    public String postEntry(String entry) {
       int i = list.size();
      list.add(entry);
      String output = list.get(i);
      return output;
    }
    
    public boolean deleteEntry(int entry) {
      boolean output= false;
      if(entry < list.size() && entry >= 0 ) {
       list.remove(entry);
       output = true;
      }
      else {
      output = false;
      }
       return output;
    }
    
    public List recentEntries(String entry) {
     if (entry != null ) {
     if (i < 10 && isFull == false) {
                recentList.add(i, entry);
     }
     else {
         i = t;
         if (t<10) {
                    recentList.set(i, entry);
            isFull = true;
            t++;
         }
         else {
                    recentList.set(i, entry);
            t = 0;
         }
     }
     i++;
     }
     return recentList;
    }
    
    public List recentEntryList() {
    return recentList;
    }
    
}
