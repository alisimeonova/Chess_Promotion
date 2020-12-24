package gui;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class PromotionGUI 
{
	public static void main(String[] args)
	{
		final int LABEL_X = 45;
		final int LABEL_Y = 10;
		final int LABEL_WIDTH = 250;
		final int LABEL_HEIGHT = 40;
		final int RADIOBUTTON_WIDTH = 70;
		final int RADIOBUTTON_HEIGHT = 30;

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(0, 0, 350, 250);
		window.setLayout(null);
		window.setVisible(true);
		
		JLabel label = new JLabel();
		label.setVisible(true);
		label.setBounds(LABEL_X, LABEL_Y, LABEL_WIDTH, LABEL_HEIGHT);
		label.setText("Choose a figure to switch with your pawn");
		window.add(label);
		
		JRadioButton queen = new JRadioButton();
		queen.setVisible(true);
		queen.setBounds(10, LABEL_Y + LABEL_HEIGHT + 10, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		queen.setText("Queen");
		window.add(queen);
		
		JRadioButton rook = new JRadioButton();
		rook.setVisible(true);
		rook.setBounds(10 + RADIOBUTTON_WIDTH + 10, LABEL_Y + LABEL_HEIGHT + 10, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		rook.setText("Rook");
		window.add(rook);
		
		JRadioButton knight = new JRadioButton();
		knight.setVisible(true);
		knight.setBounds(10 + RADIOBUTTON_WIDTH*2 + 20, LABEL_Y + LABEL_HEIGHT + 10, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		knight.setText("Knight");
		window.add(knight);
		
		JRadioButton bishop = new JRadioButton();
		bishop.setVisible(true);
		bishop.setBounds(10 + RADIOBUTTON_WIDTH*3 + 30, LABEL_Y + LABEL_HEIGHT + 10, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		bishop.setText("Bishop");
		window.add(bishop);
		
		ButtonGroup G = new ButtonGroup();
		G.add(queen);
		G.add(rook);
		G.add(knight);
		G.add(bishop);
	}

}
