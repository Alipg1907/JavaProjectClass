package FileTask;

public abstract class File {
    private String name;
    private int size;

    public File(String name,int size){
        this.name = name;
        this.size = size;
    }
    public abstract void open();
    void edit(){
        System.out.println("Editing the file " + name);
    }
    public void close(){
        System.out.println("Closing the file "+name);
    }
}
class JavaFile extends File{
    public JavaFile(String name, int size){
        super(name,size);
    }
    public void open(){
        System.out.println("Opening javaFile using Intellij ");
    }
}
class WordFile extends File{
    public WordFile(String name,int size){
        super(name, size);

    }

    @Override
    public void open() {

    }
}
/*Create a class File that will have the following behaviors:
 open,edit,close and fields like name and size. Edit and close are
 implemented method while open is abstract. Create 3 subclasses:
 JavaFile, WordFile,PfdFile that will provide specific implementation of open
 behaviour:
 Example: to open . java file we need notepad++ or sublime text, open .docfile
 we need Microsoftword to be installed etc.
 Create a tester clas and call al of the methods from these classes. */