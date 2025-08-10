public class PdfDocumentCreator extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}