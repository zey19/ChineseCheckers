public class CheckerBoard {
	
	public static void main(String args[]) {
		int boardSize = 6;
		
		CheckerState board = new CheckerState(boardSize);
		
		for (int y=0; y<boardSize; y++) {
			for (int x=0; x<boardSize; x++) {
				if((y==0|| y==1 || y==2) && (x==0 || x==1 || x==2))
				{
					System.out.print("x ");
				}
				else if ((y==boardSize-1|| y==boardSize-2 || y==boardSize-3) && (x==boardSize-1 || x==boardSize-2 || x==boardSize-3))
				{
					System.out.print("o ");
				}
				else {
					System.out.print((y * boardSize + x) + " ");
				}
				
			}
			System.out.println();
		}
		System.out.println();

	}
}
