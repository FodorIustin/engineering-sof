public class Main {
    public static void main(String[] args) {
        // Example usage
        GameBoard gameBoard = new GameBoard(50, 50, SceneType.EUROPEAN, 5);

        // Create a character
        Character humanCharacter = new Character(new Position(0, 0), new Size(3, 3), "Human");

        // Add character to the game board
        gameBoard.addCharacter(humanCharacter);

        // Move the character to a new position
        humanCharacter.moveTo(new Position(10, 10));

        // Render the game board to check positions
        gameBoard.render();
    }
}