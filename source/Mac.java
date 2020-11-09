package com.muchsoft.util;

/**
 * This class offers Mac-specific (but portable) conversion routines.
 * The "OSType" methods are useful when working with file metadata like type and creator codes.
 * <p><b>Version History:</b></p>
 * <dl>
 *   <dt> 2004-10-13
 *   <dd> First public release.
 * </dl>
 *
 * @author Thomas Much
 * @version 2004-10-13
 */

public class Mac {



private Mac() { }



/**
 * Converts an OS type from an int value to a 4-byte String.
 * If this method cannot use the "MacRoman" character encoding, it uses the system's default character encoding instead.
 * @param type the OS type as an int value
 * @return a 4-byte String
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.4.1/Java141API_QTJ/quicktime/util/QTUtils.html#fromOSType(int)">quicktime.util.QTUtils.fromOSType</a>
 */

public static String fromOSType(int type) {

    byte[] b = new byte[] { (byte)(type >> 24), (byte)((type >> 16) & 0xff),
                            (byte)((type >> 8) & 0xff), (byte)(type & 0xff) };

    try
    {
        return new String( b, "MacRoman" );
    }
    catch (java.io.UnsupportedEncodingException e)
    {
        return new String( b );
    }
}



/**
 * Converts a 4-byte String to an int value representing the OS type.
 * If this method cannot use the "MacRoman" character encoding, it uses the system's default character encoding instead.
 * @param s a 4-byte String
 * @return an int containing the OS type
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.4.1/Java141API_QTJ/quicktime/util/QTUtils.html#toOSType(java.lang.String)">quicktime.util.QTUtils.toOSType</a>
 */

public static int toOSType(String s) {

    byte[] b;
    
    try
    {
        b = s.getBytes( "MacRoman" );
    }
    catch (java.io.UnsupportedEncodingException e)
    {
        b = s.getBytes();
    }
    
    return (b[0] << 24) | (b[1] << 16) | (b[2] << 8) | b[3];
}



/**
 * Converts four char values to an int value representing the OS type.
 * If this method cannot use the "MacRoman" character encoding, it uses the system's default character encoding instead.
 * @param a the char value containing the most significant byte
 * @param b the char value containing the second most significant byte
 * @param c the char value containing the least but one significant byte
 * @param d the char value containing the least significant byte
 * @return an int containing the OS type
 * @see <a href="http://developer.apple.com/documentation/Java/Reference/1.4.1/Java141API_QTJ/quicktime/util/QTUtils.html#toOSType(char, char, char, char)">quicktime.util.QTUtils.toOSType</a>
 */

public static int toOSType(char a, char b, char c, char d) {

    return toOSType( new String( new char[] { a,b,c,d } ));
}


}
