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

public class Update_bisvar4MessageType extends EventType {
public Update_bisvar4MessageType(short code) {super("update_bisvar4", code);
}

public Update_bisvar4MessageType() {
super("update_bisvar4", (short) 43);
}

public Event instantiate(final byte var55, final byte var4) { return new Update_bisvar4Message(this, var55, var4); }
public Event instantiate(Map<String, Object> params) {return instantiate((Byte) params.get("var55"), (Byte) params.get("var4"));
}

public class Update_bisvar4Message extends Event implements java.io.Serializable {

public final byte var55;
public final byte var4;
public String toString(){
return "update_bisvar4 (" + "var55: " + var55 + ", " + "var4: " + var4 + ")";
}

protected Update_bisvar4Message(EventType type, final byte var55, final byte var4) {
super(type);
this.var55 = var55;
this.var4 = var4;
}
public Event clone() {
return instantiate(this.var55, this.var4);
}}

}
