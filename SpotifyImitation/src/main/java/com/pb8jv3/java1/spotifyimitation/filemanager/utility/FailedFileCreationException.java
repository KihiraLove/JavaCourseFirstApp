package com.pb8jv3.java1.spotifyimitation.filemanager.utility;

/**
 *
 * @author Kertesz Domonkos PB8JV3
 */
public class FailedFileCreationException extends Exception{

    public FailedFileCreationException(String string) {
	super(string);
    }

    FailedFileCreationException() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
