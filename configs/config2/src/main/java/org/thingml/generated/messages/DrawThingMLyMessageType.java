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

public class DrawThingMLyMessageType extends EventType {
public DrawThingMLyMessageType(short code) {super("drawThingMLy", code);
}

public DrawThingMLyMessageType() {
super("drawThingMLy", (short) 42);
}

public Event instantiate(final byte var54, final int y) { return new DrawThingMLyMessage(this, var54, y); }
public Event instantiate(Map<String, Object> params) {return instantiate((Byte) params.get("var54"), (Integer) params.get("y"));
}

public class DrawThingMLyMessage extends Event implements java.io.Serializable {

public final byte var54;
public final int y;
public String toString(){
return "drawThingMLy (" + "var54: " + var54 + ", " + "y: " + y + ")";
}

protected DrawThingMLyMessage(EventType type, final byte var54, final int y) {
super(type);
this.var54 = var54;
this.y = y;
}
public Event clone() {
return instantiate(this.var54, this.y);
}}

}

