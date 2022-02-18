package github.com.kanashiro.igor.desafio.capgemini.first.main;

public class Stair {
	
	public void makeStair(int number) {
		
		if (number > 0) {
			
			String stars = "";
			
			for(int i = number; i > 0; i--) {
				
				stars = String.format("%" + number + "s", stars.concat("*"));
				System.out.println(stars);				
				stars = stars.trim();
			}
			
		} else {
			System.out.println("Numero precisa ser maior do que zero!");
		}
	}
}
