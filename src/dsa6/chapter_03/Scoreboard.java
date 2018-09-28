package dsa6.chapter_03;

public class Scoreboard {

    private int numEntries = 0;
    private GameEntry[] board;

    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }

    public void add(GameEntry e) {
        int newScore = e.getScore();
        // is the new entry (e) a high score?
        if(numEntries < board.length || newScore > board[numEntries-1].getScore()) {
            if(numEntries < board.length) { // no score drops from the board
                numEntries++; // overall number increases
            }
            // shift any lower scores rightward to make room for the new entry
            int j = numEntries - 1;
            while(j > 0 && board[j-1].getScore() < newScore) {
                board[j] = board[j-1]; // shift entry from j-1 to j
                j--;
            }
            board[j] = e; // add new entry
        }
    }

    public GameEntry remove(int i) {
        if(i < 0 || i >= numEntries) {
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        }
        GameEntry temp = board[i]; // save the object to be removed
        for(int j = i; j < numEntries - 1; j++) {
            board[j] = board[j+1]; // move one cell to left
        }
        board[numEntries-1] = null; // null out old last score
        numEntries--;
        return temp;
    }
}
