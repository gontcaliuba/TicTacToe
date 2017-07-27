package Messages;

import Connector.Coordinate;

/**
 * Created by Liuba on 20.05.2017.
 */
public class ButtonMessage {
    Coordinate buttonCoordinate;
    public ButtonMessage(Coordinate buttonCoordinate) { this.buttonCoordinate = buttonCoordinate; }
    public ButtonMessageType getMessageType(){ return null; }
    public Coordinate getButtonCoordinate() { return buttonCoordinate; }
}
