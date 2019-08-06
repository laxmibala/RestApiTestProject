package utilities.FileUtilityFactory;

import DesignPatterns.FactoryDesignPatterns.ExcelReadFile;
import DesignPatterns.FactoryDesignPatterns.ReadFile;

public class ExcelReadFileAbstractFactory implements ReadFileAbstractFactory {

    @Override
    public ReadFile readFile() {
        return new ExcelReadFile();
    }
}
