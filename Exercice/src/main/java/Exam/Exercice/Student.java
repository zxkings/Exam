package Exam.Exercice;

public class Student {
	private int id;
	private String name;
	private Cours cour;
	
	public Student(int id, String name,Cours cour) {
		this.setId(id);
		this.setName(name);
		this.setCour(cour);
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

	Cours getCour() {
		return cour;
	}

	void setCour(Cours cour) {
		this.cour = cour;
	}
	
	
}
