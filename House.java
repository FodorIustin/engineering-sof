class House {
    Position position;
    Size size;
    String material;

    public House(Position position, Size size, String material) {
        this.position = position;
        this.size = size;
        this.material = material;
    }

    // Method to render the house details
    public void render() {
        System.out.println("House at (" + position.x + ", " + position.y + ")");
        System.out.println("Size: " + size.width + "x" + size.length);
        System.out.println("Material: " + material);
    }
}