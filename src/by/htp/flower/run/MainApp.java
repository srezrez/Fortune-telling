package by.htp.flower.run;
import by.htp.flower.bean.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
/*—оздать объект класса ÷веток, использу€ классы Ћепесток, Ѕутон.
ћетоды: расцвести, зав€ть, вывести на консоль цвет бутона.*/

public class MainApp {

	public static void main(String[] args) {
		Flower flower  = new Flower("Camomile");
		
		System.out.println(" ");
		printFlower("New Flower", flower);
		flower.grow();
		printFlower("Flower grown", flower);
		flower.bloom();
		printBloomingFlower(flower);
//		flower.wither();
//		witherFlower(flower);
		System.out.println("Input category: 1- love; 2- luck; 3- money.");
		Scanner in = new Scanner(System.in);
		int category = 0;
		category = in.nextInt();
		Map<String, String[]> map = new HashMap<String, String[]>();
		String love[] = new String[] {"Love", "Doesn't love"};
		String luck[] = new String[] {"You will be lucky", "You won't be lucky"};
		String money[] = new String[] {"You'll be rich", "You'll be poor"};
		map.put("Love ", love);
		map.put("Luck ", luck);
		map.put("Money ", money);
		String s1 = null, s2=null;
		int i=0;
		Iterator<Map.Entry<String, String[]>> it = map.entrySet().iterator();
		    while (it.hasNext()) {
		    	i++;
		        Map.Entry<String, String[]> it2 = it.next();
		        if(i==category) {
		        	s1 = it2.getValue()[0];
		        	s2 = it2.getValue()[1];
		        }
		    }
		System.out.println("Input your choice: 1-yes, 0- no");
		int choice = in.nextInt();
		flower.fortune(choice, s1, s2);

	}
	
	private static void printBloomingFlower(Flower flower){
		System.out.println("The flower is blooming! ");
		System.out.println("new bud color: " + flower.getBud().getColor());
		printBudLeaves(flower.getBud());
	}
	
	private static void printBudLeaves(Bud bud){
		Leaf[] leaves = bud.getLeaves();
		if(bud!=null && leaves!=null){
			for(Leaf leaf: leaves){
				System.out.println("Leaf color, shape " + leaf.getColor() +" "+ leaf.getShape());
			}
		}
		else System.out.println("There is no leaves!");
			
	}
	private static void witherFlower(Flower flower){
		System.out.println("The flower has withered! ");
		System.out.println("new bud color: " + flower.getBud().getColor());
		printBudLeaves(flower.getBud());
	}
	
	private static void printFlower(String message, Flower flower){
		
		System.out.println(message);
		
		System.out.println("Flower: " + flower.getTitle());
		System.out.println("stem height, width: " + flower.getStem().getHeight() + ", " + flower.getStem().getWidth());
		System.out.println("bus size, color: " + flower.getBud().getSize() + ", " + flower.getBud().getColor());
		
		System.out.println("======================================");
	}

}
