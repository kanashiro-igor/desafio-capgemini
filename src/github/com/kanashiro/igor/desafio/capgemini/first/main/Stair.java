package github.com.kanashiro.igor.desafio.capgemini.first.main;

public class Stair {
	
	private String stars;

	/**
	 * This method builds the stair
	 * 
	 * @param number
	 */
	public void makeStair(int number) {
		
		if (number > 0) {
			
			stars = "";
			
			for(int i = number; i > 0; i--) {
				
				stars = String.format("%" + number + "s", getStars().concat("*"));
				System.out.println(getStars());				
				stars = getStars().trim();
			}
			
		} else {
			System.out.println("Number needs to be greater than 0!");
		}
	}

	/**
	 * @return the stars
	 */
	public String getStars() {
		return stars;
	}
}
