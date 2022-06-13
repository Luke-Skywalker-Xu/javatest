package com.xuxiaolan.java.day12;

import java.applet.Applet;
import java.awt.*;
class pc {
    static double ad=8;

}
public class Test3 extends Applet {
    public void paint(Graphics g) {
        pc m = new pc();
        pc m1 = new pc();
        m.ad = 0.1;
        g.drawString("m1.ad" +m1.ad, 20, 50);
        g.drawString("m1.ad" + m1.ad, 20, 70);
        g.drawString("m1.ad" + m1.ad, 20, 90);
    }
}
