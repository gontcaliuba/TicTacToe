package Messages;

import Connector.Coordinate;

/**
 * Created by Liuba on 20.05.2017.
 */
public class ClickedButtonMessage extends ButtonMessage {
    public ClickedButtonMessage(Coordinate buttonCoordinate) { super(buttonCoordinate); }
    public ButtonMessageType getMessageType() { return ButtonMessageType.CLICKED; }
}
