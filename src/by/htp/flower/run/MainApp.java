package by.htp.flower.run;

import by.htp.flower.bean.Bud;
import by.htp.flower.bean.Flower;
import by.htp.flower.bean.Leaf;

//Создать объект класса Цветок, используя классы Лепесток, Бутон.
//Методы: расцвести, завять, вывести на консоль цвет бутона.

public class MainApp {

	public static void main(String[] args) {

		Flower flower = new Flower("Cammomile");
		printFlower("New Flower was born", flower);

		flower.grow();
		printFlower("Flower grown", flower);

		flower.bloom();
		printBloomingFlower(flower);

	}

	private static void printBloomingFlower(Flower flower) {

		System.out.println("The flower is blooming!!!");
		System.out.println("new bud color: " + flower.getBud().getColor());
		printBudLeaves(flower.getBud());

	}

	private static void printBudLeaves(Bud bud){
		
		Leaf[] leaves = bud.getLeaves();
		
		if(bud!=null && leaves != null){
			
			for(Leaf leaf: leaves){
				System.out.println("Leaf color, shape: " + leaf.getColor() 
				+ ", " + leaf.getShape());
			}
		}
		
	}

	private static void printFlower(String message, Flower flower) {

		System.out.println(message);

		System.out.println("Flower: " + flower.getTitle());
		System.out.println("stem height, width " + flower.getStem().getHeight() + ", " + flower.getStem().getWidth());
		System.out.println("bud size, color " + flower.getBud().getSize() + ", " + flower.getBud().getColor());

		System.out.println("=====================================");
	}

}
