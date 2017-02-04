/*
 * Copyright (C) 2015 Jack Jiang(cngeeker.com) The BeautyEye Project. 
 * All rights reserved.
 * Project URL:https://github.com/JackJiang2011/beautyeye
 * Version 3.6
 * 
 * Jack Jiang PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * 
 * __UI__.java at 2015-2-1 20:25:41, original version by Jack Jiang.
 * You can contact author with jb2011@163.com.
 */
package org.jb2011.lnf.beautyeye.internalframe;

import javax.swing.UIManager;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ColorUIResource;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.utils.IconFactory;
import org.jb2011.lnf.beautyeye.widget.border.BEShadowBorder;

// TODO: Auto-generated Javadoc
/**
 * The Class __UI__.
 */
public class __UI__ {

    private static final IconFactory ICON = new IconFactory("internal_frame");

    public static void uiImpl() {
        //内部窗体的边框颜色（BueaytyEye中无意义，原因是BeautyEye LNF中的border是使用NP图实现）
        UIManager.put("InternalFrame.borderColor", new ColorUIResource(BeautyEyeLNFHelper.commonBackgroundColor));
        UIManager.put("InternalFrame.minimizeIconBackground", new ColorUIResource(BeautyEyeLNFHelper.commonBackgroundColor));
//		UIManager.put("InternalFrame.paletteCloseIcon"//本属性在beautyEye中不会起效的
//				,org.jb2011.lnf.windows2.ch1.__IconFactory__.getInstance().getInternalFrameCloseIcon());
        UIManager.put("InternalFrame.icon", ICON.get("icon"));
        UIManager.put("InternalFrame.iconifyIcon", ICON.get("iconify"));
        UIManager.put("InternalFrame.minimizeIcon", ICON.get("min"));
        UIManager.put("InternalFrame.maximizeIcon", ICON.get("max"));
        UIManager.put("InternalFrame.closeIcon", ICON.get("close"));
        UIManager.put("InternalFrameUI", org.jb2011.lnf.beautyeye.internalframe.BEInternalFrameUI.class.getName());
//		UIManager.put("InternalFrame.paletteTitleHeight",40);//本属性在beautyEye中不会起效的
//		UIManager.put("InternalFrame.titlePaneHeight",38);//default is 25
//		UIManager.put("InternalFrame.borderWidth",10);
        Object internalFrameBorder = new BorderUIResource(new BEShadowBorder());
        UIManager.put("InternalFrame.border", internalFrameBorder);
        UIManager.put("InternalFrame.paletteBorder", internalFrameBorder);
        UIManager.put("InternalFrame.optionDialogBorder", internalFrameBorder);

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> JDesktopPane相关ui属性设定
        //JDesktopPane的背景色
        UIManager.put("Desktop.background", new ColorUIResource(BeautyEyeLNFHelper.commonBackgroundColor));
        //此属性暂无意义
//		UIManager.put("Desktop.minOnScreenInsets",new InsetsUIResource(10,10,10,10));//default is 3,3,3,3
        //JDesktopPane中内部窗体最小化时的窗体组件宽度
        UIManager.put("DesktopIcon.width", 180);//默认是160
        //BeautyEye LNF中内部窗体标题栏实现
        UIManager.put("DesktopIconUI", org.jb2011.lnf.beautyeye.internalframe.BEDesktopIconUI.class.getName());
    }
}
