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

public class DrawInteger_bisscalevMessageType extends EventType {
public DrawInteger_bisscalevMessageType(short code) {super("drawInteger_bisscalev", code);
}

public DrawInteger_bisscalevMessageType() {
super("drawInteger_bisscalev", (short) 37);
}

public Event instantiate(final byte var49, final int scale, final int v) { return new DrawInteger_bisscalevMessage(this, var49, scale, v); }
public Event instantiate(Map<String, Object> params) {return instantiate((Byte) params.get("var49"), (Integer) params.get("scale"), (Integer) params.get("v"));
}

public class DrawInteger_bisscalevMessage extends Event implements java.io.Serializable {

public final byte var49;
public final int scale;
public final int v;
public String toString(){
return "drawInteger_bisscalev (" + "var49: " + var49 + ", " + "scale: " + scale + ", " + "v: " + v + ")";
}

protected DrawInteger_bisscalevMessage(EventType type, final byte var49, final int scale, final int v) {
super(type);
this.var49 = var49;
this.scale = scale;
this.v = v;
}
public Event clone() {
return instantiate(this.var49, this.scale, this.v);
}}

}
