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
    protected ImageIcon getImage(String relativePath) {
        return getRaw(relativePath, IconFactory.class);
    }

    HashMap<String, ImageIcon> icons = new HashMap<>();

    protected void put(String namespace, String key, String filename) {
        if (!ns.equals(namespace))
            return;
        icons.put(namespace + ":" + key, getImage(IMGS_ROOT + "/" + filename + ".png"));
    }

    public ImageIcon get(String... states) {
        String s = "";
        for (String k : states)
            s = concat(s, k);
        return icons.get(ns + ":" + s);
    }

    public ImageIcon getWithButtonState(String key, boolean enabled, boolean pressed) {
        return get(key, (enabled ? (pressed ? "pressed" : "normal") : "disabled"));
    }

    private String concat(String a, String b) {
        if (a.isEmpty() && b.isEmpty())
            return "";
        else if (a.isEmpty())
            return b;
        else if (b.isEmpty())
            return a;
        else
            return a + "_" + b;
    }

    void init() {
        put("menu", "radio_check", "RadioButtonMenuItemCheckIcon2");
        put("menu", "radio_normal", "RadioButtonMenuItemCheckIcon_none");
        put("menu", "check_selected", "checkbox_menuitem_selected_normal");
        put("menu", "check_none", "checkbox_menuitem_none");

        put("internal_frame", "close", "frame_close_over");
        put("internal_frame", "min", "frame_windowize_over");
        put("internal_frame", "max", "frame_maximize_over");
        put("internal_frame", "iconify", "frame_minimize_over");
        put("internal_frame", "icon", "ifi1");

        put("radio", "disabled", "rb_disable");
        put("radio", "normal", "rb_normal");
        put("radio", "pressed", "rb_pressed");
        put("radio", "unchecked_disabled", "rb_un_disable");
        put("radio", "unchecked_normal", "rb_un_normal");
        put("radio", "unchecked_pressed", "rb_un_pressed");

        put("check", "disabled", "cb_disable");
        put("check", "normal", "cb_normal");
        put("check", "pressed", "cb_pressed");
        put("check", "unchecked_disabled", "cb_un_disable");
        put("check", "unchecked_normal", "cb_un_normal");
        put("check", "unchecked_pressed", "cb_un_pressed");

        put("menu_radio", "checked", "RadioButtonMenuItemCheckIcon2");
        put("menu_radio", "normal", "RadioButtonMenuItemCheckIcon_none");
        put("menu_check", "checked", "checkbox_menuitem_selected_normal");
        put("menu_check", "normal", "checkbox_menuitem_none");

        put("table", "descending_sort", "desc2");
        put("table", "ascending_sort", "asc2");

        put("tree", "open", "treeDefaultOpen1");
        put("tree", "closed", "treeDefaultClosed1");
        put("tree", "leaf", "leaf1");
        put("tree", "expanded", "a");
        put("tree", "collapsed", "b");

        put("option_pane", "warn", "warn");
        put("option_pane", "error", "error");
        put("option_pane", "info", "info");
        put("option_pane", "question", "question");

        put("slider", "", "slider_tick1");
        put("slider", "disabled", "slider_tick1_dark");
        put("slider", "vertical", "slider_tick1_v");
        put("slider", "vertical_disabled", "slider_tick1_v_dark");
        put("slider", "notriangle", "slider_tick1_notrangle");
        put("slider", "notriangle_disabled", "slider_tick1_notrangle_dark");
        put("slider", "notriangle_vertical", "slider_tick1_notrangle_v");
        put("slider", "notriangle_vertical_disabled", "slider_tick1_notrangle_v_dark");
        
        put("frame", "close", "frame_close_normal");
        put("frame", "close_over", "frame_close_rover");
        put("frame", "close_pressed", "frame_close_pressed");
        put("frame", "min", "frame_maxwin");
        put("frame", "min_over", "frame_maxwin_rover");
        put("frame", "min_pressed", "frame_maxwin_pressed");
        put("frame", "max", "frame_max_normal");
        put("frame", "max_over", "frame_max_rover");
        put("frame", "max_pressed", "frame_max_pressed");
        put("frame", "iconify", "frame_min_normal");
        put("frame", "iconify_over", "frame_min_rover");
        put("frame", "iconify_pressed", "frame_min_pressed");
        put("frame", "icon", "default_frame_icon");
        put("frame", "setup", "frame_setup_normal");
        put("frame", "title_active", "head_bg");
        put("frame", "title_inactive", "head_inactive");
    }

}
