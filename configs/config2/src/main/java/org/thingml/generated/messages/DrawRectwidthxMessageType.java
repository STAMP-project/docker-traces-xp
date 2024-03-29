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

public class DrawRectwidthxMessageType extends EventType {
public DrawRectwidthxMessageType(short code) {super("drawRectwidthx", code);
}

public DrawRectwidthxMessageType() {
super("drawRectwidthx", (short) 36);
}

public Event instantiate(final byte var48, final int x, final int width) { return new DrawRectwidthxMessage(this, var48, x, width); }
public Event instantiate(Map<String, Object> params) {return instantiate((Byte) params.get("var48"), (Integer) params.get("x"), (Integer) params.get("width"));
}

public class DrawRectwidthxMessage extends Event implements java.io.Serializable {

public final byte var48;
public final int x;
public final int width;
public String toString(){
return "drawRectwidthx (" + "var48: " + var48 + ", " + "x: " + x + ", " + "width: " + width + ")";
}

protected DrawRectwidthxMessage(EventType type, final byte var48, final int x, final int width) {
super(type);
this.var48 = var48;
this.x = x;
this.width = width;
}
public Event clone() {
return instantiate(this.var48, this.x, this.width);
}}

}

