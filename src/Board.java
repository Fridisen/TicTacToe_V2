
public class Board {

    boolean winner = false;


    private static char[][] board = {{' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}};


    void printBoard() {
        System.out.println("[" + board[0][0] + "][" + board[0][1] + "][" + board[0][2] + "]");
        System.out.println("[" + board[1][0] + "][" + board[1][1] + "][" + board[1][2] + "]");
        System.out.println("[" + board[2][0] + "][" + board[2][1] + "][" + board[2][2] + "]");
    }

    boolean placeMarker(int placement, char marker) {
        if (placement == 1) {
            if (board[0][0] == ' ') {
                board[0][0] = marker;
            } else return false;

        } else if (placement == 2) {
            if (board[0][1] == ' ') {
                board[0][1] = marker;
            } else return false;

        } else if (placement == 3) {
            if (board[0][2] == ' ') {
                board[0][2] = marker;
            } else return false;

        } else if (placement == 4) {
            if (board[1][0] == ' ') {
                board[1][0] = marker;
            } else return false;

        } else if (placement == 5) {
            if (board[1][1] == ' ') {
                board[1][1] = marker;
            } else return false;

        } else if (placement == 6) {
            if (board[1][2] == ' ') {
                board[1][2] = marker;
            } else return false;

        } else if (placement == 7) {
            if (board[2][0] == ' ') {
                board[2][0] = marker;
            } else return false;

        } else if (placement == 8) {
            if (board[2][1] == ' ') {
                board[2][1] = marker;
            } else return false;

        } else if (placement == 9) {
            if (board[2][2] == ' ') {
                board[2][2] = marker;
            } else return false;
        }
        return true;
    }

    public boolean checkWinner(char marker) {
        //  horisontella
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == marker && board[row][1] == marker && board[row][2] == marker) {
                winner = true;
                System.out.println("We have a winner");
                return true;
            }
        } // vertikala
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == marker && board[1][col] == marker && board[2][col] == marker) {
                winner = true;
                System.out.println("We have a winner");
                return true;
            }
        } //diagonala
        if (board[0][0] == marker && board[1][1] == marker && board[2][2] == marker) {
            winner = true;
            System.out.println("We have a winner");
            return true;
        }
        if (board[0][2] == marker && board[1][1] == marker && board[2][0] == marker) {
            winner = true;
            System.out.println("We have a winner");
            return true;
        } else return false;
    }


    public boolean gameOver() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        System.out.println("GameOver nobody won this round");
        return true;
    }

    public void resetBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }
        winner = false;

    }
}





