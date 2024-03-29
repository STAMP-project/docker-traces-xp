/**
 * File generated by the ThingML IDE
 * /!\Do not edit this file/!\
 * In case of a bug in the generated code,
 * please submit an issue on our GitHub
 **/

package org.thingml.generated;

import no.sintef.jasm.*;
import no.sintef.jasm.ext.*;

import org.thingml.generated.api.*;
import org.thingml.generated.messages.*;

import java.util.*;

/**
 * Definition for type : BasicIAControllerJava
 **/
public class BasicIAControllerJava extends Component implements IBasicIAControllerJava_game {

private boolean debug = false;
public boolean isDebug() {return debug;}
public void setDebug(boolean debug) {this.debug = debug;}
public String toString() {
String result = "instance " + getName() + "\n";
result += "\tbytesSentCounter = " + Controller_bytesSentCounter_var;
result += "\tctrlx = " + BasicIAController_ctrlx_var;
result += "";
return result;
}

public synchronized void updateIA__via_game(byte IAControllerMsg_updateIA__var69_var){
final Event _msg = updateIA_Type.instantiate(IAControllerMsg_updateIA__var69_var);
_msg.setPort(game_port);
receive(_msg);
}

public synchronized void updateIAvar13padyballxballypadx_via_game(byte IAControllerMsg_updateIAvar13padyballxballypadx_var66_var, int IAControllerMsg_updateIAvar13padyballxballypadx_pady_var, byte IAControllerMsg_updateIAvar13padyballxballypadx_var13_var, int IAControllerMsg_updateIAvar13padyballxballypadx_padx_var, int IAControllerMsg_updateIAvar13padyballxballypadx_ballx_var, int IAControllerMsg_updateIAvar13padyballxballypadx_bally_var){
final Event _msg = updateIAvar13padyballxballypadxType.instantiate(IAControllerMsg_updateIAvar13padyballxballypadx_var66_var, IAControllerMsg_updateIAvar13padyballxballypadx_pady_var, IAControllerMsg_updateIAvar13padyballxballypadx_var13_var, IAControllerMsg_updateIAvar13padyballxballypadx_padx_var, IAControllerMsg_updateIAvar13padyballxballypadx_ballx_var, IAControllerMsg_updateIAvar13padyballxballypadx_bally_var);
_msg.setPort(game_port);
receive(_msg);
}

public synchronized void updateIA_bis__via_game(byte IAControllerMsg_updateIA_bis__var68_var){
final Event _msg = updateIA_bis_Type.instantiate(IAControllerMsg_updateIA_bis__var68_var);
_msg.setPort(game_port);
receive(_msg);
}

public synchronized void updateIA_bisvar13padyballxballypadx_via_game(byte IAControllerMsg_updateIA_bisvar13padyballxballypadx_var67_var, int IAControllerMsg_updateIA_bisvar13padyballxballypadx_bally_var, int IAControllerMsg_updateIA_bisvar13padyballxballypadx_ballx_var, byte IAControllerMsg_updateIA_bisvar13padyballxballypadx_var13_var, int IAControllerMsg_updateIA_bisvar13padyballxballypadx_padx_var, int IAControllerMsg_updateIA_bisvar13padyballxballypadx_pady_var){
final Event _msg = updateIA_bisvar13padyballxballypadxType.instantiate(IAControllerMsg_updateIA_bisvar13padyballxballypadx_var67_var, IAControllerMsg_updateIA_bisvar13padyballxballypadx_bally_var, IAControllerMsg_updateIA_bisvar13padyballxballypadx_ballx_var, IAControllerMsg_updateIA_bisvar13padyballxballypadx_var13_var, IAControllerMsg_updateIA_bisvar13padyballxballypadx_padx_var, IAControllerMsg_updateIA_bisvar13padyballxballypadx_pady_var);
_msg.setPort(game_port);
receive(_msg);
}

private void sendPositionxvar11_via_controls(byte ControllerMsgs_positionxvar11_var62_var, int ControllerMsgs_positionxvar11_x_var, byte ControllerMsgs_positionxvar11_var11_var){
controls_port.send(positionxvar11Type.instantiate(ControllerMsgs_positionxvar11_var62_var, ControllerMsgs_positionxvar11_x_var, ControllerMsgs_positionxvar11_var11_var));
}

private void sendPositiony_via_controls(byte ControllerMsgs_positiony_var59_var, int ControllerMsgs_positiony_y_var){
controls_port.send(positionyType.instantiate(ControllerMsgs_positiony_var59_var, ControllerMsgs_positiony_y_var));
}

private void sendPosition_bis__via_controls(byte ControllerMsgs_position_bis__var58_var){
controls_port.send(position_bis_Type.instantiate(ControllerMsgs_position_bis__var58_var));
}

private void sendPosition_bisxvar11y_via_controls(byte ControllerMsgs_position_bisxvar11y_var64_var, int ControllerMsgs_position_bisxvar11y_y_var, int ControllerMsgs_position_bisxvar11y_x_var, byte ControllerMsgs_position_bisxvar11y_var11_var){
controls_port.send(position_bisxvar11yType.instantiate(ControllerMsgs_position_bisxvar11y_var64_var, ControllerMsgs_position_bisxvar11y_y_var, ControllerMsgs_position_bisxvar11y_x_var, ControllerMsgs_position_bisxvar11y_var11_var));
}

//Attributes
private int BasicIAController_SC_Following_game_updateIA_bally_var;
private int BasicIAController_SC_Following_game_updateIA_bis_ballx_var;
private int BasicIAController_ctrlx_var;
private int BasicIAController_SC_Following_game_updateIA_pady_var;
private int BasicIAController_SC_Following_game_updateIA_padx_var;
private int BasicIAController_SC_Following_game_updateIA_bis_pady_var;
private boolean BasicIAController_SC_Following_received_game_updateIAvar13padyballxballypadx_var;
private int BasicIAController_SC_Following_game_updateIA_bis_padx_var;
private int BasicIAController_SC_Following_game_updateIA_ballx_var;
private byte BasicIAController_SC_Following_game_updateIA_var13_var;
private int BasicIAController_SC_Following_game_updateIA_bis_bally_var;
private long Controller_bytesSentCounter_var;
private boolean BasicIAController_SC_Following_received_game_updateIA__var;
private boolean BasicIAController_SC_Following_received_game_updateIA_bis__var;
private byte BasicIAController_SC_Following_game_updateIA_bis_var13_var;
private boolean BasicIAController_SC_Following_received_game_updateIA_bisvar13padyballxballypadx_var;
//Ports
private Port controls_port;
private Port game_port;
//Message types
protected final Position_bis_MessageType position_bis_Type = new Position_bis_MessageType();
protected final PositionyMessageType positionyType = new PositionyMessageType();
protected final Velocityvar12dxMessageType velocityvar12dxType = new Velocityvar12dxMessageType();
protected final VelocitydyMessageType velocitydyType = new VelocitydyMessageType();
protected final Positionxvar11MessageType positionxvar11Type = new Positionxvar11MessageType();
protected final Velocity_bisdyMessageType velocity_bisdyType = new Velocity_bisdyMessageType();
protected final Position_bisxvar11yMessageType position_bisxvar11yType = new Position_bisxvar11yMessageType();
protected final Velocity_bisvar12dxMessageType velocity_bisvar12dxType = new Velocity_bisvar12dxMessageType();
protected final UpdateIAvar13padyballxballypadxMessageType updateIAvar13padyballxballypadxType = new UpdateIAvar13padyballxballypadxMessageType();
protected final UpdateIA_bisvar13padyballxballypadxMessageType updateIA_bisvar13padyballxballypadxType = new UpdateIA_bisvar13padyballxballypadxMessageType();
protected final UpdateIA_bis_MessageType updateIA_bis_Type = new UpdateIA_bis_MessageType();
protected final UpdateIA_MessageType updateIA_Type = new UpdateIA_MessageType();
//Empty Constructor
public BasicIAControllerJava() {
super();
}

//Getters and Setters for non readonly/final attributes
public int getBasicIAController_SC_Following_game_updateIA_bally_var() {
return BasicIAController_SC_Following_game_updateIA_bally_var;
}

public void setBasicIAController_SC_Following_game_updateIA_bally_var(int BasicIAController_SC_Following_game_updateIA_bally_var) {
this.BasicIAController_SC_Following_game_updateIA_bally_var = BasicIAController_SC_Following_game_updateIA_bally_var;
}

public BasicIAControllerJava initBasicIAController_SC_Following_game_updateIA_bally_var(int BasicIAController_SC_Following_game_updateIA_bally_var) {
this.BasicIAController_SC_Following_game_updateIA_bally_var = BasicIAController_SC_Following_game_updateIA_bally_var;
return this;
}

public int getBasicIAController_SC_Following_game_updateIA_bis_ballx_var() {
return BasicIAController_SC_Following_game_updateIA_bis_ballx_var;
}

public void setBasicIAController_SC_Following_game_updateIA_bis_ballx_var(int BasicIAController_SC_Following_game_updateIA_bis_ballx_var) {
this.BasicIAController_SC_Following_game_updateIA_bis_ballx_var = BasicIAController_SC_Following_game_updateIA_bis_ballx_var;
}

public BasicIAControllerJava initBasicIAController_SC_Following_game_updateIA_bis_ballx_var(int BasicIAController_SC_Following_game_updateIA_bis_ballx_var) {
this.BasicIAController_SC_Following_game_updateIA_bis_ballx_var = BasicIAController_SC_Following_game_updateIA_bis_ballx_var;
return this;
}

public int getBasicIAController_ctrlx_var() {
return BasicIAController_ctrlx_var;
}

public void setBasicIAController_ctrlx_var(int BasicIAController_ctrlx_var) {
this.BasicIAController_ctrlx_var = BasicIAController_ctrlx_var;
}

public BasicIAControllerJava initBasicIAController_ctrlx_var(int BasicIAController_ctrlx_var) {
this.BasicIAController_ctrlx_var = BasicIAController_ctrlx_var;
return this;
}

public int getBasicIAController_SC_Following_game_updateIA_pady_var() {
return BasicIAController_SC_Following_game_updateIA_pady_var;
}

public void setBasicIAController_SC_Following_game_updateIA_pady_var(int BasicIAController_SC_Following_game_updateIA_pady_var) {
this.BasicIAController_SC_Following_game_updateIA_pady_var = BasicIAController_SC_Following_game_updateIA_pady_var;
}

public BasicIAControllerJava initBasicIAController_SC_Following_game_updateIA_pady_var(int BasicIAController_SC_Following_game_updateIA_pady_var) {
this.BasicIAController_SC_Following_game_updateIA_pady_var = BasicIAController_SC_Following_game_updateIA_pady_var;
return this;
}

public int getBasicIAController_SC_Following_game_updateIA_padx_var() {
return BasicIAController_SC_Following_game_updateIA_padx_var;
}

public void setBasicIAController_SC_Following_game_updateIA_padx_var(int BasicIAController_SC_Following_game_updateIA_padx_var) {
this.BasicIAController_SC_Following_game_updateIA_padx_var = BasicIAController_SC_Following_game_updateIA_padx_var;
}

public BasicIAControllerJava initBasicIAController_SC_Following_game_updateIA_padx_var(int BasicIAController_SC_Following_game_updateIA_padx_var) {
this.BasicIAController_SC_Following_game_updateIA_padx_var = BasicIAController_SC_Following_game_updateIA_padx_var;
return this;
}

public int getBasicIAController_SC_Following_game_updateIA_bis_pady_var() {
return BasicIAController_SC_Following_game_updateIA_bis_pady_var;
}

public void setBasicIAController_SC_Following_game_updateIA_bis_pady_var(int BasicIAController_SC_Following_game_updateIA_bis_pady_var) {
this.BasicIAController_SC_Following_game_updateIA_bis_pady_var = BasicIAController_SC_Following_game_updateIA_bis_pady_var;
}

public BasicIAControllerJava initBasicIAController_SC_Following_game_updateIA_bis_pady_var(int BasicIAController_SC_Following_game_updateIA_bis_pady_var) {
this.BasicIAController_SC_Following_game_updateIA_bis_pady_var = BasicIAController_SC_Following_game_updateIA_bis_pady_var;
return this;
}

public boolean getBasicIAController_SC_Following_received_game_updateIAvar13padyballxballypadx_var() {
return BasicIAController_SC_Following_received_game_updateIAvar13padyballxballypadx_var;
}

public void setBasicIAController_SC_Following_received_game_updateIAvar13padyballxballypadx_var(boolean BasicIAController_SC_Following_received_game_updateIAvar13padyballxballypadx_var) {
this.BasicIAController_SC_Following_received_game_updateIAvar13padyballxballypadx_var = BasicIAController_SC_Following_received_game_updateIAvar13padyballxballypadx_var;
}

public BasicIAControllerJava initBasicIAController_SC_Following_received_game_updateIAvar13padyballxballypadx_var(boolean BasicIAController_SC_Following_received_game_updateIAvar13padyballxballypadx_var) {
this.BasicIAController_SC_Following_received_game_updateIAvar13padyballxballypadx_var = BasicIAController_SC_Following_received_game_updateIAvar13padyballxballypadx_var;
return this;
}

public int getBasicIAController_SC_Following_game_updateIA_bis_padx_var() {
return BasicIAController_SC_Following_game_updateIA_bis_padx_var;
}

public void setBasicIAController_SC_Following_game_updateIA_bis_padx_var(int BasicIAController_SC_Following_game_updateIA_bis_padx_var) {
this.BasicIAController_SC_Following_game_updateIA_bis_padx_var = BasicIAController_SC_Following_game_updateIA_bis_padx_var;
}

public BasicIAControllerJava initBasicIAController_SC_Following_game_updateIA_bis_padx_var(int BasicIAController_SC_Following_game_updateIA_bis_padx_var) {
this.BasicIAController_SC_Following_game_updateIA_bis_padx_var = BasicIAController_SC_Following_game_updateIA_bis_padx_var;
return this;
}

public int getBasicIAController_SC_Following_game_updateIA_ballx_var() {
return BasicIAController_SC_Following_game_updateIA_ballx_var;
}

public void setBasicIAController_SC_Following_game_updateIA_ballx_var(int BasicIAController_SC_Following_game_updateIA_ballx_var) {
this.BasicIAController_SC_Following_game_updateIA_ballx_var = BasicIAController_SC_Following_game_updateIA_ballx_var;
}

public BasicIAControllerJava initBasicIAController_SC_Following_game_updateIA_ballx_var(int BasicIAController_SC_Following_game_updateIA_ballx_var) {
this.BasicIAController_SC_Following_game_updateIA_ballx_var = BasicIAController_SC_Following_game_updateIA_ballx_var;
return this;
}

public byte getBasicIAController_SC_Following_game_updateIA_var13_var() {
return BasicIAController_SC_Following_game_updateIA_var13_var;
}

public void setBasicIAController_SC_Following_game_updateIA_var13_var(byte BasicIAController_SC_Following_game_updateIA_var13_var) {
this.BasicIAController_SC_Following_game_updateIA_var13_var = BasicIAController_SC_Following_game_updateIA_var13_var;
}

public BasicIAControllerJava initBasicIAController_SC_Following_game_updateIA_var13_var(byte BasicIAController_SC_Following_game_updateIA_var13_var) {
this.BasicIAController_SC_Following_game_updateIA_var13_var = BasicIAController_SC_Following_game_updateIA_var13_var;
return this;
}

public int getBasicIAController_SC_Following_game_updateIA_bis_bally_var() {
return BasicIAController_SC_Following_game_updateIA_bis_bally_var;
}

public void setBasicIAController_SC_Following_game_updateIA_bis_bally_var(int BasicIAController_SC_Following_game_updateIA_bis_bally_var) {
this.BasicIAController_SC_Following_game_updateIA_bis_bally_var = BasicIAController_SC_Following_game_updateIA_bis_bally_var;
}

public BasicIAControllerJava initBasicIAController_SC_Following_game_updateIA_bis_bally_var(int BasicIAController_SC_Following_game_updateIA_bis_bally_var) {
this.BasicIAController_SC_Following_game_updateIA_bis_bally_var = BasicIAController_SC_Following_game_updateIA_bis_bally_var;
return this;
}

public long getController_bytesSentCounter_var() {
return Controller_bytesSentCounter_var;
}

public void setController_bytesSentCounter_var(long Controller_bytesSentCounter_var) {
this.Controller_bytesSentCounter_var = Controller_bytesSentCounter_var;
}

public BasicIAControllerJava initController_bytesSentCounter_var(long Controller_bytesSentCounter_var) {
this.Controller_bytesSentCounter_var = Controller_bytesSentCounter_var;
return this;
}

public boolean getBasicIAController_SC_Following_received_game_updateIA__var() {
return BasicIAController_SC_Following_received_game_updateIA__var;
}

public void setBasicIAController_SC_Following_received_game_updateIA__var(boolean BasicIAController_SC_Following_received_game_updateIA__var) {
this.BasicIAController_SC_Following_received_game_updateIA__var = BasicIAController_SC_Following_received_game_updateIA__var;
}

public BasicIAControllerJava initBasicIAController_SC_Following_received_game_updateIA__var(boolean BasicIAController_SC_Following_received_game_updateIA__var) {
this.BasicIAController_SC_Following_received_game_updateIA__var = BasicIAController_SC_Following_received_game_updateIA__var;
return this;
}

public boolean getBasicIAController_SC_Following_received_game_updateIA_bis__var() {
return BasicIAController_SC_Following_received_game_updateIA_bis__var;
}

public void setBasicIAController_SC_Following_received_game_updateIA_bis__var(boolean BasicIAController_SC_Following_received_game_updateIA_bis__var) {
this.BasicIAController_SC_Following_received_game_updateIA_bis__var = BasicIAController_SC_Following_received_game_updateIA_bis__var;
}

public BasicIAControllerJava initBasicIAController_SC_Following_received_game_updateIA_bis__var(boolean BasicIAController_SC_Following_received_game_updateIA_bis__var) {
this.BasicIAController_SC_Following_received_game_updateIA_bis__var = BasicIAController_SC_Following_received_game_updateIA_bis__var;
return this;
}

public byte getBasicIAController_SC_Following_game_updateIA_bis_var13_var() {
return BasicIAController_SC_Following_game_updateIA_bis_var13_var;
}

public void setBasicIAController_SC_Following_game_updateIA_bis_var13_var(byte BasicIAController_SC_Following_game_updateIA_bis_var13_var) {
this.BasicIAController_SC_Following_game_updateIA_bis_var13_var = BasicIAController_SC_Following_game_updateIA_bis_var13_var;
}

public BasicIAControllerJava initBasicIAController_SC_Following_game_updateIA_bis_var13_var(byte BasicIAController_SC_Following_game_updateIA_bis_var13_var) {
this.BasicIAController_SC_Following_game_updateIA_bis_var13_var = BasicIAController_SC_Following_game_updateIA_bis_var13_var;
return this;
}

public boolean getBasicIAController_SC_Following_received_game_updateIA_bisvar13padyballxballypadx_var() {
return BasicIAController_SC_Following_received_game_updateIA_bisvar13padyballxballypadx_var;
}

public void setBasicIAController_SC_Following_received_game_updateIA_bisvar13padyballxballypadx_var(boolean BasicIAController_SC_Following_received_game_updateIA_bisvar13padyballxballypadx_var) {
this.BasicIAController_SC_Following_received_game_updateIA_bisvar13padyballxballypadx_var = BasicIAController_SC_Following_received_game_updateIA_bisvar13padyballxballypadx_var;
}

public BasicIAControllerJava initBasicIAController_SC_Following_received_game_updateIA_bisvar13padyballxballypadx_var(boolean BasicIAController_SC_Following_received_game_updateIA_bisvar13padyballxballypadx_var) {
this.BasicIAController_SC_Following_received_game_updateIA_bisvar13padyballxballypadx_var = BasicIAController_SC_Following_received_game_updateIA_bisvar13padyballxballypadx_var;
return this;
}

//Getters for Ports
public Port getControls_port() {
return controls_port;
}
public Port getGame_port() {
return game_port;
}
private CompositeState buildBasicIAController_SC(){
final AtomicState state_BasicIAController_SC_Following = new AtomicState("Following");
state_BasicIAController_SC_Following.onEntry(()->{
if(rnd() < 113) {
if(rnd() < 144) {
sendPositionxvar11_via_controls((byte) (rnd()), (int) (getBasicIAController_ctrlx_var()), (byte) (rnd()));
sendPositiony_via_controls((byte) (rnd()), (int) (0));

} else {
sendPositiony_via_controls((byte) (rnd()), (int) (0));
sendPositionxvar11_via_controls((byte) (rnd()), (int) (getBasicIAController_ctrlx_var()), (byte) (rnd()));

}

} else {
if(rnd() < 96) {
sendPosition_bis__via_controls((byte) (rnd()));
sendPosition_bisxvar11y_via_controls((byte) (rnd()), (int) (0), (int) (getBasicIAController_ctrlx_var()), (byte) (rnd()));

} else {
sendPosition_bisxvar11y_via_controls((byte) (rnd()), (int) (0), (int) (getBasicIAController_ctrlx_var()), (byte) (rnd()));
sendPosition_bis__via_controls((byte) (rnd()));

}

}
});
Handler h890236948 = new Handler();
h890236948.from(state_BasicIAController_SC_Following);
h890236948.event(updateIA_Type);
h890236948.guard((Event e)->{
final UpdateIA_MessageType.UpdateIA_Message updateIA_ = (UpdateIA_MessageType.UpdateIA_Message) e;
return  !(getBasicIAController_SC_Following_received_game_updateIAvar13padyballxballypadx_var());
});

h890236948.port(game_port);
h890236948.action((Event e)->{
final UpdateIA_MessageType.UpdateIA_Message updateIA_ = (UpdateIA_MessageType.UpdateIA_Message) e;
BasicIAController_SC_Following_received_game_updateIA__var = (boolean) (true);
});

Handler h570723286 = new Handler();
h570723286.from(state_BasicIAController_SC_Following);
h570723286.event(updateIAvar13padyballxballypadxType);
h570723286.guard((Event e)->{
final UpdateIAvar13padyballxballypadxMessageType.UpdateIAvar13padyballxballypadxMessage updateIAvar13padyballxballypadx = (UpdateIAvar13padyballxballypadxMessageType.UpdateIAvar13padyballxballypadxMessage) e;
return  !(getBasicIAController_SC_Following_received_game_updateIA__var());
});

h570723286.port(game_port);
h570723286.action((Event e)->{
final UpdateIAvar13padyballxballypadxMessageType.UpdateIAvar13padyballxballypadxMessage updateIAvar13padyballxballypadx = (UpdateIAvar13padyballxballypadxMessageType.UpdateIAvar13padyballxballypadxMessage) e;
BasicIAController_SC_Following_received_game_updateIAvar13padyballxballypadx_var = (boolean) (true);
BasicIAController_SC_Following_game_updateIA_var13_var = (byte) (updateIAvar13padyballxballypadx.var13);
BasicIAController_SC_Following_game_updateIA_pady_var = (int) (updateIAvar13padyballxballypadx.pady);
BasicIAController_SC_Following_game_updateIA_ballx_var = (int) (updateIAvar13padyballxballypadx.ballx);
BasicIAController_SC_Following_game_updateIA_bally_var = (int) (updateIAvar13padyballxballypadx.bally);
BasicIAController_SC_Following_game_updateIA_padx_var = (int) (updateIAvar13padyballxballypadx.padx);
});

Handler h1120226221 = new Handler();
h1120226221.from(state_BasicIAController_SC_Following);
h1120226221.event(updateIA_bis_Type);
h1120226221.guard((Event e)->{
final UpdateIA_bis_MessageType.UpdateIA_bis_Message updateIA_bis_ = (UpdateIA_bis_MessageType.UpdateIA_bis_Message) e;
return  !(getBasicIAController_SC_Following_received_game_updateIA_bisvar13padyballxballypadx_var());
});

h1120226221.port(game_port);
h1120226221.action((Event e)->{
final UpdateIA_bis_MessageType.UpdateIA_bis_Message updateIA_bis_ = (UpdateIA_bis_MessageType.UpdateIA_bis_Message) e;
BasicIAController_SC_Following_received_game_updateIA_bis__var = (boolean) (true);
});

Handler h928023753 = new Handler();
h928023753.from(state_BasicIAController_SC_Following);
h928023753.event(updateIA_bisvar13padyballxballypadxType);
h928023753.guard((Event e)->{
final UpdateIA_bisvar13padyballxballypadxMessageType.UpdateIA_bisvar13padyballxballypadxMessage updateIA_bisvar13padyballxballypadx = (UpdateIA_bisvar13padyballxballypadxMessageType.UpdateIA_bisvar13padyballxballypadxMessage) e;
return  !(getBasicIAController_SC_Following_received_game_updateIA_bis__var());
});

h928023753.port(game_port);
h928023753.action((Event e)->{
final UpdateIA_bisvar13padyballxballypadxMessageType.UpdateIA_bisvar13padyballxballypadxMessage updateIA_bisvar13padyballxballypadx = (UpdateIA_bisvar13padyballxballypadxMessageType.UpdateIA_bisvar13padyballxballypadxMessage) e;
BasicIAController_SC_Following_received_game_updateIA_bisvar13padyballxballypadx_var = (boolean) (true);
BasicIAController_SC_Following_game_updateIA_bis_var13_var = (byte) (updateIA_bisvar13padyballxballypadx.var13);
BasicIAController_SC_Following_game_updateIA_bis_pady_var = (int) (updateIA_bisvar13padyballxballypadx.pady);
BasicIAController_SC_Following_game_updateIA_bis_ballx_var = (int) (updateIA_bisvar13padyballxballypadx.ballx);
BasicIAController_SC_Following_game_updateIA_bis_bally_var = (int) (updateIA_bisvar13padyballxballypadx.bally);
BasicIAController_SC_Following_game_updateIA_bis_padx_var = (int) (updateIA_bisvar13padyballxballypadx.padx);
});

Transition h651226342 = new Transition();
h651226342.from(state_BasicIAController_SC_Following).to(state_BasicIAController_SC_Following);
h651226342.event(updateIA_Type);
h651226342.guard((Event e)->{
final UpdateIA_MessageType.UpdateIA_Message updateIA_ = (UpdateIA_MessageType.UpdateIA_Message) e;
return getBasicIAController_SC_Following_received_game_updateIAvar13padyballxballypadx_var();
});

h651226342.port(game_port);
h651226342.action((Event e)->{
final UpdateIA_MessageType.UpdateIA_Message updateIA_ = (UpdateIA_MessageType.UpdateIA_Message) e;
if(getBasicIAController_SC_Following_game_updateIA_ballx_var() > getBasicIAController_SC_Following_game_updateIA_padx_var() + 400) {
BasicIAController_ctrlx_var = (int) (getBasicIAController_ctrlx_var() + 4);

} else {
if(getBasicIAController_SC_Following_game_updateIA_ballx_var() < getBasicIAController_SC_Following_game_updateIA_padx_var() - 400) {
BasicIAController_ctrlx_var = (int) (getBasicIAController_ctrlx_var() - 4);

}

}
if(getBasicIAController_ctrlx_var() <  -100) {
BasicIAController_ctrlx_var = (int) ( -100);

} else {
if(getBasicIAController_ctrlx_var() > 100) {
BasicIAController_ctrlx_var = (int) (100);

}

}
BasicIAController_SC_Following_received_game_updateIA__var = (boolean) (false);
BasicIAController_SC_Following_received_game_updateIAvar13padyballxballypadx_var = (boolean) (false);
});

Transition h2000603780 = new Transition();
h2000603780.from(state_BasicIAController_SC_Following).to(state_BasicIAController_SC_Following);
h2000603780.event(updateIAvar13padyballxballypadxType);
h2000603780.guard((Event e)->{
final UpdateIAvar13padyballxballypadxMessageType.UpdateIAvar13padyballxballypadxMessage updateIAvar13padyballxballypadx = (UpdateIAvar13padyballxballypadxMessageType.UpdateIAvar13padyballxballypadxMessage) e;
return getBasicIAController_SC_Following_received_game_updateIA__var();
});

h2000603780.port(game_port);
h2000603780.action((Event e)->{
final UpdateIAvar13padyballxballypadxMessageType.UpdateIAvar13padyballxballypadxMessage updateIAvar13padyballxballypadx = (UpdateIAvar13padyballxballypadxMessageType.UpdateIAvar13padyballxballypadxMessage) e;
BasicIAController_SC_Following_game_updateIA_var13_var = (byte) (updateIAvar13padyballxballypadx.var13);
BasicIAController_SC_Following_game_updateIA_pady_var = (int) (updateIAvar13padyballxballypadx.pady);
BasicIAController_SC_Following_game_updateIA_ballx_var = (int) (updateIAvar13padyballxballypadx.ballx);
BasicIAController_SC_Following_game_updateIA_bally_var = (int) (updateIAvar13padyballxballypadx.bally);
BasicIAController_SC_Following_game_updateIA_padx_var = (int) (updateIAvar13padyballxballypadx.padx);
if(updateIAvar13padyballxballypadx.ballx > updateIAvar13padyballxballypadx.padx + 400) {
BasicIAController_ctrlx_var = (int) (getBasicIAController_ctrlx_var() + 4);

} else {
if(updateIAvar13padyballxballypadx.ballx < updateIAvar13padyballxballypadx.padx - 400) {
BasicIAController_ctrlx_var = (int) (getBasicIAController_ctrlx_var() - 4);

}

}
if(getBasicIAController_ctrlx_var() <  -100) {
BasicIAController_ctrlx_var = (int) ( -100);

} else {
if(getBasicIAController_ctrlx_var() > 100) {
BasicIAController_ctrlx_var = (int) (100);

}

}
BasicIAController_SC_Following_received_game_updateIAvar13padyballxballypadx_var = (boolean) (false);
BasicIAController_SC_Following_received_game_updateIA__var = (boolean) (false);
});

Transition h2135059933 = new Transition();
h2135059933.from(state_BasicIAController_SC_Following).to(state_BasicIAController_SC_Following);
h2135059933.event(updateIA_bis_Type);
h2135059933.guard((Event e)->{
final UpdateIA_bis_MessageType.UpdateIA_bis_Message updateIA_bis_ = (UpdateIA_bis_MessageType.UpdateIA_bis_Message) e;
return getBasicIAController_SC_Following_received_game_updateIA_bisvar13padyballxballypadx_var();
});

h2135059933.port(game_port);
h2135059933.action((Event e)->{
final UpdateIA_bis_MessageType.UpdateIA_bis_Message updateIA_bis_ = (UpdateIA_bis_MessageType.UpdateIA_bis_Message) e;
if(getBasicIAController_SC_Following_game_updateIA_bis_ballx_var() > getBasicIAController_SC_Following_game_updateIA_bis_padx_var() + 400) {
BasicIAController_ctrlx_var = (int) (getBasicIAController_ctrlx_var() + 4);

} else {
if(getBasicIAController_SC_Following_game_updateIA_bis_ballx_var() < getBasicIAController_SC_Following_game_updateIA_bis_padx_var() - 400) {
BasicIAController_ctrlx_var = (int) (getBasicIAController_ctrlx_var() - 4);

}

}
if(getBasicIAController_ctrlx_var() <  -100) {
BasicIAController_ctrlx_var = (int) ( -100);

} else {
if(getBasicIAController_ctrlx_var() > 100) {
BasicIAController_ctrlx_var = (int) (100);

}

}
BasicIAController_SC_Following_received_game_updateIA_bis__var = (boolean) (false);
BasicIAController_SC_Following_received_game_updateIA_bisvar13padyballxballypadx_var = (boolean) (false);
});

Transition h268620178 = new Transition();
h268620178.from(state_BasicIAController_SC_Following).to(state_BasicIAController_SC_Following);
h268620178.event(updateIA_bisvar13padyballxballypadxType);
h268620178.guard((Event e)->{
final UpdateIA_bisvar13padyballxballypadxMessageType.UpdateIA_bisvar13padyballxballypadxMessage updateIA_bisvar13padyballxballypadx = (UpdateIA_bisvar13padyballxballypadxMessageType.UpdateIA_bisvar13padyballxballypadxMessage) e;
return getBasicIAController_SC_Following_received_game_updateIA_bis__var();
});

h268620178.port(game_port);
h268620178.action((Event e)->{
final UpdateIA_bisvar13padyballxballypadxMessageType.UpdateIA_bisvar13padyballxballypadxMessage updateIA_bisvar13padyballxballypadx = (UpdateIA_bisvar13padyballxballypadxMessageType.UpdateIA_bisvar13padyballxballypadxMessage) e;
BasicIAController_SC_Following_game_updateIA_bis_var13_var = (byte) (updateIA_bisvar13padyballxballypadx.var13);
BasicIAController_SC_Following_game_updateIA_bis_pady_var = (int) (updateIA_bisvar13padyballxballypadx.pady);
BasicIAController_SC_Following_game_updateIA_bis_ballx_var = (int) (updateIA_bisvar13padyballxballypadx.ballx);
BasicIAController_SC_Following_game_updateIA_bis_bally_var = (int) (updateIA_bisvar13padyballxballypadx.bally);
BasicIAController_SC_Following_game_updateIA_bis_padx_var = (int) (updateIA_bisvar13padyballxballypadx.padx);
if(updateIA_bisvar13padyballxballypadx.ballx > updateIA_bisvar13padyballxballypadx.padx + 400) {
BasicIAController_ctrlx_var = (int) (getBasicIAController_ctrlx_var() + 4);

} else {
if(updateIA_bisvar13padyballxballypadx.ballx < updateIA_bisvar13padyballxballypadx.padx - 400) {
BasicIAController_ctrlx_var = (int) (getBasicIAController_ctrlx_var() - 4);

}

}
if(getBasicIAController_ctrlx_var() <  -100) {
BasicIAController_ctrlx_var = (int) ( -100);

} else {
if(getBasicIAController_ctrlx_var() > 100) {
BasicIAController_ctrlx_var = (int) (100);

}

}
BasicIAController_SC_Following_received_game_updateIA_bisvar13padyballxballypadx_var = (boolean) (false);
BasicIAController_SC_Following_received_game_updateIA_bis__var = (boolean) (false);
});

final CompositeState state_BasicIAController_SC = new CompositeState("SC");
state_BasicIAController_SC.onEntry(()->{
});
state_BasicIAController_SC.add(state_BasicIAController_SC_Following);
state_BasicIAController_SC.initial(state_BasicIAController_SC_Following);
return state_BasicIAController_SC;
}

public Component buildBehavior(String session, Component root) {
if (root == null) {
//Init ports
controls_port = new Port("controls", this);
game_port = new Port("game", this);
} else {
controls_port = ((BasicIAControllerJava)root).controls_port;
game_port = ((BasicIAControllerJava)root).game_port;
}
if (session == null){
//Init state machine
behavior = buildBasicIAController_SC();
}
return this;
}

 byte rnd() {
return (byte) (Math.floor(Math.random() * Math.floor(246)) + 5);
}
}
