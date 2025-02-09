import javax.swing.*;
import java.awt.*;

public class GameWindow  extends JFrame {

    public static final String GAME_PANEL = "gamePanel";
    public static final String PROFILE_PANEL = "profilePanel";

    private JPanel container;
    private CardLayout cardLayout;

    public GameWindow(GamePanel gamePanel) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        container = new JPanel(cardLayout);

        container.add(gamePanel, GAME_PANEL);
        setContentPane(container);
        setVisible(true);
    }

    public void showProfilePanel(ProfilePanel profilePanel) {
        container.add(profilePanel, PROFILE_PANEL);
        cardLayout.show(container, PROFILE_PANEL);
    }

    public void showGamePanel() {
        cardLayout.show(container, GAME_PANEL);
    }
}
