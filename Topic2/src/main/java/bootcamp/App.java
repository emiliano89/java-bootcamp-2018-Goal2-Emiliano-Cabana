package bootcamp;

import java.util.ArrayList;
import java.util.List;

public class App 
{    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private String name = null;
    private String path = null;
    private App file = null;
    private List<String> list = new ArrayList();
    
    public App() {
    }
    
    public App(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public App openFile(String n, String p) {
      App a = new App(n,p);
      String obj = a.appToString();
      if(list.contains(obj) == false) {
        file = a;
         if(list.size()<15) {
          list.add(n+" "+p);
         }
         else {
          list.set(0, n+" "+p);
         }
      }
      else {
          if(list.size()<15) {
           int index = list.lastIndexOf(obj);
           String last= list.get(index);
           String first = list.get(0);
           list.set(0, last);
           list.set(index, first);
         }
         else {
           list.set(14, n+" "+p);
           String last= list.get(14);
           String first = list.get(0);
           list.set(0, last);
           list.set(14, first);
         }
      }        
    return file;
    }
        
    public String getItemList(int a) {
      String item = list.get(a);
      return item;
    }
    
    public List getList() {
       return list;
    }
    
    public void cleanList() {
    list.clear();
    }
     
    public String appToString() {
    return name +" "+ path;
    }
    
    public boolean isDuplicated(String parameter) {
     boolean duplicate= false;
     int contador = 0;
     for(int i = 0; i< list.size(); i++) {
        if(parameter.equals(list.get(i)))
        {
          contador ++;
         if(contador > 1) {
         duplicate = true;
        }
        }

     }
     return duplicate;
    }
}
