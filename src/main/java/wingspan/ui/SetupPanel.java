package wingspan.ui;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.io.*;

public class SetupPanel extends JPanel implements KeyListener, MouseListener{
	int currentPlayer;
	int numSelected;
	
	ArrayList<Card> selectedCards;
	ArrayList<String> selectedFoods;
	
    public SetupPanel() {
		currentPlayer = 1;
		numSelected = 0;
		selectedCards = new ArrayList<Card>();
		selectedFoods = new ArrayList<String>();
		
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
    
    public void keyPressed(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){
		char c = e.getKeyChar();

		if(c == 'c'){
			if(numSelected == 5){
				// Give the current player the selected food/card items
				currentPlayer += 1;
				
				numSelected = 0;
				selectedCards = new ArrayList<Card>();
				selectedFoods = new ArrayList<String>();
				repaint();
			}
		}
	}

  	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}
