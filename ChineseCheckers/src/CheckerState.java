import java.util.List;
import java.util.ArrayList;



enum CellState {X, O, N, W};

public class CheckerState extends BoardState {

	
	final int boardSize;
	private final CellState boardState[][];
	
	
	CheckerState(int boardSize) 
	{			
		this.boardSize = Math.max(boardSize, 3);
	

		this.boardState = new CellState[boardSize][boardSize];
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
	public BoardState clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new CheckerState(this);
		
	}

	@Override
    boolean set(int x, int y, Player player)
    {
    	if (x>=0 && x<boardSize && y>=0 && y<boardSize && boardState[y][x] == null) {
    		boardState[y][x] = (player == Player.One ? CellState.X : CellState.O);
    				
    		return true;
    	}
    	else
    		return false;
    }

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (int y=0; y<boardSize; y++) {
			for (int x=0; x<boardSize; x++) {
				if (boardState[y][x] == null)
					sb.append(".");
				else {
					if (boardState[y][x] == CellState.W)
						sb.append("=");
					else
						sb.append(boardState[y][x].toString());
				}
			}
			sb.append('\n');
		}	
		
		return sb.toString();
	}

	public BoardState move(BoardState boardStateN,int currentStoneIndex, int moveIndex, Player player)
	{//Recursive olacak
		BoardState boardState_= boardStateN;

		

		return boardState_;
	}

	@Override
	public List<BoardState> getChildList(Player player , int currentStoneIndex)
	{
		List<BoardState> children = new ArrayList<BoardState>();

		CellState playerState = (player == Player.One ? CellState.X : CellState.O);

		if(playerState == CellState.O)//AI
		{
			if(boardState[(currentStoneIndex/boardSize)][(currentStoneIndex % boardSize)-1] == null)
			{//left move

			}
			
			else if(boardState[(currentStoneIndex/boardSize)-1][(currentStoneIndex % boardSize)] == null)
			{//up move

			}
		}

		return children;
	}

}
