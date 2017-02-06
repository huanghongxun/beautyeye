/*
 * Copyright (C) 2015 Jack Jiang(cngeeker.com) The BeautyEye Project. 
 * All rights reserved.
 * Project URL:https://github.com/JackJiang2011/beautyeye
 * Version 3.6
 * 
 * Jack Jiang PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * 
 * BeautyEyeLookAndFeel.java at 2015-2-1 20:25:40, original version by Jack Jiang.
 * You can contact author with jb2011@163.com.
 */
package org.jb2011.lnf.beautyeye;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.FrameBorderStyle;

/**
 * <p>
 * BeautyEye Swing外观实现方案 - 跨平台通用外观实现主类.<br>
 * <p>
 * 本主题主类仅供跨平台时使用，它可用于Java支持的所有操作系统.
 *
 * 如果要继承BasicLookAndFeel实现跨平台lnf 则还需要做更多的工作，目前
 * 跨平台时干脆继承MetalLookAndFeel以便站在巨人的肩膀上，节省一些工作量
 *
 * @author Jack Jiang(jb2011@163.com)
 * @version 1.0
 */
public class BeautyEyeLookAndFeel extends MetalLookAndFeel {

    static {
        if (BeautyEyeLNFHelper.frameBorderStyle == FrameBorderStyle.osLookAndFeelDecorated) {
            JFrame.setDefaultLookAndFeelDecorated(false);
            JDialog.setDefaultLookAndFeelDecorated(false);
        } else {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
        }

//		UIManager.put("swing.aatext", Boolean.FALSE);
    }

    public BeautyEyeLookAndFeel() {
        super();

//		//本属性仅对windows平台有效？！ -> Jack Jiang最终证实没效果！！！！！！！！！！！
//		UIManager.put("Application.useSystemFontSettings", Boolean.TRUE);
        //取消Metal LNF中默认的粗体字
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        //此项如是true，则将会为TabbedPane的内容面板填充天蓝色背景
        UIManager.put("TabbedPane.contentOpaque", Boolean.FALSE);
        //此项如是true，则将会为TabbedPane的标签填充天蓝色背景
        UIManager.put("TabbedPane.tabsOpaque", Boolean.FALSE);
        BeautyEyeLNFHelper.implLNF();

//		JFrame.setDefaultLookAndFeelDecorated(true);
//		JDialog.setDefaultLookAndFeelDecorated(true);
    }

    @Override
    public String getName() {
        return "BeautyEye";
    }

    @Override
    public String getID() {
        return "BeautyEye";
    }

    @Override
    public String getDescription() {
        return "BeautyEye L&F developed by Jack Jiang(jb2011@163.com).";
    }

    /**
     * Gets the supports window decorations.
     *
     * @return the supports window decorations {@inheritDoc}
     */
    @Override
    public boolean getSupportsWindowDecorations() {
        return true;
    }

    @Override
    public boolean isNativeLookAndFeel() {
        return false;
    }

    @Override
    public boolean isSupportedLookAndFeel() {
        return true;
    }

    @Override
    protected void initComponentDefaults(UIDefaults table) {
        super.initComponentDefaults(table);
        initOtherResourceBundle(table);
    }

    /**
     * Initialize the defaults table with the name of the other ResourceBundle
     * used for getting localized defaults.
     */
    protected void initOtherResourceBundle(UIDefaults table) {
        table.addResourceBundle("org.jb2011.lnf.beautyeye.resources.beautyeye");
    }
}
