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

public class Clearval1MessageType extends EventType {
public Clearval1MessageType(short code) {super("clearval1", code);
}

public Clearval1MessageType() {
super("clearval1", (short) 15);
}

public Event instantiate(final byte val27, final byte val1) { return new Clearval1Message(this, val27, val1); }
public Event instantiate(Map<String, Object> params) {return instantiate((Byte) params.get("val27"), (Byte) params.get("val1"));
}

public class Clearval1Message extends Event implements java.io.Serializable {

public final byte val27;
public final byte val1;
public String toString(){
return "clearval1 (" + "val27: " + val27 + ", " + "val1: " + val1 + ")";
}

protected Clearval1Message(EventType type, final byte val27, final byte val1) {
super(type);
this.val27 = val27;
this.val1 = val1;
}
public Event clone() {
return instantiate(this.val27, this.val1);
}}

}

