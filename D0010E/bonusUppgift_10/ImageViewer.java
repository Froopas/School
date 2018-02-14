package bonusUppgift_10;

import java.awt.event.*;
import java.net.URL;

import javax.imageio.*;
import javax.swing.*;


public class ImageViewer extends JFrame {
	private JButton button;
	private JLabel label;
	private JPanel panel;

	public ImageViewer() {
		super("ImageViewer");
		try {
			panel = new JPanel();
			button = new JButton("Change");
			URL url=new URL("http://www.sm.luth.se/csee/courses/d0010e/l/prob/10tj5Ei9o/LTU-Teatern.jpg");
			Icon image = new ImageIcon(ImageIO.read(url));
			url=new URL("http://www.sm.luth.se/csee/courses/d0010e/l/prob/10tj5Ei9o/LTU-Vetenskapens-hus.jpg");
			Icon image2=new ImageIcon(ImageIO.read(url));
			label=new JLabel(image);

			button.addActionListener(new ActionListener() {
				boolean boolimage;

				public void actionPerformed(ActionEvent arg0) {
					boolimage = !boolimage;
					if(!boolimage) {
						label.setIcon(image);
					}else {
						label.setIcon(image2);
					}
				}
			});
			panel.add(label);
			panel.add(button);
			this.add(panel);
			this.pack();
			this.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ImageViewer hej=new ImageViewer();

	}

}
