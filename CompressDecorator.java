 public class CompressDecorator implements DataSource {
    private DataSource source;

    public CompressDecorator(DataSource source) {
        this.source = source;
    }

    @Override
    public String read(String file) {
        String compressedContent = source.read(file);
        return decompress(compressedContent);
    }

    @Override
    public void write(String file, String content) {
        String compressedContent = compress(content);
        source.write(file, compressedContent);
    }

    private String compress(String content) {
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            GZipOutputStream gzip = new GZipOutputStream(os);
            gzip.write(content.getBytes());
            gzip.close();
            byte[] compressedBytes = os.toByteArray();
            return Base64.getEncoder().encodeToString(compressedBytes);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }