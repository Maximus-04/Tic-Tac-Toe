import java.util.Scanner;

/**
 * The main class serves as the entry point of the program.
 * It initializes the game grid and a player, then prints relevant details.
 */
public class main {
    /**
     * The main method that initializes a grid and a player, then displays their details.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Initialize a grid with specified dimensions
        initializeGrid grid = new initializeGrid(5, 5);
        System.out.println("the Grid Dimensions: " + grid.getRows() + grid.getCols());
        
        // Create a player with a name, health bar, and lives
        Player player = new Player("Max", 100, 3);
        System.out.println("Player Name: " + player.getName());
        System.out.println("Health: " + player.getHealthBar());
        System.out.println("Lives: " + player.getLiveCount());
    }
}
