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

public class Destroy_MessageType extends EventType {
public Destroy_MessageType(short code) {super("destroy_", code);
}

public Destroy_MessageType() {
super("destroy_", (short) 9);
}

public Event instantiate(final byte var21) { return new Destroy_Message(this, var21); }
public Event instantiate(Map<String, Object> params) {return instantiate((Byte) params.get("var21"));
}

public class Destroy_Message extends Event implements java.io.Serializable {

public final byte var21;
public String toString(){
return "destroy_ (" + "var21: " + var21 + ")";
}

protected Destroy_Message(EventType type, final byte var21) {
super(type);
this.var21 = var21;
}
public Event clone() {
return instantiate(this.var21);
}}

}

