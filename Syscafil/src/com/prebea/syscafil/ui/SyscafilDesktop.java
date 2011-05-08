/*
 *  The MIT License
 * 
 *  Copyright 2011 Edwin Bratini <edwin.bratini@gmail.com>.
 * 
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package com.prebea.syscafil.ui;

import com.prebea.syscafil.model.entities.Usuario;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.icon.ImageWrapperResizableIcon;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.ribbon.JRibbon;
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand;
import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenu;
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority;
import org.pushingpixels.flamingo.api.ribbon.RibbonTask;
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizePolicies;
import org.pushingpixels.flamingo.api.ribbon.resize.IconRibbonBandResizePolicy;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class SyscafilDesktop extends JRibbonFrame {

    // user logged
    private Usuario usuario;

    // body content
    private JPanel pnlBody;
    
    // for the status bar
    private JPanel pnlStatusBar;
    private JLabel statusMessageLabel = new JLabel();
    private JLabel windowLabel = new JLabel();

    public SyscafilDesktop() {
        initJRibbon();
        //addGap(0, 10);
        initBodyContent();
        initStatusBar();
    }

    public static void main(String[] args) {
        SyscafilDesktop sd = new SyscafilDesktop();
        sd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sd.setPreferredSize(new Dimension(800, 400));
        sd.setLocationByPlatform(true);
        sd.pack();
        sd.setVisible(true);
    }

    private void addGap(int width, int height) {
        JPanel gap = new JPanel();
        gap.setSize(width, height);
        //gap.getBorder()
        add(gap);
    }

    private ResizableIcon getResizableIconFromResource(String resource) {

        return ImageWrapperResizableIcon.getIcon(getClass().getResource(resource), new Dimension(48, 48));
    }

    private void initBodyContent() {
        pnlBody = new JPanel();
        pnlBody.setBorder(new EtchedBorder());
        add(pnlBody, BorderLayout.CENTER);
    }

    private void initStatusBar() {
        pnlStatusBar = new JPanel(new BorderLayout());
        pnlStatusBar.setPreferredSize(new Dimension(400, 25));
        pnlStatusBar.add(windowLabel, BorderLayout.WEST);
        pnlStatusBar.add(statusMessageLabel, BorderLayout.EAST);
        pnlStatusBar.setBorder(new EtchedBorder());
        add(pnlStatusBar, BorderLayout.SOUTH);
    }

    private RibbonTask getHomeTask() {
        // on home task
        // creando los botones
        ButtonActionHandler buttonActionHandler = new ButtonActionHandler();
        JCommandButton jcbLogin = new JCommandButton("Log In", getResizableIconFromResource("/resources/imagenes/login.png"));
        jcbLogin.setName("jcbLogin");
        jcbLogin.addActionListener(buttonActionHandler);

        JCommandButton jcbLogout = new JCommandButton("Log Out", getResizableIconFromResource("/resources/imagenes/login.png"));
        jcbLogout.setName("jcbLogout");
        jcbLogout.addActionListener(buttonActionHandler);

        // creando la banda "Acceso"
        JRibbonBand jrbAccesoBand = new JRibbonBand("Acceso", getResizableIconFromResource("/resources/imagenes/login.png"));
        jrbAccesoBand.addCommandButton(jcbLogin, RibbonElementPriority.TOP);
        jrbAccesoBand.addCommandButton(jcbLogout, RibbonElementPriority.TOP);

        jrbAccesoBand.setResizePolicies((List) Arrays.asList(
                /*new CoreRibbonResizePolicies.None(jrbAccesoBand.getControlPanel()),*/
                new CoreRibbonResizePolicies.Mirror(jrbAccesoBand.getControlPanel()),
                new CoreRibbonResizePolicies.Mid2Low(jrbAccesoBand.getControlPanel()),
                /*new CoreRibbonResizePolicies.High2Low(jrbAccesoBand.getControlPanel()),*/
                new IconRibbonBandResizePolicy(jrbAccesoBand.getControlPanel())));

        RibbonTask rtHomeTask = new RibbonTask("Home", jrbAccesoBand);

        return rtHomeTask;
    }

    private RibbonTask getMantenimientoTask() {
        throw new NotImplementedException();
    }

    private RibbonTask getConsultasTask() {
        throw new NotImplementedException();
    }

    private RibbonTask getSettingsTask() {
        throw new NotImplementedException();
    }

    private RibbonTask getFacturacionTask() {
        throw new NotImplementedException();
    }

    private RibbonTask getAdministracionTask() {
        throw new NotImplementedException();
    }

    // TODO: crear subcarpeta imagenes y colocar los .png correspondiente de los iconos
    private void initJRibbon() {
        RibbonApplicationMenu ram = new RibbonApplicationMenu();
        JRibbon jr = getRibbon();
        jr.addTask(getHomeTask());
        jr.setApplicationMenu(ram);
    }

    private class ButtonActionHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JCommandButton buttonClicked = ((JCommandButton) e.getSource());
            if (buttonClicked.getName().equalsIgnoreCase("jcbLogin")) {
                Login login = new Login(SyscafilDesktop.this, true);
                login.setLocationRelativeTo(SyscafilDesktop.this);
                login.setVisible(true);
            } else if (buttonClicked.getName().equalsIgnoreCase("jcbLogout")) {
                System.out.println("Logout Button Clicked");
                usuario = null;
                // flush log to db and may be close the managers
            }
        }
    }
}
