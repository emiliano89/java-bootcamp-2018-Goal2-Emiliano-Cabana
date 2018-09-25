package bootcamp;

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
    
    public String appToString() {
    return name +" "+ path;
    }
    
    public static void main( String[] args ) {
    
   }
}
