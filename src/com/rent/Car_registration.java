package com.rent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Car_registration 
{

	JFrame frame_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater
		(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Car_registration window = new Car_registration();
					window.frame_2.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
		);
	}

	public Car_registration() 
	{
		initialize();
	}

	@SuppressWarnings("serial")
	private void initialize() 
	{
		frame_2 = new JFrame();
		frame_2.getContentPane().setBackground(new Color(224, 255, 255));
		frame_2.setBounds(290, 100, 900, 600);
		frame_2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_2.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 866, 248);
		frame_2.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Car Reg No. :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(80, 81, 130, 40);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Model    :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(496, 81, 96, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Company     :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(80, 131, 117, 28);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Available :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(496, 131, 96, 28);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(220, 81, 130, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(602, 81, 130, 33);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(220, 132, 130, 33);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(602, 131, 130, 34);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(78, 187, 130, 40);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(238, 187, 130, 40);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancel ");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_2.setBounds(620, 187, 130, 40);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Edit");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_3.setBounds(462, 187, 130, 40);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("Car Registration ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(312, 10, 234, 47);
		panel.add(lblNewLabel_4);
		
		table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		table.setToolTipText("");
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setFont(new Font("Tahoma", Font.BOLD, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Car Reg No.", "Company", "Model", "Available "},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Car Reg No.", "Company", "Model", "Available "
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(10, 268, 866, 285);
		frame_2.getContentPane().add(table);
	}
}
