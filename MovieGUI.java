 // GUI- Based version of the movie quote app from Chapter 1

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovieGUI extends JFrame implements ActionListener
{
	// Create the components
	Font myFont = new Font("Verdana", Font.BOLD, 24);
	JLabel quote = new JLabel("I'm your huckleberry...");
	JLabel movie = new JLabel("");
	JButton button = new JButton("Show Movie");

	// Constructor method for this class
	public MovieGUI()
	{
		super("Movie Quote APP");
		setBounds(600, 340, 500, 300);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		quote.setFont(myFont);
		movie.setFont(myFont);
		add(quote);
		add(button);
		add(movie);
		setVisible(true);
		// add an event listener to the button component
		button.addActionListener(this);
	}

	// event handling method
	@Override
	public void actionPerformed(ActionEvent evt)
	{
		movie.setText("*** Tombstone (1993) ***");
	}

	// Main method to execute the application
	public static void main(String[] args)
	{
		MovieGUI myFrame = new MovieGUI();
	}

}