package bootcamp;

import java.util.ArrayList;
import java.util.Collections;
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
    
    public App() {
    }
    
    public App(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public App getFile() {
    if(file == null) {
      file = new App();
    }
    else {
    file = new App(name, path);
    }
    return file;
    }
    
    public List aList(String name, String path) {
     List list = new ArrayList();
     App f = new App(name, path);
      if(file.getFile() != null) {
        if (list.contains(f)) {
          Collections.reverse(list);
          }
        else {
          list.add(f.appToString());
          }
        }          
    return list;    
    }
    
    public String appToString() {
    return name +" "+ path;
    }
    
    public static void main( String[] args ) {
    
   }
}
