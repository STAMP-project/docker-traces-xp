/**
 * File generated by the ThingML IDE
 * /!\Do not edit this file/!\
 * In case of a bug in the generated code,
 * please submit an issue on our GitHub
 **/

package org.thingml.generated.messages;

import no.sintef.jasm.*;
import no.sintef.jasm.ext.*;

import java.util.*;
import java.nio.*;

public class Position_bis_MessageType extends EventType {
public Position_bis_MessageType(short code) {super("position_bis_", code);
}

public Position_bis_MessageType() {
super("position_bis_", (short) 46);
}

public Event instantiate(final byte var58) { return new Position_bis_Message(this, var58); }
public Event instantiate(Map<String, Object> params) {return instantiate((Byte) params.get("var58"));
}

public class Position_bis_Message extends Event implements java.io.Serializable {

public final byte var58;
public String toString(){
return "position_bis_ (" + "var58: " + var58 + ")";
}

protected Position_bis_Message(EventType type, final byte var58) {
super(type);
this.var58 = var58;
}
public Event clone() {
return instantiate(this.var58);
}}

}

