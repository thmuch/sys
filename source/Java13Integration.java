package com.muchsoft.util.mac;

import java.io.*;
import com.apple.mrj.*;



class Java13Integration
                implements MRJAboutHandler, MRJOpenApplicationHandler,
                           MRJOpenDocumentHandler, MRJPrefsHandler,
                           MRJPrintDocumentHandler, MRJQuitHandler {

private Java13Handler handler;



public Java13Integration(Java13Handler handler) {

    this.handler = handler;

    MRJApplicationUtils.registerAboutHandler( this );
    MRJApplicationUtils.registerOpenApplicationHandler( this );
    MRJApplicationUtils.registerOpenDocumentHandler( this );
    MRJApplicationUtils.registerPrefsHandler( this );
    MRJApplicationUtils.registerPrintDocumentHandler( this );
    MRJApplicationUtils.registerQuitHandler( this );
}



public void handleAbout() {

    handler.handleAbout();
}



public void handlePrefs() {

    handler.handlePrefs();
}



public void handleQuit() {

    handler.handleQuit();
}



public void handleOpenApplication() {

    handler.handleOpenApplication();
}



public void handleOpenFile(File file) {

    handler.handleOpenFile(file);
}



public void handlePrintFile(File file) {

    handler.handlePrintFile(file);
}


}
