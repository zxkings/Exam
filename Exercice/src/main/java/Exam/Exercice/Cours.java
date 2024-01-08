package Exam.Exercice;

public class Cours {
	
	private int id;
	private String name;
	
	public Cours(int id, String name) {
		this.setId(id);
		this.setName(name);
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
}
