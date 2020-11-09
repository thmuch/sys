package com.muchsoft.util.mac;

import java.io.File;
import java.util.EventObject;

/**
 * This interface is a portable redeclaration of <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationListener.html">com.apple.eawt.ApplicationListener</a>.
 * <p><b>Version History:</b></p>
 * <dl>
 *   <dt> 2004-10-13
 *   <dd> First public release.
 * </dl>
 *
 * @author Thomas Much
 * @version 2004-10-13
 */

public interface Java14Handler {



/**
 * If you do not wish a default about box to appear, call {@link Java14Adapter#setHandled Java14Adapter.setHandled(event,true)}.
 * @param event a downcast from <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationEvent.html">com.apple.eawt.ApplicationEvent</a> to the portable java.util.EventObject
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationListener.html#handleAbout(com.apple.eawt.ApplicationEvent)">com.apple.eawt.ApplicationListener.handleAbout</a>
 */

public void handleAbout(EventObject event);



/**
 * @param event a downcast from <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationEvent.html">com.apple.eawt.ApplicationEvent</a> to the portable java.util.EventObject
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationListener.html#handlePreferences(com.apple.eawt.ApplicationEvent)">com.apple.eawt.ApplicationListener.handlePreferences</a>
 * @see Java14Adapter#setEnabledPrefs
 */

public void handlePrefs(EventObject event);



/**
 * If you want to reject the request to quit, call {@link Java14Adapter#setHandled Java14Adapter.setHandled(event,false)}.
 * @param event a downcast from <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationEvent.html">com.apple.eawt.ApplicationEvent</a> to the portable java.util.EventObject
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationListener.html#handleQuit(com.apple.eawt.ApplicationEvent)">com.apple.eawt.ApplicationListener.handleQuit</a>
 */

public void handleQuit(EventObject event);



/**
 * @param event a downcast from <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationEvent.html">com.apple.eawt.ApplicationEvent</a> to the portable java.util.EventObject
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationListener.html#handleOpenApplication(com.apple.eawt.ApplicationEvent)">com.apple.eawt.ApplicationListener.handleOpenApplication</a>
 */

public void handleOpenApplication(EventObject event);



/**
 * @param event a downcast from <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationEvent.html">com.apple.eawt.ApplicationEvent</a> to the portable java.util.EventObject
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationListener.html#handleReOpenApplication(com.apple.eawt.ApplicationEvent)">com.apple.eawt.ApplicationListener.handleReOpenApplication</a>
 */

public void handleReOpenApplication(EventObject event);



/**
 * @param event a downcast from <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationEvent.html">com.apple.eawt.ApplicationEvent</a> to the portable java.util.EventObject
 * @param filename the string returned by <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationEvent.html#getFilename()">com.apple.eawt.ApplicationEvent.getFilename</a>
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationListener.html#handleOpenFile(com.apple.eawt.ApplicationEvent)">com.apple.eawt.ApplicationListener.handleOpenFile</a>
 */

public void handleOpenFile(EventObject event, String filename);



/**
 * @param event a downcast from <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationEvent.html">com.apple.eawt.ApplicationEvent</a> to the portable java.util.EventObject
 * @param filename the string returned by <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationEvent.html#getFilename()">com.apple.eawt.ApplicationEvent.getFilename</a>
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.4.2/appledoc/api/com/apple/eawt/ApplicationListener.html#handlePrintFile(com.apple.eawt.ApplicationEvent)">com.apple.eawt.ApplicationListener.handlePrintFile</a>
 */

public void handlePrintFile(EventObject event, String filename);

}
