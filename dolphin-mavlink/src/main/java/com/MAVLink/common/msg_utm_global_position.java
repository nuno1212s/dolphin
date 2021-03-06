/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE UTM_GLOBAL_POSITION PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* The global position resulting from GPS and sensor fusion.
*/
public class msg_utm_global_position extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_UTM_GLOBAL_POSITION = 340;
    public static final int MAVLINK_MSG_LENGTH = 70;
    private static final long serialVersionUID = MAVLINK_MSG_ID_UTM_GLOBAL_POSITION;


      
    /**
    * Time of applicability of position (microseconds since UNIX epoch).
    */
    public long time;
      
    /**
    * Latitude (WGS84)
    */
    public int lat;
      
    /**
    * Longitude (WGS84)
    */
    public int lon;
      
    /**
    * Altitude (WGS84)
    */
    public int alt;
      
    /**
    * Altitude above ground
    */
    public int relative_alt;
      
    /**
    * Next waypoint, latitude (WGS84)
    */
    public int next_lat;
      
    /**
    * Next waypoint, longitude (WGS84)
    */
    public int next_lon;
      
    /**
    * Next waypoint, altitude (WGS84)
    */
    public int next_alt;
      
    /**
    * Ground X speed (latitude, positive north)
    */
    public short vx;
      
    /**
    * Ground Y speed (longitude, positive east)
    */
    public short vy;
      
    /**
    * Ground Z speed (altitude, positive down)
    */
    public short vz;
      
    /**
    * Horizontal position uncertainty (standard deviation)
    */
    public int h_acc;
      
    /**
    * Altitude uncertainty (standard deviation)
    */
    public int v_acc;
      
    /**
    * Speed uncertainty (standard deviation)
    */
    public int vel_acc;
      
    /**
    * Time until next update. Set to 0 if unknown or in data driven mode.
    */
    public int update_rate;
      
    /**
    * Unique UAS ID.
    */
    public short uas_id[] = new short[18];
      
    /**
    * Flight state
    */
    public short flight_state;
      
    /**
    * Bitwise OR combination of the data available flags.
    */
    public short flags;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_UTM_GLOBAL_POSITION;
              
        packet.payload.putUnsignedLong(time);
              
        packet.payload.putInt(lat);
              
        packet.payload.putInt(lon);
              
        packet.payload.putInt(alt);
              
        packet.payload.putInt(relative_alt);
              
        packet.payload.putInt(next_lat);
              
        packet.payload.putInt(next_lon);
              
        packet.payload.putInt(next_alt);
              
        packet.payload.putShort(vx);
              
        packet.payload.putShort(vy);
              
        packet.payload.putShort(vz);
              
        packet.payload.putUnsignedShort(h_acc);
              
        packet.payload.putUnsignedShort(v_acc);
              
        packet.payload.putUnsignedShort(vel_acc);
              
        packet.payload.putUnsignedShort(update_rate);
              
        
        for (int i = 0; i < uas_id.length; i++) {
            packet.payload.putUnsignedByte(uas_id[i]);
        }
                    
              
        packet.payload.putUnsignedByte(flight_state);
              
        packet.payload.putUnsignedByte(flags);
        
        return packet;
    }

    /**
    * Decode a utm_global_position message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.time = payload.getUnsignedLong();
              
        this.lat = payload.getInt();
              
        this.lon = payload.getInt();
              
        this.alt = payload.getInt();
              
        this.relative_alt = payload.getInt();
              
        this.next_lat = payload.getInt();
              
        this.next_lon = payload.getInt();
              
        this.next_alt = payload.getInt();
              
        this.vx = payload.getShort();
              
        this.vy = payload.getShort();
              
        this.vz = payload.getShort();
              
        this.h_acc = payload.getUnsignedShort();
              
        this.v_acc = payload.getUnsignedShort();
              
        this.vel_acc = payload.getUnsignedShort();
              
        this.update_rate = payload.getUnsignedShort();
              
         
        for (int i = 0; i < this.uas_id.length; i++) {
            this.uas_id[i] = payload.getUnsignedByte();
        }
                
              
        this.flight_state = payload.getUnsignedByte();
              
        this.flags = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_utm_global_position(){
        msgid = MAVLINK_MSG_ID_UTM_GLOBAL_POSITION;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_utm_global_position(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_UTM_GLOBAL_POSITION;
        unpack(mavLinkPacket.payload);        
    }

                                        
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_UTM_GLOBAL_POSITION - sysid:"+sysid+" compid:"+compid+" time:"+time+" lat:"+lat+" lon:"+lon+" alt:"+alt+" relative_alt:"+relative_alt+" next_lat:"+next_lat+" next_lon:"+next_lon+" next_alt:"+next_alt+" vx:"+vx+" vy:"+vy+" vz:"+vz+" h_acc:"+h_acc+" v_acc:"+v_acc+" vel_acc:"+vel_acc+" update_rate:"+update_rate+" uas_id:"+uas_id+" flight_state:"+flight_state+" flags:"+flags+"";
    }
}
        