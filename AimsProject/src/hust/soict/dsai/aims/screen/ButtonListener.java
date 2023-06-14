package hust.soict.dsai.aims.screen;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;

public class ButtonListener implements ActionListener{
	private Cart cart;
	private Store store;
	private Media media;
	public ButtonListener(Cart cart, Media media) {
		this.cart=cart;
		this.media=media;
	}
	
	public ButtonListener(Cart cart) {
		this.cart=cart;
	}
	@Override
    public void actionPerformed(ActionEvent e) {
		this.cart=cart;
		String button = e.getActionCommand();
		if (button.equals("Add to cart")) {
			cart.addMedia(media);
			JDialog addCart = new JDialog();
			addCart.setLayout(new FlowLayout());
			addCart.add(new JLabel("Add to cart successfully"));
			addCart.setTitle("Add  to cart");
			addCart.setSize(500,100);
			addCart.setVisible(true);
			addCart.setLocationRelativeTo(null);
			
		}
		else if (button.equals("Play")) {
//			Playable m = (Playable) media;
//			m.play();
			Disc m = (Disc) media;
		
			JDialog play = new JDialog();
			play.setLayout(new FlowLayout());
//			Media
			JLabel title = new JLabel("Playing "+ m.getTitle()+", length is "+m.getLength());
			play.add(title);
			play.setLocationRelativeTo(null);
			
			play.setTitle("Play");
			play.setSize(500,100);
			play.setVisible(true);
			
		}
	}
}
