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

public class DisplayReady_MessageType extends EventType {
public DisplayReady_MessageType(short code) {super("displayReady_", code);
}

public DisplayReady_MessageType() {
super("displayReady_", (short) 35);
}

public Event instantiate(final byte var47) { return new DisplayReady_Message(this, var47); }
public Event instantiate(Map<String, Object> params) {return instantiate((Byte) params.get("var47"));
}

public class DisplayReady_Message extends Event implements java.io.Serializable {

public final byte var47;
public String toString(){
return "displayReady_ (" + "var47: " + var47 + ")";
}

protected DisplayReady_Message(EventType type, final byte var47) {
super(type);
this.var47 = var47;
}
public Event clone() {
return instantiate(this.var47);
}}

}

