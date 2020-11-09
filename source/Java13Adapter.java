package com.muchsoft.util.mac;

import java.io.File;
import com.muchsoft.util.Sys;

/**
 * This class registers several callback hooks for Apple's Java 1.3 extensions.
 * Although it makes internal use of system dependant classes, usage of this class is portable.
 * Call {@link Java13Adapter#registerJava13Handler registerJava13Handler} to register the object that
 * receives notifications whenever one of the defined Mac OS X GUI events happens.
 * <p><b>Version History:</b></p>
 * <dl>
 *   <dt> 2004-10-13
 *   <dd> First public release.
 * </dl>
 *
 * @author Thomas Much
 * @version 2004-10-13
 */

public class Java13Adapter implements Java13Handler {



/**
 * An empty implementation for {@link Java13Handler#handleAbout}.
 */

public void handleAbout() { }



/**
 * An empty implementation for {@link Java13Handler#handlePrefs}.
 */

public void handlePrefs() { }



/**
 * An empty implementation for {@link Java13Handler#handleQuit}.
 */

public void handleQuit() { }



/**
 * An empty implementation for {@link Java13Handler#handleOpenApplication}.
 */

public void handleOpenApplication() { }



/**
 * An empty implementation for {@link Java13Handler#handleOpenFile}.
 */

public void handleOpenFile(File file) { }



/**
 * An empty implementation for {@link Java13Handler#handlePrintFile}.
 */

public void handlePrintFile(File file) { }



/**
 * Registers a callback object that implements {@link Java13Handler}.
 * @param handler the object that receives the defined Mac OS X GUI events
 * @throws IllegalArgumentException if handler is the null reference
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.3.1/Java131API_J2SEAndAppleExtensions/api/com/apple/mrj/MRJApplicationUtils.html">com.apple.mrj.MRJApplicationUtils</a>
 */

public static void registerJava13Handler(Java13Handler handler) {

    if (handler == null) {
    
        throw new IllegalArgumentException("Java13Handler must not be null");
    }

    if (Sys.isMacOSX()) {

        try {
    
            Class integration = Class.forName("com.muchsoft.util.mac.Java13Integration");
            
            java.lang.reflect.Constructor constr = integration.getConstructor( new Class[] { Java13Handler.class } );
            
            constr.newInstance( new Object[] { handler } );
        }
        catch (Exception e) {

            e.printStackTrace();
        }
    }
}


}
