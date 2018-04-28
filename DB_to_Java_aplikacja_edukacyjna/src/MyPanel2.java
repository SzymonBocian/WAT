import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class MyPanel2 extends JPanel implements ActionListener {

	private JTextArea textArea ;
	private JButton btnDodaj;
	private JTextField textField;
	DBConnect connect;

	
	public MyPanel2(DBConnect c) {

		connect = c;
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setRows(13);


		btnDodaj  = new JButton("Dodaj");
		btnDodaj.addActionListener(this);
		
		
		textField = new JTextField();
		textField.setColumns(10);
		setPreferredSize(new Dimension(391, 332));
		setLayout(new BorderLayout(0, 0));
		
		add(textField, BorderLayout.NORTH);
		add(textArea, BorderLayout.SOUTH);
		add(btnDodaj);
		connect.getData(textArea);
	}
	
	
	
	
	
	
	
	
	public void actionPerformed(ActionEvent e) {
	Object source = e.getSource();

	if(source==btnDodaj) {
		
		connect.setData(textField);
		connect.getData(textArea);
		textField.setText("");
		
	}
		
		
	}
	
}

