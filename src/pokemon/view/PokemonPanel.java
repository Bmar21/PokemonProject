package pokemon.view;

import java.awt.Color;
import javax.swing.*;
import pokemon.controller.PokemonController;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent.*;
import java.awt.event.MouseListener.*;
import java.awt.event.MouseMotionListener;
import pokemon.controller.PokemonController;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokemonPanel(PokemonController baseController)
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.setBackground(Color.DARK_GRAY);
		
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);
		
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalTextPositon(JLabel.CENTER);
		
		this.add(pokedexSelector);
		this.add
	}
	
	private void setupLayout()

	{
		
	}

	private void setupDropdown()
	{
		
	}
	
	private void setupListeners()
	{
		pokedexSelector.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selected = pokedexSelector.getSelectedIndex();
				nameField,setText(baseController.getPokedex().get(selected).getName());
				numberField.setText(baseController.getPokedex().get(selected).getNumber() + "" );
				combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeed() + "");
				healthField.setText(baseController.getPokedex().get(selected).getHealthPoints() + "");
				advancedArea.setText(baseController.getPokedex().get(selected).getPokemonInformation()
						+"\n\n" + baseController.getPokedex().get(selected).getPokemonTypes());
				changeColorBasedOnData(baseController.getPokedex().get(selected).getPokemonTypes());
				changeImageDisplay(baseController.getPokedex().get(selected).getClass().getSimpleName());
			}
		});
		
		updateButton.addActionListener(new ActionListener() 
		{
	
		});
		
		this.addMouseListener(new MouseListener()
		{
//			public void mouseEntered(MouseEvent entered)
			{
		//		JOptionPane.showMessageDialog(baseController.getBaseFrame(), "mouse entered the program");
			}
			
//			public void mouseReleased(MouseEvent entered)
			{
	//			JOptionPane.showMessageDialog(baseController.getBaseFrame(), "Released");
			}
		});
	}
			
	private void changeColorBasedOnData(String data)
	{
		
	}

	private void changeImageDisplay(String name)
	{
		
	}
		
	private boolean isVaildDouble(String input)
	{
		
	}

	private boolean isVaildInteger(String input)
	{
		
	}

	private boolean isVaildName(String name)
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}









