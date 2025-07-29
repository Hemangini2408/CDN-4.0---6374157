public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening an Excel spreadsheet...");
    }

    @Override
    public void close() {
        System.out.println("Closing the Excel spreadsheet.");
    }
}
