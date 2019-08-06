package utilities.FileUtilityFactory;

import DesignPatterns.FactoryDesignPatterns.ReadFile;

public interface ReadFileFactory {
   /* public static FileDownload getFileType(Constants.FileType fileType){
        FileDownload fileDownload =null;
        switch (fileType){
            case PDF:
                fileDownload =new PdfFileDownload();
                break;
            case EXCEL:
                fileDownload=new ExcelFileDownload();
                break;
            case XML:
                fileDownload=new XmlFileDownload();
                break;
        }
        return  fileDownload;}*/

    public static ReadFile downloadFile(ReadFileAbstractFactory readFileAbstractFactory){
        return readFileAbstractFactory.readFile();

    }




}
