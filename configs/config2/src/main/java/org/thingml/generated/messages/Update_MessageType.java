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

public class Update_MessageType extends EventType {
public Update_MessageType(short code) {super("update_", code);
}

public Update_MessageType() {
super("update_", (short) 12);
}

public Event instantiate(final byte var24) { return new Update_Message(this, var24); }
public Event instantiate(Map<String, Object> params) {return instantiate((Byte) params.get("var24"));
}

public class Update_Message extends Event implements java.io.Serializable {

public final byte var24;
public String toString(){
return "update_ (" + "var24: " + var24 + ")";
}

protected Update_Message(EventType type, final byte var24) {
super(type);
this.var24 = var24;
}
public Event clone() {
return instantiate(this.var24);
}}

}
