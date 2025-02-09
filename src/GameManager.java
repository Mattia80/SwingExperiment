public class GameManager {

    private GameWindow gameWindow;
    private GamePanel gamePanel;
    private ProfilePanel profilePanel;

    public GameManager() {
        this.gamePanel = new GamePanel();
        this.gameWindow = new GameWindow(gamePanel);
        this.profilePanel = new ProfilePanel(gameWindow);
        gameWindow.showProfilePanel(profilePanel);
    }
}
