package gui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
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
		
		JRadioButton radioBtnQueen = new JRadioButton();
		radioBtnQueen.setVisible(true);
		radioBtnQueen.setBounds(10, LABEL_Y + LABEL_HEIGHT + 10, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		radioBtnQueen.setText("Queen");
		window.add(radioBtnQueen);
		
		JRadioButton radioBtnRook = new JRadioButton();
		radioBtnRook.setVisible(true);
		radioBtnRook.setBounds(10 + RADIOBUTTON_WIDTH + 10, LABEL_Y + LABEL_HEIGHT + 10, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		radioBtnRook.setText("Rook");
		window.add(radioBtnRook);
		
		JRadioButton radioBtnKnight = new JRadioButton();
		radioBtnKnight.setVisible(true);
		radioBtnKnight.setBounds(10 + RADIOBUTTON_WIDTH*2 + 20, LABEL_Y + LABEL_HEIGHT + 10, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		radioBtnKnight.setText("Knight");
		window.add(radioBtnKnight);
		
		JRadioButton radioBtnBishop = new JRadioButton();
		radioBtnBishop.setVisible(true);
		radioBtnBishop.setBounds(10 + RADIOBUTTON_WIDTH*3 + 30, LABEL_Y + LABEL_HEIGHT + 10, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		radioBtnBishop.setText("Bishop");
		window.add(radioBtnBishop);
		
		ButtonGroup G = new ButtonGroup();
		G.add(radioBtnQueen);
		G.add(radioBtnRook);
		G.add(radioBtnKnight);
		G.add(radioBtnBishop);
		
		JButton btnChoose = new JButton();
		btnChoose.setVisible(true);
		btnChoose.setBounds(170, 10 + LABEL_HEIGHT + 10 + RADIOBUTTON_HEIGHT + 10,  50, 30);
		btnChoose.setText("Choose");
		window.add(btnChoose);
		
	}

}
