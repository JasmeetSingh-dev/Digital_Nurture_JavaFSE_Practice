public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentCreator();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        DocumentFactory pdfFactory = new PdfDocumentCreator();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentCreator();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}