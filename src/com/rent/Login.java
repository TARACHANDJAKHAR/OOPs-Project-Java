package com.rent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;
//import java.awt.Component;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//import org.eclipse.wb.swing.FocusTraversalOnArray;

public class Login 
{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater 
		(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Login window = new Login();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
		);
	}

	public Login() 
	{
		initialize();
	}

	private void initialize()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(224, 255, 255));
		frame.setBounds( 550, 200, 394, 499 );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(SystemColor.activeCaption));
		panel.setBackground(new Color(245, 255, 250));
		panel.setBounds(10, 55, 359, 320);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOG  IN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(125, 10, 144, 50);
		lblNewLabel.setBackground(new Color(240, 240, 240));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Custmer Id : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(16, 80, 118, 30);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(158, 80, 174, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password    : ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(16, 149, 138, 30);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 149, 174, 29);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				jButtonActionPerformed(e);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(55, 230, 100, 30);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(180, 230, 100, 30);
		panel.add(btnNewButton_1);
		//frame.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frame.getContentPane(), panel, lblNewLabel, lblNewLabel_1, textField, lblNewLabel_2, textField_1, btnNewButton, btnNewButton_1}));
	
	}
	
		private void jButtonActionPerformed(java.awt.event.ActionEvent evt)
		{
			String username = textField.getText();
			String password = textField_1.getText();
			
			if(username.equalsIgnoreCase("tarachand") && password.equalsIgnoreCase("2545") )
			{
				Main main = new Main();
				main.frame_1.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(frame, "Wrong Username or Password","Error", 1);
			}
			
		}
}



