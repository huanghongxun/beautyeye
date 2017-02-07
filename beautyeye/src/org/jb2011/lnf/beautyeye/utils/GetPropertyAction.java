/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jb2011.lnf.beautyeye.utils;

import java.security.PrivilegedAction;

/**
 *
 * @author huang
 */
public class GetPropertyAction
        implements PrivilegedAction {

    private String theProp;
    private String defaultVal;

    public GetPropertyAction(String theProp) {
        this.theProp = theProp;
    }

    public GetPropertyAction(String theProp, String defaultVal) {
        this.theProp = theProp;
        this.defaultVal = defaultVal;
    }

    public Object run() {
        String str = System.getProperty(this.theProp);
        return str == null ? this.defaultVal : str;
    }
}
