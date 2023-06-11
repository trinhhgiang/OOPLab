package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{


public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}
	//	public DigitalVideoDisc(String title) {
//		this.title = title;
//		this.nbDigitalVideoDisc+=1;
//		this.id=nbDigitalVideoDisc;
//		
//	}
//	public DigitalVideoDisc(String title, String category, float cost) {
//		this.title = title;
//		this.category = category;
//		this.cost = cost;
//		this.nbDigitalVideoDisc+=1;
//		this.id=nbDigitalVideoDisc;
//	}
//	public DigitalVideoDisc(String title, String category, String director, float cost) {
//		this.title = title;
//		this.category = category;
//		this.director = director;
//		this.cost = cost;
//		this.nbDigitalVideoDisc+=1;
//		this.id=nbDigitalVideoDisc;
//	}
//	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
//		this.title = title;
//		this.category = category;
//		this.director = director;
//		this.length = length;
//		this.cost = cost;
//		this.nbDigitalVideoDisc+=1;
//		this.id=nbDigitalVideoDisc;
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	public String toString() {
		String res = String.format("%d. DVD - %s - %s - %s - %d : %f $",this.getId(),this.getTitle(),this.getCategory(),this.getDirector(),this.getLength(),this.getCost());
		return res;
	}
}
