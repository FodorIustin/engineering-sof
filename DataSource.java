interface DataSource {
    String read(String file);
    void write(String file, String content);
}
