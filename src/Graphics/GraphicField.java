package Graphics;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Liuba on 23.06.2017.
 */
public class GraphicField
{
    JPanel panel;
    Dimension dimention;
    public GraphicField(JPanel panel, Dimension dimention)
    {
        this.panel = panel;
        this.dimention = dimention;
    }

    public JPanel getPanel() { return panel; }
    public Dimension getDimention() { return dimention; }
}
