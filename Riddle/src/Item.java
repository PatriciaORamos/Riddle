
import java.util.ArrayList;
import java.util.List;

/**
 * @author Patricia Ramos
 *
 */
public class Item {

	private String name;
	private String clue1;
	private String clue2;
	private String clue3;

	List<String> listClue = new ArrayList<>();

	public Item(String name, String clue1, String clue2, String clue3) {
		super();
		this.name = name;
		listClue.add(clue1);
		listClue.add(clue2);
		listClue.add(clue3);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getListClue() {
		return listClue;
	}

	public void setListClue(List<String> listClue) {
		this.listClue = listClue;
	}

	public String getClue1() {
		return clue1;
	}

	public void setClue1(String clue1) {
		this.clue1 = clue1;
	}

	public String getClue2() {
		return clue2;
	}

	public void setClue2(String clue2) {
		this.clue2 = clue2;
	}

	public String getClue3() {
		return clue3;
	}

	public void setClue3(String clue3) {
		this.clue3 = clue3;

	}
}
