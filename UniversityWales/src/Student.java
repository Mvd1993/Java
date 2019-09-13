import java.sql.Date;
//import java.util.Hashtable;
import java.util.Hashtable;

public class Student extends Person{
	String id;
	String username;
	String password;
	Apartment apartment;
	Hashtable<Subject, Integer> subjectQualification = new Hashtable<Subject, Integer>();
	
	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public Student(String name, Pet pet, Apartment apartment) {
		super(name);
		this.setPets(pet);
		this.apartment=apartment;
		
		// TODO Auto-generated constructor stub
	}
	public Student(String name, Pet pet, Apartment apartment, Hashtable subjectQualification) {
		super(name);
		this.setPets(pet);
		this.apartment=apartment;
		this.subjectQualification = subjectQualification;
		// TODO Auto-generated constructor stub
	}

	
	/*Mètodes classe Estudiant:

Calcular la seva nota d’entrada a la universitat (mínim cinc assignatures més examen d’entrada a la universitat):
Crear un ArrayList d’assignatures amb les notes finals per assignatura.
També una nota d’examen d’entrada.
Nota de tall (es supera o no).
Ponderar les notes d’assignatures (40%) amb la d’examen d’entrada (60%).
Que es pugui treballar el ArrayList.

Mètode static.
*/
//--------METODES----------------//
	// chek if the student is adult
	
	
	public void birthday(Date date) {
		if(date==birthday) {
			age++;
		}
	}
	
	//create a username and password
	
	public String createUserName() {
		return this.name+this.lastName;
	}
	
	public String createPassword() {
		return id;
	}

	//getters and setters---
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	public Apartment getApartment() {
		return apartment;
	}
	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", password=" + password + ", apartment=" + apartment
				+ ", name=" + name + ", lastName=" + lastName + ", age=" + age + ", height=" + height + ", wheight="
				+ wheight + ", birthday=" + birthday + ", pets=" + pets + ", cards=" + cards + "]";
	}
	
	
}
