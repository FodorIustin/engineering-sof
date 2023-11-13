class Character {
    Position position;
    Size size;
    String type; // Human, Elf, etc.

    public Character(Position position, Size size, String type) {
        this.position = position;
        this.size = size;
        this.type = type;
    }

    // Method to render the character details
    public void render() {
        System.out.println(type + " at (" + position.x + ", " + position.y + ")");
        System.out.println("Size: " + size.width + "x" + size.length);
    }

    // Method to move the character to a new position
    public void moveTo(Position newPosition) {
        // Add validation logic here to check if the new position is valid
        // For example, check for collisions with houses
        // If the move is valid, update the position
        this.position = newPosition;
    }
}