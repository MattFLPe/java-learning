//Contrato que deverá ser seguido pelos objetos que serão instanciados;
public class Student {

//atributos ou "states" da classe
	String name;
	int age;
	String color;
	String sex;
}

//Método, comportamento ou ação do objeto;
public void Eating(String Food){
	//block of code;
}

public void Drinking(String Drink){
	//block of code
}

public void Running(){
	//block of code
}

//Instanciação de novos objetos a partir da classe Student;

public class School {
	public static void main(String[] args) {
		//síntaxe para instanciar um novo objeto;
		Student student1 = new Student();
		//daí é só pôr o atributo da classe ao lado do nome do objeto instanciado;
		student1.name = "Matt" 
		student1.age = 12
		student1.color = Color.FAIR;
		student1.sex = Sex.MALE;
	}
}