import java.sql.Date;
import java.util.ArrayList;

public class Pet {
	String name;
	int age;
	String type;
	Date birth;
	ArrayList<Vaccine> Vaccines;
	Double height;
	Double wheight;
	
	public Pet(String name) {
		this.name = name;
		height = 0.0;
	}
	
	public Pet(String name, Date birth, Double height, Double wheight ) {
		name=this.name;
		birth = this.birth;
		height=this.height;
		wheight = this.wheight;
		//age = diference between birthday and today;
		
	}
	/*Mètodes classe Mascota:
		Tipus de mascota (gos, gat, etc) per calcular les despeses.
		Aniversari.
		Crear un arrayList de vacunes, amb dates i resultat de la vacunació i tipus de vacunes.	
		Mètode static.
*/
	public boolean isAdult() {
		if (this.age < 3) {
			return false;
		}
		return true;
	}
	
	//calculate the body mass index
	public double bodyMassIndex() {
		double heightDivideHundred = this.height/100;
		return wheight/(heightDivideHundred * heightDivideHundred);
	}
		
	public void showBodyMassIndex() {
		System.out.println(bodyMassIndex());
	}


//--------GETTERS AND SETTERS---------------------
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Date getBirth() {
	return birth;
}
public void setBirth(Date birth) {
	this.birth = birth;
}
public ArrayList<Vaccine> getVaccines() {
	return Vaccines;
}
public void setVaccines(ArrayList<Vaccine> vaccines) {
	Vaccines = vaccines;
}
public Double getHeight() {
	return height;
}
public void setHeight(Double height) {
	this.height = height;
}
public Double getWheight() {
	return wheight;
}
public void setWheight(Double wheight) {
	this.wheight = wheight;
}

//----TOSTRING----
@Override
public String toString() {
	return "Pet [name=" + name + ", age=" + age + ", type=" + type + ", birth=" + birth + ", Vaccines=" + Vaccines
			+ ", height=" + height + ", wheight=" + wheight + "]";
}


}