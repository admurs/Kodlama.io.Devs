package kodlama.io.Devs.entities.concrete;

public class Language {

	int id;
	String name;
	public Language(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Language() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
