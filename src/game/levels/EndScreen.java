package game.levels;

import game.Game;
import game.Level;
import game.LevelManager;
import game.components.GameButton;
import game.components.GameLabel;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class EndScreen extends Level {

    public EndScreen(LevelManager levelManager, Game game) {
        super(levelManager, game);
    }

    @Override
    @SuppressWarnings("Duplicates")
    public JPanel constructLevel() {
        // GIF logo
        URL logoUrl = this.getClass().getResource("/resources/sprites/main-menu/sleutel-barricade-logo.gif");
        ImageIcon logoImage = new ImageIcon(logoUrl);
        JLabel logo = new JLabel(logoImage);
        logo.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));

        // Top panel
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(logo);

        // Text
        GameLabel congratulations = new GameLabel("Congratulations");
        congratulations.setFont(new Font("8BIT WONDER", Font.PLAIN, 24));

        GameLabel completed = new GameLabel("You completed the game");

        // Buttons
        GameButton quitButton = new GameButton("Exit", (e) -> game.exit() );

        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(quitButton);

        // Center panel
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.add(Box.createVerticalStrut(40));
        centerPanel.add(congratulations);
        centerPanel.add(Box.createVerticalStrut(20));
        centerPanel.add(completed);
        centerPanel.add(Box.createVerticalStrut(30));
        centerPanel.add(buttonPanel);

        // Center container panel
        JPanel centerContainerPanel = new JPanel();
        centerContainerPanel.add(centerPanel);

        // Window container panel
        JPanel containerPanel = new JPanel(new BorderLayout());
        containerPanel.add(topPanel, BorderLayout.PAGE_START);
        containerPanel.add(centerContainerPanel, BorderLayout.CENTER);

        setPanelBackgrounds(containerPanel, new Color(206, 206, 206));

        return containerPanel;
    }
}
