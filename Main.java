public class Main {
    public static void main(String[] args) {
        DataSource source = new FileDataSource();
        source = new EncryptDecorator(source);
        source = new CompressDecorator(source);

        String content = "Hello, this is a test string for encryption and compression.";
        String file = "data.txt";

        source.write(file, content);
        String readContent = source.read(file);
        System.out.println("Read content: " + readContent);
    }
}

