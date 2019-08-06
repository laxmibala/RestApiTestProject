package StepDefinition;
import DesignPatterns.FactoryDesignPatterns.*;
import cucumber.api.java.en.Given;
import utilities.FileUtilityFactory.ExcelReadFileAbstractFactory;
import utilities.FileUtilityFactory.ReadFileFactory;
import utilities.FileUtilityFactory.PdfReadFileAbstractFactory;

public class FileDownloadSteps {

        @Given("^I have to download file in pdf format$")
        public void downloadInPdfFormat(){
          ReadFile readFile =  ReadFileFactory.downloadFile(new PdfReadFileAbstractFactory());
        }

        @Given("^I have to download file in excel format$")
         public void downloadInExcelFormat(){
        ReadFile readFile =  ReadFileFactory.downloadFile(new ExcelReadFileAbstractFactory());
         }



}
