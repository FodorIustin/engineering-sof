 public class EncryptDecorator implements DataSource {
    private DataSource source;

    public EncryptDecorator(DataSource source) {
        this.source = source;
    }

    @Override
    public String read(String file) {
        String encryptedContent = source.read(file);
        return decrypt(encryptedContent);
    }

    @Override
    public void write(String file, String content) {
        String encryptedContent = encrypt(content);
        source.write(file, encryptedContent);
    }

    private String encrypt(String content) {
        byte[] encryptedBytes = Base64.getEncoder().encode(content.getBytes());
        return new String(encryptedBytes);
    }

    private String decrypt(String encryptedContent) {
        byte[] decryptedBytes = Base64.getDecoder().decode(encryptedContent);
        return new String(decryptedBytes);
    }
}