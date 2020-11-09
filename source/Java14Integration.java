package com.muchsoft.util.mac;

import java.io.*;
import com.apple.eawt.*;



class Java14Integration implements ApplicationListener {

private Java14Handler handler;
private Application   app;



public Java14Integration(Java14Handler handler) {

    this.handler = handler;
    this.app     = new Application();

    this.app.setEnabledPreferencesMenu( true );
    this.app.setEnabledPreferencesMenu( false );
   
    this.app.addApplicationListener( this );
}



public void handleAbout(ApplicationEvent event) {

    handler.handleAbout( event );
}



public void handlePreferences(ApplicationEvent event) {

    handler.handlePrefs( event );
}



public void handleQuit(ApplicationEvent event) {

    handler.handleQuit( event );
}



public void handleOpenApplication(ApplicationEvent event) {

    handler.handleOpenApplication( event );
}



public void handleReOpenApplication(ApplicationEvent event) {

    handler.handleReOpenApplication( event );
}



public void handleOpenFile(ApplicationEvent event) {

    handler.handleOpenFile( event, event.getFilename() );
}



public void handlePrintFile(ApplicationEvent event) {

    handler.handlePrintFile( event, event.getFilename() );
}



public void enablePrefs(boolean enable) {

    this.app.setEnabledPreferencesMenu( enable );
}


}
