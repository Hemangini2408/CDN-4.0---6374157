public class DocumentFactory {
    public static Document getDocument(DocumentType type) {
        switch (type) {
            case WORD:
                return new DocumentImpl.WordDocument();
            case PDF:
                return new DocumentImpl.PdfDocument();
            case EXCEL:
                return new DocumentImpl.ExcelDocument();
            default:
                throw new IllegalArgumentException("Unsupported document type.");
        }
    }
}
