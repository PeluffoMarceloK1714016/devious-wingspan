package main.java.wingspan.ui;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.io.*;

public class SetupPanel extends JPanel implements KeyListener, MouseListener{

    public SetupPanel() {
		addMouseListener(this);
		addKeyListener(this);
	}
    
    public void addNotify(){
        super.addNotify();
        requestFocus();
    }

    public void paint(Graphics g) {
    	super.paint(g);
    }
    
    addKeyListener(this);
    public void keyPressed(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}

    public void mouseClicked(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}
