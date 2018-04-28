import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Main extends JFrame {

	private JPanel contentPane;
	private DBConnect connect = new DBConnect();
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		DBConnect connect = new DBConnect();
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new MyPanel2(connect);
		add(contentPane);

	}

}
