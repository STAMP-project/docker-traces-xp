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

public class FillRectyval2MessageType extends EventType {
public FillRectyval2MessageType(short code) {super("fillRectyval2", code);
}

public FillRectyval2MessageType() {
super("fillRectyval2", (short) 7);
}

public Event instantiate(final int y, final byte val19, final byte val2) { return new FillRectyval2Message(this, y, val19, val2); }
public Event instantiate(Map<String, Object> params) {return instantiate((Integer) params.get("y"), (Byte) params.get("val19"), (Byte) params.get("val2"));
}

public class FillRectyval2Message extends Event implements java.io.Serializable {

public final int y;
public final byte val19;
public final byte val2;
public String toString(){
return "fillRectyval2 (" + "y: " + y + ", " + "val19: " + val19 + ", " + "val2: " + val2 + ")";
}

protected FillRectyval2Message(EventType type, final int y, final byte val19, final byte val2) {
super(type);
this.y = y;
this.val19 = val19;
this.val2 = val2;
}
public Event clone() {
return instantiate(this.y, this.val19, this.val2);
}}

}
