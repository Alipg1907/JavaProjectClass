package Class21;

abstract public class File {

    public abstract void open();
    String name;
    long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public void edit() {
        System.out.println("Editing file: " + name);
    }

    public void close() {
        System.out.println("Closing file: " + name);
    }

    // Abstract method for open

}

class JavaFile extends File {
    public JavaFile(String name, long size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Opening Java file: " + super.name);
    }
}

class WordFile extends File {
    public WordFile(String name, long size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Opening Word file: " + super.name);
    }
}

class PdfFile extends File {
    public PdfFile(String name, long size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF file: " + super.name);
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