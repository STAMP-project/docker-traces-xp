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

public class SetColorrbvar7MessageType extends EventType {
public SetColorrbvar7MessageType(short code) {super("setColorrbvar7", code);
}

public SetColorrbvar7MessageType() {
super("setColorrbvar7", (short) 28);
}

public Event instantiate(final byte var7, final byte var40, final int r, final int b) { return new SetColorrbvar7Message(this, var7, var40, r, b); }
public Event instantiate(Map<String, Object> params) {return instantiate((Byte) params.get("var7"), (Byte) params.get("var40"), (Integer) params.get("r"), (Integer) params.get("b"));
}

public class SetColorrbvar7Message extends Event implements java.io.Serializable {

public final byte var7;
public final byte var40;
public final int r;
public final int b;
public String toString(){
return "setColorrbvar7 (" + "var7: " + var7 + ", " + "var40: " + var40 + ", " + "r: " + r + ", " + "b: " + b + ")";
}

protected SetColorrbvar7Message(EventType type, final byte var7, final byte var40, final int r, final int b) {
super(type);
this.var7 = var7;
this.var40 = var40;
this.r = r;
this.b = b;
}
public Event clone() {
return instantiate(this.var7, this.var40, this.r, this.b);
}}

}
