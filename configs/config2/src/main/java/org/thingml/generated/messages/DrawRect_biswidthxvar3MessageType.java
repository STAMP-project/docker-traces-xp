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

public class DrawRect_biswidthxvar3MessageType extends EventType {
public DrawRect_biswidthxvar3MessageType(short code) {super("drawRect_biswidthxvar3", code);
}

public DrawRect_biswidthxvar3MessageType() {
super("drawRect_biswidthxvar3", (short) 23);
}

public Event instantiate(final byte var35, final byte var3, final int x, final int width) { return new DrawRect_biswidthxvar3Message(this, var35, var3, x, width); }
public Event instantiate(Map<String, Object> params) {return instantiate((Byte) params.get("var35"), (Byte) params.get("var3"), (Integer) params.get("x"), (Integer) params.get("width"));
}

public class DrawRect_biswidthxvar3Message extends Event implements java.io.Serializable {

public final byte var35;
public final byte var3;
public final int x;
public final int width;
public String toString(){
return "drawRect_biswidthxvar3 (" + "var35: " + var35 + ", " + "var3: " + var3 + ", " + "x: " + x + ", " + "width: " + width + ")";
}

protected DrawRect_biswidthxvar3Message(EventType type, final byte var35, final byte var3, final int x, final int width) {
super(type);
this.var35 = var35;
this.var3 = var3;
this.x = x;
this.width = width;
}
public Event clone() {
return instantiate(this.var35, this.var3, this.x, this.width);
}}

}

