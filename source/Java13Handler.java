package com.muchsoft.util.mac;

import java.io.File;

/**
 * This interface is a portable redeclaration of several system dependant interfaces of Apple's Java 1.3 extensions.
 * <p><b>Version History:</b></p>
 * <dl>
 *   <dt> 2004-10-13
 *   <dd> First public release.
 * </dl>
 *
 * @author Thomas Much
 * @version 2004-10-13
 */

public interface Java13Handler {



/**
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.3.1/Java131API_J2SEAndAppleExtensions/api/com/apple/mrj/MRJAboutHandler.html">com.apple.mrj.MRJAboutHandler</a>
 */

public void handleAbout();



/**
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.3.1/Java131API_J2SEAndAppleExtensions/api/com/apple/mrj/MRJPrefsHandler.html">com.apple.mrj.MRJPrefsHandler</a>
 */

public void handlePrefs();



/**
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.3.1/Java131API_J2SEAndAppleExtensions/api/com/apple/mrj/MRJQuitHandler.html">com.apple.mrj.MRJQuitHandler</a>
 */

public void handleQuit();



/**
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.3.1/Java131API_J2SEAndAppleExtensions/api/com/apple/mrj/MRJOpenApplicationHandler.html">com.apple.mrj.MRJOpenApplicationHandler</a>
 */

public void handleOpenApplication();



/**
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.3.1/Java131API_J2SEAndAppleExtensions/api/com/apple/mrj/MRJOpenDocumentHandler.html">com.apple.mrj.MRJOpenDocumentHandler</a>
 */

public void handleOpenFile(File file);



/**
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.3.1/Java131API_J2SEAndAppleExtensions/api/com/apple/mrj/MRJPrintDocumentHandler.html">com.apple.mrj.MRJPrintDocumentHandler</a>
 */

public void handlePrintFile(File file);

}
