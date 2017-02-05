/*
 * Copyright (C) 2015 Jack Jiang(cngeeker.com) The BeautyEye Project. 
 * All rights reserved.
 * Project URL:https://github.com/JackJiang2011/beautyeye
 * Version 3.6
 * 
 * Jack Jiang PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * 
 * __UI__.java at 2015-2-1 20:25:38, original version by Jack Jiang.
 * You can contact author with jb2011@163.com.
 */
package org.jb2011.lnf.beautyeye.textcoms;

import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.InsetsUIResource;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.utils.Icon9Factory;
import org.jb2011.lnf.beautyeye.widget.border.BERoundBorder;

public class __UI__ {

    public static final Icon9Factory ICON_9 = new Icon9Factory("text");

    public static void uiImpl() {
        final InsetsUIResource iuir = new InsetsUIResource(4, 3, 4, 3);

        //使用全透明色绘边框（用什么边框无所谓，关键是读取它的margin并透明），目的就是要让它的背景显现出来（NinePatch图实现）
        UIManager.put("TextField.margin", iuir);
        UIManager.put("TextField.border", new BorderUIResource(new BERoundBorder().setLineColor(new Color(0, 0, 0, 0))));
        UIManager.put("TextField.selectionForeground", new ColorUIResource(BeautyEyeLNFHelper.commonSelectionForegroundColor));
        UIManager.put("TextField.selectionBackground", new ColorUIResource(BeautyEyeLNFHelper.commonSelectionBackgroundColor));
        UIManager.put("TextField.foreground", new ColorUIResource(BeautyEyeLNFHelper.commonForegroundColor));
        UIManager.put("TextFieldUI", org.jb2011.lnf.beautyeye.textcoms.BETextFieldUI.class.getName());

        UIManager.put("FormattedTextField.margin", iuir);
        UIManager.put("FormattedTextField.border", new BorderUIResource(new BERoundBorder(1).setArcWidth(10).setLineColor(new Color(0, 0, 0, 0))));
        UIManager.put("FormattedTextField.foreground", new ColorUIResource(BeautyEyeLNFHelper.commonForegroundColor));
        UIManager.put("FormattedTextField.inactiveBackground", new ColorUIResource(BeautyEyeLNFHelper.commonBackgroundColor));
        UIManager.put("FormattedTextField.selectionForeground", new ColorUIResource(BeautyEyeLNFHelper.commonSelectionForegroundColor));
        UIManager.put("FormattedTextField.selectionBackground", new ColorUIResource(BeautyEyeLNFHelper.commonSelectionBackgroundColor));
        UIManager.put("FormattedTextFieldUI", org.jb2011.lnf.beautyeye.textcoms.BEFormattedTextFieldUI.class.getName());

        UIManager.put("PasswordField.margin", iuir);
        UIManager.put("PasswordField.border", new BorderUIResource(new BERoundBorder().setLineColor(new Color(0, 0, 0, 0))));
        UIManager.put("PasswordField.selectionForeground", new ColorUIResource(BeautyEyeLNFHelper.commonSelectionForegroundColor));
        UIManager.put("PasswordField.selectionBackground", new ColorUIResource(BeautyEyeLNFHelper.commonSelectionBackgroundColor));
        UIManager.put("PasswordField.foreground", new ColorUIResource(BeautyEyeLNFHelper.commonForegroundColor));
        UIManager.put("PasswordFieldUI", org.jb2011.lnf.beautyeye.textcoms.BEPasswordFieldUI.class.getName());

        UIManager.put("TextArea.margin", iuir);
        UIManager.put("TextArea.border", new BorderUIResource(new BERoundBorder().setLineColor(new Color(0, 0, 0, 0))));
        UIManager.put("TextArea.selectionForeground", new ColorUIResource(BeautyEyeLNFHelper.commonSelectionForegroundColor));
        UIManager.put("TextArea.selectionBackground", new ColorUIResource(BeautyEyeLNFHelper.commonSelectionBackgroundColor));
        UIManager.put("TextArea.foreground", new ColorUIResource(BeautyEyeLNFHelper.commonForegroundColor));
        UIManager.put("TextAreaUI", org.jb2011.lnf.beautyeye.textcoms.BETextAreaUI.class.getName());

        UIManager.put("TextPane.border", new BorderUIResource(new BERoundBorder().setLineColor(new Color(0, 0, 0, 0))));
        UIManager.put("TextPane.selectionBackground", new ColorUIResource(BeautyEyeLNFHelper.commonSelectionBackgroundColor));
        UIManager.put("TextPane.selectionForeground", new ColorUIResource(BeautyEyeLNFHelper.commonSelectionForegroundColor));
        UIManager.put("TextPane.foreground", new ColorUIResource(BeautyEyeLNFHelper.commonForegroundColor));
        UIManager.put("TextPaneUI", org.jb2011.lnf.beautyeye.textcoms.BETextPaneUI.class.getName());

        UIManager.put("EditorPane.border", new BorderUIResource(new BERoundBorder().setLineColor(new Color(0, 0, 0, 0))));
        UIManager.put("EditorPane.selectionForeground", new ColorUIResource(BeautyEyeLNFHelper.commonSelectionForegroundColor));
        UIManager.put("EditorPane.selectionBackground", new ColorUIResource(BeautyEyeLNFHelper.commonSelectionBackgroundColor));
        UIManager.put("EditorPane.foreground", new ColorUIResource(BeautyEyeLNFHelper.commonForegroundColor));
        UIManager.put("EditorPaneUI", org.jb2011.lnf.beautyeye.textcoms.BEEditorPaneUI.class.getName());
    }

    public interface BgSwitchable {

        void switchBgToNomal();

        void switchBgToFocused();
    }
}
