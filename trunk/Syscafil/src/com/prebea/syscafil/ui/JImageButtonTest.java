package com.prebea.syscafil.ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class JImageButtonTest extends JFrame
{ 
    JButton jb1, jb2;
    JImageButton jib1, jib2, jib3;
    Image backgroundImage;
    ImageIcon icon;
 
    public JImageButtonTest()
    {
        super( "Test for JImageButton" );
 
        Toolkit tk = Toolkit.getDefaultToolkit();
        // Replace "someImage" and "anotherImage" with your own
        // images...
        backgroundImage = tk.getImage( "C:\\Users\\Edwin Bratini\\Downloads\\icons\\16x16-free-toolbar-icons\\png\\77.png" );
        Image iconImage = tk.getImage( "C:\\Users\\Edwin Bratini\\Downloads\\icons\\16x16-free-toolbar-icons\\gif\\21.gif" );
        icon = new ImageIcon( iconImage );
 
        jib1 = new JImageButton( "Button 1" );
        jib2 = new JImageButton( "Button 2" );
        jib3 = new JImageButton( "Button 3", icon );
        jib2.setBackgroundImage( backgroundImage );
        jib3.setBackgroundImage( backgroundImage );
 
        jb1 = new JButton( "JButton 1" );
        jb2 = new JButton( "JButton 2", icon );
 
        JPanel p1 = new JPanel();
        p1.add( jib1 );
        p1.add( jib2 );
        p1.add( jib3 );
 
        JPanel p2 = new JPanel();
        p2.add( jb1 );
        p2.add( jb2 );
 
        getContentPane().add( p1, BorderLayout.SOUTH );
        getContentPane().add( p2, BorderLayout.NORTH );
    }
 
    public static void main( String[] args )
    {
        JImageButtonTest jibt = new JImageButtonTest();
        jibt.addWindowListener( new ExitHandler() );
        jibt.pack();
        jibt.setVisible( true );
    }
}
 
class ExitHandler extends WindowAdapter
{
    public void windowClosing( WindowEvent e )
    {
        System.exit( 0 );
    }
}
