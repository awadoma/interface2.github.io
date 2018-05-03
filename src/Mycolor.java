import javax.swing.JFrame;

public class Mycolor implements BasicColor {

	public static void main(String[] args) {
		JFrame frm = new JFrame("wellcome");
		frm.setSize(500, 500);
		frm.getContentPane().setBackground(Mycolor.yello);
		frm.setVisible(true);

	}

}
