
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
            } else { System.out.println("The placement is occupied, please choose another placement");
            return false;}

        } else if (placement == 2) {
            if (board[0][1] == ' ') {
                board[0][1] = marker;
            } else System.out.println("The placement is occupied, please choose another placement");

        } else if (placement == 3) {
            if (board[0][2] == ' ') {
                board[0][2] = marker;
            }else System.out.println("The placement is occupied, please choose another placement");

        } else if (placement == 4) {
            if (board[1][0] == ' ') {
                board[1][0] = marker;
            }else System.out.println("The placement is occupied, please choose another placement");

        } else if (placement == 5) {
            if (board[1][1] == ' ') {
                board[1][1] = marker;
            }else System.out.println("The placement is occupied, please choose another placement");

        } else if (placement == 6) {
            if (board[1][2] == ' ') {
                board[1][2] = marker;
            }else System.out.println("The placement is occupied, please choose another placement");

        } else if (placement == 7) {
            if (board[2][0] == ' ') {
                board[2][0] = marker;
            }else System.out.println("The placement is occupied, please choose another placement");

        } else if (placement == 8) {
            if (board[2][1] == ' ') {
                board[2][1] = marker;
            }else System.out.println("The placement is occupied, please choose another placement");

        } else if (placement == 9) {
            if (board[1][1] == ' ') {
                board[2][2] = marker;
            }else System.out.println("The placement is occupied, please choose another placement");
        }
        return true;
    }



    public boolean checkWinner(char marker) {
        return false;
    }






}












/*    void placeMarker(int placement, int currentPlayer) { //char marker
        if (placement == 1) {
            if (board[0][0] == ' ') {
                if (currentPlayer == 1) {
                    board[0][0] = 'X';
                } else {
                    board[0][0] = 'O';
                }
                switchPlayer();
            }
        }
    }

 */

