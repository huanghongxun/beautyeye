/*
 * Copyright (C) 2015 Jack Jiang(cngeeker.com) The BeautyEye Project. 
 * All rights reserved.
 * Project URL:https://github.com/JackJiang2011/beautyeye
 * Version 3.6
 * 
 * Jack Jiang PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * 
 * WindowTranslucencyHelper.java at 2015-2-1 20:25:40, original version by Jack Jiang.
 * You can contact author with jb2011@163.com.
 */
package org.jb2011.lnf.beautyeye.utils;

import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;

/**
 * The Class WindowTranslucencyHelper.
 * 
 * 关于java支持窗口透明的详细信息请见：http://docs.oracle.com/javase/tutorial/uiswing/misc/trans_shaped_windows.html#uniform
 * 关于java1.6.0_10里的窗口透明存在一个BUG：
 * BUG出的错误：Exception in thread "AWT-EventQueue-0" java.lang.IllegalArgumentException: Width (0) and height (0) cannot be &lt;= 0
 * 官方BUG ID ：6750920，地址：http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6750920
 * 该BUG被解决于:java1.6.0_12，realease note地址：http://www.oracle.com/technetwork/java/javase/6u12-137788.html
 */
public class WindowTranslucencyHelper {

    /**
     * Checks if is translucency supported.
     *
     * @return true, if is translucency supported
     */
    public static boolean isTranslucencySupported() {
        return GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().isWindowTranslucencySupported(GraphicsDevice.WindowTranslucency.TRANSLUCENT);
    }

    /**
     * Sets the window opaque.
     *
     * @param w the w
     * @param opaque the opaque
     */
    public static void setWindowOpaque(Window w, boolean opaque) {
        Color bgc = w.getBackground();
        /*
         * 在群友机器上（win7+java1.7.0.1）的生产系统下
         * 下使用BeautyEye有时w.getBackground()返回值是null，但为什么返回是null，Jack 没
         * 有测出来（Jack测试都是正常的），暂且认为是其系统代码有问题吧，在此容错一下
         */
        if (bgc == null)
            bgc = Color.black;//暂不知道用此黑色作为容错值合不合适
        Color newBgn = new Color(bgc.getRed(), bgc.getGreen(), bgc.getBlue(), opaque ? 255 : 0);
        w.setBackground(newBgn);
    }

}
