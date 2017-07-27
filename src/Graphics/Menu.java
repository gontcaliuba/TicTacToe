package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

/**
 * Created by Liuba on 23.06.2017.
 */
public class Menu {
    GraphicEngine graphicEngine;
    List<String> menuOptions;
    JMenuBar menubar;
    JMenu menu;
    public Menu(GraphicEngine graphicEngine)
    {
        this.graphicEngine = graphicEngine;
        this.menuOptions = menuOptions;
        menubar = new JMenuBar();
        menu = new JMenu("File");
    }

    public void createMenuBar() {
        JMenuItem newGameItem = new JMenuItem("New Game");
        JMenuItem exitItem = new JMenuItem("Exit");
        newGameItem.addActionListener((ActionEvent event) -> {
             int i = JOptionPane.showConfirmDialog((Component) null, "Do you want to finish this game and start a new one?",
                    "alert", JOptionPane.OK_CANCEL_OPTION);
             if (i == 0)
                 graphicEngine.showNewGameSettings();
        });
        exitItem.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });
        menu.add(newGameItem);
        menu.add(exitItem);
        menubar.add(menu);
        graphicEngine.setJMenuBar(menubar);
    }

}
