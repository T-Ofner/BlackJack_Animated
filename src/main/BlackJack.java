//
// Created by ich on 22 May 2026
//

package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import static helper.Helper.*;

public class BlackJack {

	// init deck and random
	ArrayList<Card> deck = new ArrayList<>();
	Random random = new Random(System.currentTimeMillis());

	// init player hand array and vars
	ArrayList<Card> playerHand = new ArrayList<>();
	int playerScore = 0, playerAceCount = 0;


	// init dealer's covered card, dealer hand array and vars
	Card dealerCard;
	ArrayList<Card> dealerHand = new ArrayList<>();
	int dealerScore = 0, dealerAceCount = 0;


	// init GUI
	JFrame frame = new JFrame(WINDOW_TITLE);

	// init GUI components
	JPanel buttonPanel = new JPanel();		// button panel for Hit, Stay, Reset
	JPanel backgroundMenuPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));		// i have no idea what this does

	// buttons for buttonPanel
	JButton hitButton = new JButton("Hit");
	JButton stayButton = new JButton("Stay");
	JButton resetButton = new JButton("Reset");

	// dropdown menu for backgroundMenuPanel or smth
	JComboBox<TableBackground> backgroundColorMenu = new JComboBox<>(TableBackground.values());		// scroll menu

	// actual UI panel
	JPanel gamePanel = new JPanel() {

		@Override
		public void paintComponent(Graphics graphics) {
			super.paintComponent(graphics);

			try {
				


			} catch (Exception e)
			{e.printStackTrace();}
		}

	};


	public BlackJack() {



	}
}
