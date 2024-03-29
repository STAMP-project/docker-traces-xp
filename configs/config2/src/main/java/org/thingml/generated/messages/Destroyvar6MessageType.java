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

public class Destroyvar6MessageType extends EventType {
public Destroyvar6MessageType(short code) {super("destroyvar6", code);
}

public Destroyvar6MessageType() {
super("destroyvar6", (short) 24);
}

public Event instantiate(final byte var36, final byte var6) { return new Destroyvar6Message(this, var36, var6); }
public Event instantiate(Map<String, Object> params) {return instantiate((Byte) params.get("var36"), (Byte) params.get("var6"));
}

public class Destroyvar6Message extends Event implements java.io.Serializable {

public final byte var36;
public final byte var6;
public String toString(){
return "destroyvar6 (" + "var36: " + var36 + ", " + "var6: " + var6 + ")";
}

protected Destroyvar6Message(EventType type, final byte var36, final byte var6) {
super(type);
this.var36 = var36;
this.var6 = var6;
}
public Event clone() {
return instantiate(this.var36, this.var6);
}}

}

