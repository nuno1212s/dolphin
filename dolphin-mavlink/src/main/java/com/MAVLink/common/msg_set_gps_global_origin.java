/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SET_GPS_GLOBAL_ORIGIN PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* As local waypoints exist, the global waypoint reference allows to transform between the local coordinate frame and the global (GPS) coordinate frame. This can be necessary when e.g. in- and outdoor settings are connected and the MAV should move from in- to outdoor.
*/
public class msg_set_gps_global_origin extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_SET_GPS_GLOBAL_ORIGIN = 48;
    public static final int MAVLINK_MSG_LENGTH = 21;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SET_GPS_GLOBAL_ORIGIN;


      
    /**
    * Latitude (WGS84), in degrees * 1E7
    */
    public int latitude;
      
    /**
    * Longitude (WGS84), in degrees * 1E7
    */
    public int longitude;
      
    /**
    * Altitude (AMSL), in meters * 1000 (positive for up)
    */
    public int altitude;
      
    /**
    * System ID
    */
    public short target_system;
      
    /**
    * Timestamp (microseconds since UNIX epoch or microseconds since system boot)
    */
    public long time_usec;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_SET_GPS_GLOBAL_ORIGIN;
              
        packet.payload.putInt(latitude);
              
        packet.payload.putInt(longitude);
              
        packet.payload.putInt(altitude);
              
        packet.payload.putUnsignedByte(target_system);
              
        packet.payload.putUnsignedLong(time_usec);
        
        return packet;
    }

    /**
    * Decode a set_gps_global_origin message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.latitude = payload.getInt();
              
        this.longitude = payload.getInt();
              
        this.altitude = payload.getInt();
              
        this.target_system = payload.getUnsignedByte();
              
        this.time_usec = payload.getUnsignedLong();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_set_gps_global_origin(){
        msgid = MAVLINK_MSG_ID_SET_GPS_GLOBAL_ORIGIN;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_set_gps_global_origin(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_SET_GPS_GLOBAL_ORIGIN;
        unpack(mavLinkPacket.payload);        
    }

              
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_SET_GPS_GLOBAL_ORIGIN - sysid:"+sysid+" compid:"+compid+" latitude:"+latitude+" longitude:"+longitude+" altitude:"+altitude+" target_system:"+target_system+" time_usec:"+time_usec+"";
    }
}
        