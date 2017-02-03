/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jb2011.lnf.beautyeye.utils;

import java.util.HashMap;
import javax.swing.ImageIcon;

/**
 *
 * @author huang
 */
public class IconFactory extends RawCache<ImageIcon> {

    /**
     * 相对路径根（默认是相对于本类的相对物理路径）.
     */
    public final static String IMGS_ROOT = "imgs";

    public IconFactory(String namespace) {
        ns = namespace;
        init();
    }

    String ns;
    /* (non-Javadoc)
	 * @see org.jb2011.lnf.beautyeye.utils.RawCache#getResource(java.lang.String, java.lang.Class)
     */
    @Override
    protected ImageIcon getResource(String relativePath, Class baseClass) {
        return new ImageIcon(baseClass.getResource(relativePath));
    }

    /**
     * Gets the image.
     *
     * @param relativePath the relative path
     * @return the image
     */
    public ImageIcon get(String relativePath) {
        return getRaw(relativePath, this.getClass());
    }

    HashMap<String, ImageIcon> icons = new HashMap<>();

    protected void put(String namespace, String key, String filename) {
        if (!ns.equals(namespace))
            return;
        icons.put(namespace + ":" + key, get(IMGS_ROOT + "/" + filename + ".png"));
    }
    
    void init() {
        put("menu", "radio_check", "RadioButtonMenuItemCheckIcon2");
        put("menu", "radio_normal", "RadioButtonMenuItemCheckIcon_none");
        put("menu", "check_selected", "checkbox_menuitem_selected_normal");
        put("menu", "check_none", "checkbox_menuitem_none");
    }

}
