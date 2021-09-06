
import java.util.*;

/**
 * This class contem list of the item and clue
 * @author Patricia Ramos
 *
 */
public class CreateItem {
	
	public ArrayList<Item> getListItem() {
		ArrayList<Item> listItem = new ArrayList<Item>();	
		listItem.add(new Item("orange","fruit", "orange","citric"));
		listItem.add(new Item("key","small", "used to open the door", "easy to lost"));
		listItem.add(new Item("mouse","eletronic", "name of the animal", "used with computer"));
		listItem.add(new Item("pen","used to write", "contain ink", "thin"));
		listItem.add(new Item("apple","fruit", "red", "name of a company"));
		listItem.add(new Item("dog","animal", "has fur", "bark"));
		listItem.add(new Item("banana","fruit", "yellow", "the monkey likes"));
		listItem.add(new Item("pineapple","has a crown but not a king", "yellow", "Sponge Bob house"));
		listItem.add(new Item("watch","It goes around a lot and it doesn't move", "keep time", "it has every size"));
		listItem.add(new Item("computer","an electronic device for storing and processing data", "typically in binary form", "according to instructions given to it in a variable program"));
		listItem.add(new Item("television","normaly has in house", "is a machine with a screen", "receive broadcasting signals and change them into pictures and sound"));
		listItem.add(new Item("car","vehicle", "is able to carry a small number of people.","has doors"));
		listItem.add(new Item("house","a building for human habitation", "especially one that is lived in by a family or small group of people.","provide space for; accommodate."));
		listItem.add(new Item("cat","a small animal", "four legs", "usually kept as a pet or for catching mice"));
		listItem.add(new Item("joystick","a device that can be moved forwards", "backwards", "sideways to control a machine or computer game"));
		return listItem;
	}

}
