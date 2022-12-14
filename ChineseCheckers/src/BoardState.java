import java.util.List;

enum Player {One, Two};

public abstract class BoardState implements Cloneable {
		
	abstract public boolean wins(Player player);

	abstract public boolean loses(Player player);
	
	abstract public boolean isTie();
	
	abstract public Double getUtility(Player player);
	
	abstract public List<BoardState> getChildList(Player player,int currentStoneIndex);
		
	abstract public BoardState clone() throws CloneNotSupportedException;

	abstract boolean set(int x, int y, Player player);
}

