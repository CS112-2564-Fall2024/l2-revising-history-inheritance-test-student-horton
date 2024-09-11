/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author ???
 * @version ???
 */

public class Main {
	public static void main(String[] args) {

		String description = "Super Mario Brothers";
		String citation = "";

		HistoricalEvent[] array = {
			new HistoricalEvent(description + " AU", new Date(7, 1, 1987)),
			new RevisedEvent(description + " JP", new Date(9, 13, 1985),
					"Family Computer (Famcom)", citation),
			new RevisedEvent(description, new Date(11, 1, 1985),
					"Nintendo Entertainment System" + " US", citation),
			new HistoricalEvent(description, new Date(5, 15, 1987))	
		};			
		
		//Bubble Sort
		//https://en.wikipedia.org/wiki/Bubble_sort
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i].compareTo(array[i+1]) > 0) {
					HistoricalEvent temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			array[i].teach();
		}
	}
}