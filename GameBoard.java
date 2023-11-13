class GameBoard {
    int width;
    int length;
    SceneType sceneType;
    List<House> houses = new ArrayList<>();
    List<Character> characters = new ArrayList<>();

    public GameBoard(int width, int length, SceneType sceneType, int numHouses) {
        this.width = width;
        this.length = length;
        this.sceneType = sceneType;

        // Create houses with random positions for simplicity
        for (int i = 0; i < numHouses; i++) {
            int randomX = (int) (Math.random() * width);
            int randomY = (int) (Math.random() * length);
            Position housePosition = new Position(randomX, randomY);
            Size houseSize = new Size(5, 5); // Adjust as needed
            String houseMaterial = getHouseMaterial();
            House house = new House(housePosition, houseSize, houseMaterial);
            houses.add(house);
        }
    }

    // Method to render the entire game board
    public void render() {
        System.out.println("Game Board:");
        for (House house : houses) {
            house.render();
        }
        for (Character character : characters) {
            character.render();
        }
    }

    // Method to add a character to the game board
    public void addCharacter(Character character) {
        characters.add(character);
    }

    // Helper method to get house material based on scene type
    private String getHouseMaterial() {
        switch (sceneType) {
            case EUROPEAN:
                return "Concrete";
            case ASIAN:
                return "Bamboo";
            case AFRICAN:
                return "Wail and Cane";
            default:
                return "Unknown Material";
        }
    }
}