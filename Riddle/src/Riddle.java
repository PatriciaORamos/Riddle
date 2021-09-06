
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**

 * @author Patricia Ramos
 *
 */
public class Riddle {

	private static int total;

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		Random random = new Random();
		boolean isPlaying = true;
		

		// crate a classe e access list of item
		CreateItem create = new CreateItem();
		ArrayList<Item> listItem = new ArrayList<>();
		
		listItem = create.getListItem();

		System.out.println("* Welcome to Riddle *");
		while (isPlaying) {
			int sizeList = listItem.size();
			
			// generate index randomly
			int index = random.nextInt(sizeList);

			play(key, index, listItem);

			// after item to be used, this item is removed of the list and size of the list
			// is increased
			listItem.remove(index);
			sizeList = sizeList - 1;

			// if size of the list equal zero, than finish item.
			if (sizeList == 0) {
				isPlaying = false;
			}
			System.out.println("Total is: " + total);
		}

	
	}

	/**
	 * method give clue, get answer, calc total
	 * 
	 * @param Scanner         key
	 * @param int             index
	 * @param int             sizeList
	 * @param ArrayList<Item> listItem
	 */
	private static void play(Scanner key, int index,  ArrayList<Item> listItem) {
		// storage name of the item
		String item = listItem.get(index).getName();

		// pass for clue of the item
		for (int i = 0; i < 3; i++) {
			System.out.println("\nclue: " + listItem.get(index).getListClue().get(i));
			System.out.println("Enter your guess, please!");
			String answer = key.next();
			// if answer correct system will pontuation user.
			if (answer.equalsIgnoreCase(item)) {
				// give 3 points if user is right with first clue, 2 points if second clue and 1
				// pont if third clue
				if (i == 0) {
					total = total + 3;
				} else if (i == 1) {
					total = total + 2;
				} else {
					total = total + 1;
				}
				System.out.println("*** Correct answer, you win! ***");
				return;
			}
		}
		// if user does not know after 3 clue, system display name of the item and user
		// do not receive point
		System.out.println("--> Item is: " + item);
	}

}
