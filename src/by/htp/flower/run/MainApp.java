package by.htp.flower.run;

import by.htp.flower.bean.Flower;

//Создать объект класса Цветок, используя классы Лепесток, Бутон.
//Методы: расцвести, завять, вывести на консоль цвет бутона.

public class MainApp {

	public static void main(String[] args) {
		
		Flower flower = new Flower("Rose");
		printFlower(flower);
	
	}
	
	private static void printFlower(Flower flower){
		System.out.println("Flower: " + flower.getTitle());
		System.out.println("stem height, width " + flower.getStem());
		System.out.println("bud size, color " + flower.getBud());
	}

}
