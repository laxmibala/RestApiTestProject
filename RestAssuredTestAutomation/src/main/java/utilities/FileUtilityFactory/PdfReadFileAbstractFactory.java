package utilities.FileUtilityFactory;

import DesignPatterns.FactoryDesignPatterns.ReadFile;
import DesignPatterns.FactoryDesignPatterns.PdfReadFile;

public class PdfReadFileAbstractFactory implements ReadFileAbstractFactory {

    @Override
    public ReadFile readFile() {
        return new PdfReadFile();
    }
}
