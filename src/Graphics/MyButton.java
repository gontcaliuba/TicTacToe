package Graphics;

import Connector.ButtonConnector;
import Connector.Coordinate;
import Messages.ClickedButtonMessage;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


/**
 * Created by Liuba on 19.05.2017.
 */
public class MyButton extends JButton {
    ButtonConnector buttonConnector;
    Dimension buttonDimension;

    public MyButton(Dimension buttonDimension) {
        super("");
        this.buttonDimension = buttonDimension;
        this.setPreferredSize(buttonDimension);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseClicked(MouseEvent e) {
                onClick();
                }
        });
    }

    public void setButtonConnector(ButtonConnector buttonConnector) { this.buttonConnector = buttonConnector; }
    public void onClick()
    {
        buttonConnector.handleClick();
    }
    public void setSymbol(String symbol)
    {
        this.setText(symbol);
    }
    public Dimension getButtonDimension() { return buttonDimension;}
}