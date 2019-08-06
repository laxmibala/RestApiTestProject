package DesignPatterns.FactoryDesignPatterns;

public class PdfReadFile implements ReadFile {

    public PdfReadFile(){
        ReadFile();
    }
    @Override
    public void ReadFile() {
        System.out.println("File downloaded in PDF format");
    }
}
