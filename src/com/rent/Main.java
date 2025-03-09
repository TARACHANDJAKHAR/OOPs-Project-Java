package com.rent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Main 
{

	JFrame frame_1;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater
		(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Main window = new Main();
					window.frame_1.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
		);
	}

	public Main() 
	{
		initialize();
	}

	private void initialize() 
	{
		frame_1 = new JFrame();
		frame_1.getContentPane().setBackground(new Color(224, 255, 255));
		frame_1.setBounds(450, 100, 600, 700);
		frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_1.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("LOGOUT");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener
		(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnNewButton.setBounds(425, 78, 109, 36);
		frame_1.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Car Registration");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(127, 170, 253, 50);
		frame_1.getContentPane().add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Car_registration car_reg = new Car_registration();
				car_reg.frame_2.setVisible(true);
			}
		});
		
		JButton btnNewButton_2 = new JButton("Customer");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(127, 280, 253, 50);
		frame_1.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Rental");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(127, 390, 253, 50);
		frame_1.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Return");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(127, 500, 253, 50);
		frame_1.getContentPane().add(btnNewButton_4);
	}

}
