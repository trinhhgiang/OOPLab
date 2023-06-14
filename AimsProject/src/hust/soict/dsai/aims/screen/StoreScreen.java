package hust.soict.dsai.aims.screen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;

public class StoreScreen extends JFrame{
	private Store store;
	private Cart cart;
	
	JPanel createNorth() {
		JPanel north =new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		
		JMenu smUpdateStore = new JMenu("Update Store");
		smUpdateStore.add(new JMenuItem("Add Book"));
		smUpdateStore.add(new JMenuItem("Add CD"));
		smUpdateStore.add(new JMenuItem("Add DVD"));
		
		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View store"));
		menu.add(new JMenuItem("View cart"));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		return menuBar;
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(),Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		JButton cart = new JButton("View cart");
		cart.setPreferredSize(new Dimension(100,50));
		cart.setMaximumSize(new Dimension(100,50));
		cart.addActionListener(new ButtonListener(this.cart));
		
		header.add(Box.createRigidArea(new Dimension(10,10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(cart);
		header.add(Box.createRigidArea(new Dimension(10,10)));
		
		return header;
	}
	
	JPanel createCenter() {
		
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3,3,2,2));
		
		ArrayList<Media> mediaInStore = store.getItemsInStore();
		for (int i=0; i<5;i++) {
			MediaStore cell = new MediaStore(mediaInStore.get(i),cart);
			center.add(cell);
		}
		
		return center;
	}
	
	
	public StoreScreen(Store store) {
		this.store = store;
		this.cart = new Cart();
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(),BorderLayout.NORTH);
		cp.add(createCenter(),BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Store");
		setSize(1024,768);
	}
	
	
	public static void main(String[] args) {
		Store store1 = new Store();
		DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
//		cart.addMedia(dvd1);
		
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
//		cart.addMedia(dvd2);
		
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin", "Animation","GiangHoang",90, 18.99f);
//		cart.addMedia(dvd3);
		
		CompactDisc cd1 = new CompactDisc("99%", "Music", "MCK", "MCK", 65, 3.5f);
		Book book1 = new Book("Harry Potter", "Magic", 29.99f);
//		
		store1.addMedia(dvd3);
		store1.addMedia(dvd1);
		store1.addMedia(dvd2);
		store1.addMedia(book1);
		store1.addMedia(cd1);
		new StoreScreen(store1);
	}
}
