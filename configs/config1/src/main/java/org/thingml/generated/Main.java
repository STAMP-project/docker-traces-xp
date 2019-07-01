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
public class Main {
//Things
public static BreakoutGameJava BreakoutGameJava_game;
public static TimerJava TimerJava_timer;
public static BasicIAControllerJava BasicIAControllerJava_ctrl;
public static HeadlessDisplayJava HeadlessDisplayJava_disp;
public static void main(String args[]) {
//Things
BreakoutGameJava_game = (BreakoutGameJava) new BreakoutGameJava();
BreakoutGameJava_game.buildBehavior(null, null);
BreakoutGameJava_game.init();
TimerJava_timer = (TimerJava) new TimerJava();
TimerJava_timer.buildBehavior(null, null);
TimerJava_timer.init();
BasicIAControllerJava_ctrl = (BasicIAControllerJava) new BasicIAControllerJava();
BasicIAControllerJava_ctrl.buildBehavior(null, null);
BasicIAControllerJava_ctrl.init();
HeadlessDisplayJava_disp = (HeadlessDisplayJava) new HeadlessDisplayJava();
HeadlessDisplayJava_disp.buildBehavior(null, null);
HeadlessDisplayJava_disp.init();
//Connecting internal ports...
BreakoutGameJava_game.getGame_port().addListener(BreakoutGameJava_game.getGame_port());
//Connectors
TimerJava_timer.getTimer_port().addListener(BreakoutGameJava_game.getClock_port());
BreakoutGameJava_game.getClock_port().addListener(TimerJava_timer.getTimer_port());
HeadlessDisplayJava_disp.getDisplay_port().addListener(BreakoutGameJava_game.getDisplay_port());
BreakoutGameJava_game.getDisplay_port().addListener(HeadlessDisplayJava_disp.getDisplay_port());
BreakoutGameJava_game.getIa_port().addListener(BasicIAControllerJava_ctrl.getGame_port());
BasicIAControllerJava_ctrl.getControls_port().addListener(BreakoutGameJava_game.getController_port());
final int[] game_bgcolor_array = new int[3];
final int[] game_fgcolor_array = new int[3];
final int[] game_bricks_array = new int[5];
BreakoutGameJava_game.initBreakoutGame_bytesSentCounter_var((long) (0));
BreakoutGameJava_game.initBreakoutGame_startTime_var((long)0);
BreakoutGameJava_game.initBreakoutGame_stopTime_var((long)0);
BreakoutGameJava_game.initBreakoutGame_lastTimestamp_var((long) (0));
BreakoutGameJava_game.initBreakoutGame_counter_var((int) (0));
BreakoutGameJava_game.initBreakoutGame_trackMemory_var((boolean) (false));
BreakoutGameJava_game.initBreakoutGame_XDISPSIZE_var((int) (160));
BreakoutGameJava_game.initBreakoutGame_YDISPSIZE_var((int) (128));
BreakoutGameJava_game.initBreakoutGame_SCALE_var((int) (64));
BreakoutGameJava_game.initBreakoutGame_XMAX_var((int) (160 * 64));
BreakoutGameJava_game.initBreakoutGame_YMAX_var((int) (128 * 64));
BreakoutGameJava_game.initBreakoutGame_TOP_var((int) (14 * 64));
BreakoutGameJava_game.initBreakoutGame_BOTTOM_var((int) (128 * 64 + 8 * 64));
BreakoutGameJava_game.initBreakoutGame_LEFT_var((int) (1 * 64));
BreakoutGameJava_game.initBreakoutGame_RIGHT_var((int) (160 * 64 - 1 * 64));
BreakoutGameJava_game.initBreakoutGame_br_var((int) (3 * 64));
BreakoutGameJava_game.initBreakoutGame_bx_var((int) (160 * 64 / 2));
BreakoutGameJava_game.initBreakoutGame_by_var((int) (128 * 64));
BreakoutGameJava_game.initBreakoutGame_dx_var((int) (160 * 64 / 98));
BreakoutGameJava_game.initBreakoutGame_dy_var((int) ( -160 * 64 / 65));
BreakoutGameJava_game.initBreakoutGame_padx_var((int) (128 * 64 / 2));
BreakoutGameJava_game.initBreakoutGame_pady_var((int) (128 * 64 - 6 * 64));
BreakoutGameJava_game.initBreakoutGame_padlen_var((int) (25 * 64));
BreakoutGameJava_game.initBreakoutGame_prevBX_var((int) ( -1));
BreakoutGameJava_game.initBreakoutGame_prevBY_var((int) ( -1));
BreakoutGameJava_game.initBreakoutGame_period_var((int) (33));
BreakoutGameJava_game.initBreakoutGame_prevPX_var((int) ( -1));
BreakoutGameJava_game.initBreakoutGame_prevPY_var((int) ( -1));
BreakoutGameJava_game.initBreakoutGame_BRICK_ROWS_var((int) (5));
BreakoutGameJava_game.initBreakoutGame_BRICK_HEIGHT_var((int) (9));
BreakoutGameJava_game.initBreakoutGame_score_var((int) (0));
BreakoutGameJava_game.initBreakoutGame_lives_var((int) (3));
BreakoutGameJava_game.initBreakoutGame_level_var((int) (1));
BreakoutGameJava_game.initBreakoutGame_SC_INIT_display_displayReady_val8_var((byte)0);
BreakoutGameJava_game.initBreakoutGame_SC_INIT_received_display_displayReady__var((boolean)false);
BreakoutGameJava_game.initBreakoutGame_SC_INIT_received_display_displayReadyval8_var((boolean)false);
BreakoutGameJava_game.initBreakoutGame_SC_controller_position_x_var((int)0);
BreakoutGameJava_game.initBreakoutGame_SC_controller_position_val11_var((byte)0);
BreakoutGameJava_game.initBreakoutGame_SC_controller_position_y_var((int)0);
BreakoutGameJava_game.initBreakoutGame_SC_received_controller_positionx_var((boolean)false);
BreakoutGameJava_game.initBreakoutGame_SC_received_controller_positionval11y_var((boolean)false);
BreakoutGameJava_game.initBreakoutGame_SC_LAUNCH_countdown_var((int)0);
BreakoutGameJava_game.initBreakoutGame_bgcolor_var(game_bgcolor_array);
BreakoutGameJava_game.initBreakoutGame_fgcolor_var(game_fgcolor_array);
BreakoutGameJava_game.initBreakoutGame_bricks_var(game_bricks_array);
BasicIAControllerJava_ctrl.initController_bytesSentCounter_var((long) (0));
BasicIAControllerJava_ctrl.initBasicIAController_ctrlx_var((int) (0));
BasicIAControllerJava_ctrl.initBasicIAController_SC_Following_game_updateIA_val13_var((byte)0);
BasicIAControllerJava_ctrl.initBasicIAController_SC_Following_game_updateIA_pady_var((int)0);
BasicIAControllerJava_ctrl.initBasicIAController_SC_Following_game_updateIA_ballx_var((int)0);
BasicIAControllerJava_ctrl.initBasicIAController_SC_Following_game_updateIA_bally_var((int)0);
BasicIAControllerJava_ctrl.initBasicIAController_SC_Following_game_updateIA_padx_var((int)0);
BasicIAControllerJava_ctrl.initBasicIAController_SC_Following_received_game_updateIAval13padyballx_var((boolean)false);
BasicIAControllerJava_ctrl.initBasicIAController_SC_Following_received_game_updateIAballypadx_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_bytesSentCounter_var((long) (0));
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_create_ysize_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_create_val9_var((byte)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_create_xsize_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_createysizeval9_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_createxsize_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_destroy_val6_var((byte)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_destroy__var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_destroyval6_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_update_val4_var((byte)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_update__var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_updateval4_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_clear_val1_var((byte)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_clear__var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_clearval1_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_setColor_r_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_setColor_b_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_setColor_val7_var((byte)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_setColor_g_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_setColorrbval7_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_setColorg_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_setBGColor_val5_var((byte)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_setBGColor_g_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_setBGColor_r_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_setBGColor_b_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_setBGColorval5g_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_setBGColorrb_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_drawRect_width_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_drawRect_x_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_drawRect_val3_var((byte)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_drawRect_y_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_drawRect_height_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_drawRectwidthx_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_drawRectval3yheight_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_fillRect_y_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_fillRect_val2_var((byte)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_fillRect_x_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_fillRect_width_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_fillRect_height_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_fillRectyval2_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_fillRectxwidthheight_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_drawInteger_val0_var((byte)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_drawInteger_x_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_drawInteger_y_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_drawInteger_digits_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_drawInteger_scale_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_drawInteger_v_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_drawIntegerval0xy_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_drawIntegerdigitsscalev_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_drawThingML_val10_var((byte)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_drawThingML_x_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_display_drawThingML_y_var((int)0);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_drawThingMLval10x_var((boolean)false);
HeadlessDisplayJava_disp.initHeadlessDisplay_null_MOCK_received_display_drawThingMLy_var((boolean)false);
//Network components for external connectors
/*$NETWORK$*/
//External Connectors
/*$EXT CONNECTORS$*/
/*$START$*/
TimerJava_timer.start();
HeadlessDisplayJava_disp.start();
BasicIAControllerJava_ctrl.start();
BreakoutGameJava_game.start();
//Hook to stop instances following client/server dependencies (clients firsts)
Runtime.getRuntime().addShutdownHook(new Thread() {
public void run() {
BreakoutGameJava_game.stop();
BasicIAControllerJava_ctrl.stop();
HeadlessDisplayJava_disp.stop();
TimerJava_timer.stop();
/*$STOP$*/
}
});

}
}