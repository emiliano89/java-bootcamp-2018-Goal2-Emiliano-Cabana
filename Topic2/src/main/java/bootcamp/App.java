package bootcamp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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

    private String name;
    private String path;
    private App file = null;
    public List alist = null;
    
    public App() {
    }
    
    public App(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public App getFile(String name, String path) {
    if(file == null) {
      file = new App();
    }
    else {
      file = new App(name,path);
    }
    return file;
    }
    
    public String appToString() {
    return name +" "+ path;
    }
    
    public List RecentFiles(){
     String list = "";
    for(int i = 0; i<15 ; i++){
    if (file.getFile(name,path).toString() != null) {
    alist.add(file.appToString());
    }
    }
    return alist; 
    }

    public static void main( String[] args ) {
    
    App app = new App();
    List recent = app.RecentFiles();
    String name = app.name;
    String path = app.path;
   }
}
