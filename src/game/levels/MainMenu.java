package game.levels;

import game.Game;
import game.Level;
import game.LevelManager;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.net.URL;

/**
 * The main menu of the game.
 */
public class MainMenu extends Level {

    public MainMenu(LevelManager levelManager, Game game) {
        super(levelManager, game);
    }

    /**
     * GIF logo:
     *  - The main menu splash title.
     *
     * Buttons:
     *  - Interactable buttons that lead to a new 'level'.
     *
     * Images:
     *  - The images used in the main menu: the character, walls, barricades, etc.
     *
     * Top panel:
     *  - This is the top panel. This panel contains the splash title logo.
     *
     * Center panel:
     *  -This is the center panel. This panel contains the interactable buttons.
     *
     * Bottom panel:
     *  - This is the bottom panel. This panel contains the character image and an image container to group the wall and barricade image together.
     *
     *  - Bottom Image Container panel:
     *      - Images panel:
     *          - This is the bottom image container panel. This container panel contains the wall and barricade images.
     *
     * Window Container panel:
     *  - This is the window container panel. This container panel contains all present elements in the main menu.
     *
     * @return the window container panel that has and shows every element in the main menu.
     */
    @Override
    @SuppressWarnings("Duplicates")
    public JPanel constructLevel() {
        // GIF logo
        URL logoUrl = this.getClass().getResource("/resources/sprites/main-menu/sleutel-barricade-logo.gif");
        ImageIcon logoImage = new ImageIcon(logoUrl);
        JLabel logo = new JLabel(logoImage);
        logo.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));

        // Buttons
        JButton startButton = new JButton("Play");
        startButton.setPreferredSize(new Dimension(150, 50));
        startButton.setBackground(new Color(244, 194, 66));
        startButton.setFont(new Font("8BIT WONDER", Font.PLAIN, 28));
        startButton.setForeground(Color.WHITE);
        startButton.setBorder(new LineBorder(new Color(122, 122, 122)));
        startButton.setFocusPainted(false);
        startButton.addActionListener((e) -> {
            levelManager.load(Level1.class);
        });

        // Images
        URL characterUrl = this.getClass().getResource("/resources/sprites/main-menu/player.png");
        ImageIcon characterImage = new ImageIcon(characterUrl);
        JLabel character = new JLabel(characterImage);

        URL wallUrl = this.getClass().getResource("/resources/sprites/main-menu/wall.png");
        ImageIcon wallImage = new ImageIcon(wallUrl);
        JLabel wall = new JLabel(wallImage);

        URL barricadeUrl = this.getClass().getResource("/resources/sprites/main-menu/barricade.png");
        ImageIcon barricadeImage = new ImageIcon(barricadeUrl);
        JLabel barricade = new JLabel(barricadeImage);

        // Top panel
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(logo);

        // Center panel
        JPanel centerPanel = new JPanel();
        centerPanel.setBorder(BorderFactory.createEmptyBorder(25, 0, 0, 0));
        centerPanel.add(startButton);

        // Wall panel
        JPanel wallPanel = new JPanel();
        wallPanel.add(wall);

        // Barricade panel
        JPanel barricadePanel = new JPanel();
        barricadePanel.add(barricade);

        // Right images panel
        JPanel imagesPanel = new JPanel(new GridLayout(2,1));
        imagesPanel.add(wallPanel);
        imagesPanel.add(barricadePanel);

        // Container panel for images
        JPanel imagesContainerPanel = new JPanel(new BorderLayout());
        imagesContainerPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 30, 80));
        imagesContainerPanel.add(imagesPanel, BorderLayout.EAST);

        // Bottom panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.LINE_AXIS));
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(0, 80, 30, 0));
        bottomPanel.add(character);
        bottomPanel.add(Box.createHorizontalGlue());
        bottomPanel.add(imagesContainerPanel);

        // Window container panel
        JPanel containerPanel = new JPanel(new BorderLayout());
        containerPanel.add(topPanel, BorderLayout.PAGE_START); // Logo at the top of the window
        containerPanel.add(centerPanel, BorderLayout.CENTER); // Button in the center of the window
        containerPanel.add(bottomPanel, BorderLayout.SOUTH); // Images at the bottom of the window

        setPanelBackgrounds(containerPanel, new Color(206, 206, 206));

        return containerPanel;
    }

    /**
     * Set the background color of ALL JPanels by iterating through all components that are an instance of JPanel.
     * @param containerPanel
     */
    public void setPanelBackgrounds(JPanel containerPanel, Color color) {

        // Loop through all components of the given JPanel
        for (Component component: containerPanel.getComponents()) {

            // If this component is an instance of a JPanel
            if (component instanceof JPanel) {

                // Set the background color
                component.setBackground(color);

                // If this JPanel has any more child components that are an instance of JPanel
                if(component instanceof JPanel) {

                    // Recur
                    setPanelBackgrounds((JPanel) component, color);
                }
            }
        }
    }
}