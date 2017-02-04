/*
 * Copyright (C) 2015 Jack Jiang(cngeeker.com) The BeautyEye Project. 
 * All rights reserved.
 * Project URL:https://github.com/JackJiang2011/beautyeye
 * Version 3.6
 * 
 * Jack Jiang PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * 
 * __UI__.java at 2015-2-1 20:25:39, original version by Jack Jiang.
 * You can contact author with jb2011@163.com.
 */
package org.jb2011.lnf.beautyeye.titlepane;

import javax.swing.UIManager;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ColorUIResource;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.utils.BEUtils;
import org.jb2011.lnf.beautyeye.utils.IconFactory;

public class __UI__ {

    protected static final IconFactory ICON = new IconFactory("frame");

    public static void uiImpl() {
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 窗体ui的各项属性设定
        //*~ 本属性是Jack Jiang自已设定的，Java的Metal主题默认对非Frame对象的窗口图标取的是InternalFrame.icon，这是不对的
        UIManager.put("Frame.icon", ICON.get("icon"));

        UIManager.put("Frame.iconifyIcon", ICON.get("iconify"));
        UIManager.put("Frame.iconifyIcon_rover", ICON.get("iconify_over"));
        UIManager.put("Frame.iconifyIcon_pressed", ICON.get("iconify_pressed"));

        UIManager.put("Frame.minimizeIcon", ICON.get("min"));
        UIManager.put("Frame.minimizeIcon_rover", ICON.get("min_over"));
        UIManager.put("Frame.minimizeIcon_pressed", ICON.get("min_pressed"));

        UIManager.put("Frame.maximizeIcon", ICON.get("max"));
        UIManager.put("Frame.maximizeIcon_rover", ICON.get("max_over"));
        UIManager.put("Frame.maximizeIcon_pressed", ICON.get("max_pressed"));

        UIManager.put("Frame.closeIcon", ICON.get("close"));
        UIManager.put("Frame.closeIcon_rover", ICON.get("close_over"));
        UIManager.put("Frame.closeIcon_pressed", ICON.get("close_pressed"));

        //设定用于演示之用的“设置”按钮图标
        UIManager.put("Frame.setupIcon", ICON.get("setup"));

//		UIManager.put("activeCaption",new ColorUIResource(Windows2LookAndFeel.activeCaption));
        UIManager.put("activeCaptionText", new ColorUIResource(BeautyEyeLNFHelper.activeCaptionTextColor));
//		UIManager.put("activeCaptionBorder",new ColorUIResource(Windows2LookAndFeel.activeCaptionBorder));
//		UIManager.put("inactiveCaption",new ColorUIResource(GraphicHandler.getColor(activeCaption,64,42,22)));
        UIManager.put("inactiveCaptionText", new ColorUIResource(BEUtils.getColor(BeautyEyeLNFHelper.activeCaptionTextColor, -49, -27, -7)));
//		UIManager.put("inactiveCaptionBorder",new ColorUIResource(GraphicHandler.getColor(activeCaptionBorder,64,42,22)));
        //此属性即是BeautyEye LNF的窗口标题栏实现
        UIManager.put("RootPaneUI", BERootPaneUI.class.getName());

        // These bindings are only enabled when there is a default
        // button set on the rootpane.
        UIManager.put("RootPane.defaultButtonWindowKeyBindings", new Object[] {
            "ENTER", "press",
            "released ENTER", "release",
            "ctrl ENTER", "press",
            "ctrl released ENTER", "release"
        });

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> OptionPane的各项ui属性设定
        Object dialogBorder = new BorderUIResource(BeautyEyeLNFHelper.__getFrameBorder());//BorderFactory.createLineBorder(new Color(181,181,181)));
        UIManager.put("RootPane.frameBorder", dialogBorder);
        UIManager.put("RootPane.plainDialogBorder", dialogBorder);
        UIManager.put("RootPane.informationDialogBorder", dialogBorder);
        UIManager.put("RootPane.errorDialogBorder", dialogBorder);
        UIManager.put("RootPane.colorChooserDialogBorder", dialogBorder);
        UIManager.put("RootPane.fileChooserDialogBorder", dialogBorder);
        UIManager.put("RootPane.questionDialogBorder", dialogBorder);
        UIManager.put("RootPane.warningDialogBorder", dialogBorder);
    }
}
