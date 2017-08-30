import javax.swing.JFrame;

public class ClientInit {
	public static void main(String[] args) {
		Client base;
		base = new Client(ipAddress);
		base.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		base.startRunning();
	}
}
