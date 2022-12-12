import java.util.List;
import java.util.ArrayList;



enum CellState {X, O};

public class CheckerState extends BoardState {

	
	final int boardSize;
	private final CellState boardState[][];
	
	
	CheckerState(int boardSize) 
	{			
		boardSize = Math.max(boardSize, 3);
		this.boardSize = boardSize;

		boardState = new CellState[boardSize][boardSize];
	}
	
	CheckerState(CheckerState state)
	{
		this.boardSize = state.boardSize;
		
		boardState = new CellState[boardSize][boardSize];
		
		for (int y=0; y<boardSize; y++) {			
			for (int x=0; x<boardSize; x++) {
				this.boardState[y][x] = state.boardState[y][x];
			}
		}		
	}
	@Override
	public boolean wins(Player player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean loses(Player player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTie() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Double getUtility(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardState> getChildList(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardState clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

}
