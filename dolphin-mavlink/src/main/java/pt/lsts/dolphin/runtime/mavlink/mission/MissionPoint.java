package pt.lsts.dolphin.runtime.mavlink.mission;

import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.common.msg_mission_item;
import com.MAVLink.enums.MAV_CMD;
import pt.lsts.dolphin.runtime.Position;
import pt.lsts.dolphin.runtime.mavlink.MAVLinkNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class MissionPoint extends DroneCommand {

    private Position positionLocation;

    protected MissionPoint(Position pointLocation) {
        this.positionLocation = pointLocation;
    }

    public Position getPositionLocation() {
        return positionLocation;
    }

    @Override
    public boolean executeOnStartup() {
        return true;
    }

    @Override
    public Collection<MAVLinkMessage> toMavLinkMessage(MAVLinkNode dest) {
        return toMavLinkMessage(dest, 0);
    }

    public abstract Collection<MAVLinkMessage> toMavLinkMessage(MAVLinkNode dest, int node);

    public int messageCount() {
        return 1;
    }
}
