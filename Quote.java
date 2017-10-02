
public class Quote {

	private String author;
	private String text;
	private String category;
	private boolean save;
	
	public Quote(){
		this.author = null;
		this.text = null;
		this.category = null;
		this.save = false;
	}
	public Quote(String text, String author, String category){
		this.author = author;
		this.text = text;
		this.category = category;
		this.save = false;
	}
}
