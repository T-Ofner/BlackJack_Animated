//
// Created by ich on 22 May 2026
//

package Main;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import static Helper.Helper.*;

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
	JComboBox<TableBackground> backgroundColorMenu = new JComboBox<>(TableBackground.values());		// ai

	public BlackJack() {

		println("Hello, World!");

	}
}
