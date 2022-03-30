package org.isal.htmlemmet.handlers;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;

public class Frame extends AbstractHandler{

	private JFrame frmTodo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frmTodo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		return null;
	}
	/**
	 * Create the application.
	 */
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTodo = new JFrame();
		frmTodo.setTitle("ToDo");
		frmTodo.setBounds(100, 100, 450, 300);
		frmTodo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTodo.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Your Todo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(178, 10, 87, 38);
		frmTodo.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(107, 58, 96, 19);
		frmTodo.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(106, 94, 96, 19);
		frmTodo.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(106, 132, 96, 19);
		frmTodo.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("Todo 1");
		lblNewLabel_1.setBounds(32, 62, 45, 13);
		frmTodo.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Todo 2");
		lblNewLabel_1_1.setBounds(32, 97, 45, 13);
		frmTodo.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Todo 3");
		lblNewLabel_1_1_1.setBounds(32, 135, 45, 13);
		frmTodo.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTodo.dispose();
			}
		});
		btnNewButton.setBounds(118, 185, 85, 21);
		frmTodo.getContentPane().add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnClear.setBounds(32, 185, 85, 21);
		frmTodo.getContentPane().add(btnClear);
	}
}
