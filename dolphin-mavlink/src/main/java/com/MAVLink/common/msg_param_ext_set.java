/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE PARAM_EXT_SET PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* Set a parameter value. In order to deal with message loss (and retransmission of PARAM_EXT_SET), when setting a parameter value and the new value is the same as the current value, you will immediately get a PARAM_ACK_ACCEPTED response. If the current state is PARAM_ACK_IN_PROGRESS, you will accordingly receive a PARAM_ACK_IN_PROGRESS in response.
*/
public class msg_param_ext_set extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_PARAM_EXT_SET = 323;
    public static final int MAVLINK_MSG_LENGTH = 147;
    private static final long serialVersionUID = MAVLINK_MSG_ID_PARAM_EXT_SET;


      
    /**
    * System ID
    */
    public short target_system;
      
    /**
    * Component ID
    */
    public short target_component;
      
    /**
    * Parameter id, terminated by NULL if the length is less than 16 human-readable chars and WITHOUT null termination (NULL) byte if the length is exactly 16 chars - applications have to provide 16+1 bytes storage if the ID is stored as string
    */
    public byte param_id[] = new byte[16];
      
    /**
    * Parameter value
    */
    public byte param_value[] = new byte[128];
      
    /**
    * Parameter type: see the MAV_PARAM_EXT_TYPE enum for supported data types.
    */
    public short param_type;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_PARAM_EXT_SET;
              
        packet.payload.putUnsignedByte(target_system);
              
        packet.payload.putUnsignedByte(target_component);
              
        
        for (int i = 0; i < param_id.length; i++) {
            packet.payload.putByte(param_id[i]);
        }
                    
              
        
        for (int i = 0; i < param_value.length; i++) {
            packet.payload.putByte(param_value[i]);
        }
                    
              
        packet.payload.putUnsignedByte(param_type);
        
        return packet;
    }

    /**
    * Decode a param_ext_set message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.target_system = payload.getUnsignedByte();
              
        this.target_component = payload.getUnsignedByte();
              
         
        for (int i = 0; i < this.param_id.length; i++) {
            this.param_id[i] = payload.getByte();
        }
                
              
         
        for (int i = 0; i < this.param_value.length; i++) {
            this.param_value[i] = payload.getByte();
        }
                
              
        this.param_type = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_param_ext_set(){
        msgid = MAVLINK_MSG_ID_PARAM_EXT_SET;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_param_ext_set(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_PARAM_EXT_SET;
        unpack(mavLinkPacket.payload);        
    }

         
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setParam_Id(String str) {
        int len = Math.min(str.length(), 16);
        for (int i=0; i<len; i++) {
            param_id[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<16; i++) {            // padding for the rest of the buffer
            param_id[i] = 0;
        }
    }

    /**
    * Gets the message, formated as a string
    */
    public String getParam_Id() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 16; i++) {
            if (param_id[i] != 0)
                buf.append((char) param_id[i]);
            else
                break;
        }
        return buf.toString();

    }
                          
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setParam_Value(String str) {
        int len = Math.min(str.length(), 128);
        for (int i=0; i<len; i++) {
            param_value[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<128; i++) {            // padding for the rest of the buffer
            param_value[i] = 0;
        }
    }

    /**
    * Gets the message, formated as a string
    */
    public String getParam_Value() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 128; i++) {
            if (param_value[i] != 0)
                buf.append((char) param_value[i]);
            else
                break;
        }
        return buf.toString();

    }
                           
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_PARAM_EXT_SET - sysid:"+sysid+" compid:"+compid+" target_system:"+target_system+" target_component:"+target_component+" param_id:"+param_id+" param_value:"+param_value+" param_type:"+param_type+"";
    }
}
        