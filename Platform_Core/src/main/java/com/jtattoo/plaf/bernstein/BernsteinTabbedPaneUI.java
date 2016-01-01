/*
* Copyright (c) 2002 and later by MH Software-Entwicklung. All Rights Reserved.
*  
* JTattoo is multiple licensed. If your are an open source developer you can use
* it under the terms and conditions of the GNU General Public License version 2.0
* or later as published by the Free Software Foundation.
*  
* see: gpl-2.0.txt
* 
* If you pay for a license you will become a registered user who could use the
* software under the terms and conditions of the GNU Lesser General Public License
* version 2.0 or later with classpath exception as published by the Free Software
* Foundation.
* 
* see: lgpl-2.0.txt
* see: classpath-exception.txt
* 
* Registered users could also use JTattoo under the terms and conditions of the 
* Apache License, Version 2.0 as published by the Apache Software Foundation.
*  
* see: APACHE-LICENSE-2.0.txt
*/
 
package com.jtattoo.plaf.bernstein;

import com.jtattoo.plaf.BaseTabbedPaneUI;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

/**
 * The Class BernsteinTabbedPaneUI.
 *
 * @author Michael Hagen
 */
public class BernsteinTabbedPaneUI extends BaseTabbedPaneUI {

    /** The sep colors. */
    private static Color SEP_COLORS[] = {
        new Color(229, 187, 0),
        new Color(254, 240, 0),
        new Color(251, 232, 0),
        new Color(247, 225, 0),
        new Color(243, 216, 0),
        new Color(229, 187, 0),};

    public static ComponentUI createUI(JComponent c) {
        return new BernsteinTabbedPaneUI();
    }

    public void installDefaults() {
        super.installDefaults();
        tabAreaInsets.bottom = 6;
    }

    protected Color[] getContentBorderColors(int tabPlacement) {
        return SEP_COLORS;
    }

}