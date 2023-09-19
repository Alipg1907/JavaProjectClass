package Class21;

public class FileTester {
    public static void main(String[] args) {
        File javaFile = new JavaFile("MyJavaCode.java", 1024);
        File wordFile = new WordFile("Document.docx", 2048);
        File pdfFile = new PdfFile("Presentation.pdf", 3072);

        javaFile.open();
        javaFile.edit();
        javaFile.close();

        wordFile.open();
        wordFile.edit();
        wordFile.close();

        pdfFile.open();
        pdfFile.edit();
        pdfFile.close();
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