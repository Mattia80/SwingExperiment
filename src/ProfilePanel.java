import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProfilePanel extends JPanel {

    private JTextField nameField;
    private JButton saveButton;
    private JLabel messageLabel;
    private GameWindow gameWindow;

    public ProfilePanel(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;

        JLabel titleLabel = new JLabel("Inserisci il tuo nome:");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel, gbc);

        gbc.gridy++;
        nameField = new JTextField(15);
        add(nameField, gbc);

        gbc.gridy++;
        saveButton = new JButton("Conferma");
        add(saveButton, gbc);

        gbc.gridy++;
        messageLabel = new JLabel("");
        messageLabel.setForeground(Color.RED);
        add(messageLabel, gbc);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                if (name.isEmpty()) {
                    messageLabel.setText("Inserisci un nome");
                } else {
                    System.out.println("Profilo salvato con successo");
                    gameWindow.showGamePanel();
                }
            }
        });
    }

}
