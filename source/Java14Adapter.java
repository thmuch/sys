package com.muchsoft.util.mac;

import java.io.File;
import java.util.EventObject;
import com.muchsoft.util.Sys;

/**
 * This class registers several callback hooks for Apple's Java 1.4 extensions.
 * Although it makes internal use of system dependant classes, usage of this class is portable.
 * Call {@link Java14Adapter#registerJava14Handler registerJava14Handler} to register the object that
 * receives notifications whenever one of the defined Mac OS X GUI events happens.
 * Call {@link Java14Adapter#setEnabledPrefs setEnabledPrefs} to enable or disable the "Preferences" menu item.
 * <p><b>Version History:</b></p>
 * <dl>
 *   <dt> 2004-10-13
 *   <dd> First public release.
 * </dl>
 *
 * @author Thomas Much
 * @version 2004-10-13
 */

public class Java14Adapter implements Java14Handler {

private static Object integr;



/**
 * An empty implementation for {@link Java14Handler#handleAbout}.
 */

public void handleAbout(EventObject event) { }



/**
 * An empty implementation for {@link Java14Handler#handlePrefs}.
 */

public void handlePrefs(EventObject event) { }



/**
 * An empty implementation for {@link Java14Handler#handleQuit}.
 */

public void handleQuit(EventObject event) { }



/**
 * An empty implementation for {@link Java14Handler#handleOpenApplication}.
 */

public void handleOpenApplication(EventObject event) { }



/**
 * An empty implementation for {@link Java14Handler#handleReOpenApplication}.
 */

public void handleReOpenApplication(EventObject event) { }



/**
 * An empty implementation for {@link Java14Handler#handleOpenFile}.
 */

public void handleOpenFile(EventObject event, String filename) { }



/**
 * An empty implementation for {@link Java14Handler#handleAbout}.
 */

public void handlePrintFile(EventObject event, String filename) { }



/**
 * Registers a callback object that implements {@link Java14Handler}.
 * @param handler the object that receives the defined Mac OS X GUI events
 * @throws IllegalArgumentException if handler is the null reference
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/Application.html#addApplicationListener(com.apple.eawt.ApplicationListener)">com.apple.eawt.Application.addApplicationListener</a>
 */

public static void registerJava14Handler(Java14Handler handler) {

    if (handler == null) {
    
        throw new IllegalArgumentException("Java14Handler must not be null");
    }

    if (Sys.isMacOSX()) {

        try {
    
            Class integration = Class.forName("com.muchsoft.util.mac.Java14Integration");
            
            java.lang.reflect.Constructor constr = integration.getConstructor( new Class[] { Java14Handler.class } );

            integr = constr.newInstance( new Object[] { handler } );
        }
        catch (Exception e) {

            e.printStackTrace();
        }
    }
}



/**
 * Tries to invoke setHandled() on the EventObject passed in event. Fails silently if event is no instance of
 * <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationEvent.html">com.apple.eawt.ApplicationEvent</a>.
 * @param event may be null
 * @param state true if the event has been handled, otherwise false
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationEvent.html#setHandled(boolean)">com.apple.eawt.ApplicationEvent.setHandled</a>
 */

public static void setHandled(EventObject event, boolean state) {

    if (event == null) return;

    if (Sys.isMacOSX()) {

        try {

            java.lang.reflect.Method m = event.getClass().getMethod( "setHandled", new Class[] { boolean.class } );

            m.invoke( event, new Object[] { new Boolean(state) } );
        }
        catch (Exception e) {

            e.printStackTrace();
        }
    }
}



/**
 * Enables or disables the "Preferences" menu item.
 * @param enable specifies whether the "Preferences" item in the application menu should be enabled (true) or not (false)
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/Application.html#setEnabledPreferencesMenu(boolean)">com.apple.eawt.Application.setEnabledPreferencesMenu</a>
 */

public static void setEnabledPrefs(boolean enable) {

    if (Sys.isMacOSX()) {

        try {

            java.lang.reflect.Method m = integr.getClass().getMethod( "enablePrefs", new Class[] { boolean.class } );

            m.invoke( integr, new Object[] { new Boolean(enable) } );
        }
        catch (Exception e) {

            e.printStackTrace();
        }
    }
}


}
