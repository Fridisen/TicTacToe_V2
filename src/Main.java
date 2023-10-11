import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        do {
            Board board = new Board();
            Players p1 = new Players("Långben", 'X');
            Players p2 = new Players("Musse", 'O');

            board.printBoard();
            boolean continuePlaying = true;


            do {
                boolean placementValid = false;

                //Player 1

                System.out.println(p1.getName() + " place your marker (1-9)");
                int input = scanner.nextInt();
                placementValid = board.placeMarker(input, p1.getMarker());
                board.printBoard();
                scanner.nextLine();

                while (!placementValid) {
                    System.out.println(p1.getName() + " That space is occupied, please replace your marker");
                    int input2 = scanner.nextInt();
                    placementValid = board.placeMarker(input2, p1.getMarker());
                    board.printBoard();
                    scanner.nextLine();
                }
                //Check win for player1
                if (board.checkWinner(p1.getMarker())) {
                    System.out.println(p1.getName() + " Congratualtions, you win!");
                    continuePlaying = !askPlayAgain(scanner);
                    }

                    if (board.gameOver()) {
                        System.out.println("It´s a draw");
                        continuePlaying = !askPlayAgain(scanner);
                }

                //Player 2

                System.out.println(p2.getName() + " place your marker (1-9)");
                int input3 = scanner.nextInt();
                placementValid = board.placeMarker(input3, p2.getMarker());
                board.printBoard();
                scanner.nextLine();

                while (!placementValid) {
                    System.out.println(p2.getName() + "That space is occupied, please replace your marker");
                    int input4 = scanner.nextInt();
                    placementValid = board.placeMarker(input4, p2.getMarker());
                    board.printBoard();
                    scanner.nextLine();
                }

                //Check win for player2

                    if (board.checkWinner(p2.getMarker())) {
                        System.out.println(p2.getName() + " Congratualtions, you win!");
                        continuePlaying = !askPlayAgain(scanner);
                    }

                if (board.gameOver()) {
                    System.out.println("It´s a draw");
                    continuePlaying = !askPlayAgain(scanner);
                }

            } while (continuePlaying);

        } while (playAgain);


    }
    public static boolean askPlayAgain(Scanner scanner) {
        System.out.println("Wanna play again? (y/n)");
        String response = scanner.next();
        if (response.equalsIgnoreCase("n")) {
            scanner.close();
        }
       return response.equalsIgnoreCase("y");
    }


}






        /*
        -två mänskliga spelare i terminalen/kommandotolken.
        - Varje spelare turas om att ange var i ett 3x3-rutnät spelaren önskar placera X (eller O).
        - När en spelare har tre X (eller O) i rad horisontellt, vertikalt eller diagonalt meddelar spelet vem som vann.
        - Har ingen spelare tre i rad när inga tomma rutor längre kvarstår slutar spelet oavgjort.
        - Efter att ett spel är klart börjar spelet om med ett nytt tomt rutnät.


          För **godkänt** ska spelet minst uppfylla följande krav:

* Spelet ska vara spelbart mellan två människor som turas om att ge indata till terminalen/kommandotolken där spelet visas med text-baserad grafik.
* Spelet ska kontrollera och meddela vilken spelare som vunnit eller om spelet slutat oavgjort
* Spelet ska vid varje drag kontrollera att indata motsvarar en tom ruta i rutnätet
* När en spelare vunnit börjar spelet om från början.
* Din kod skall vara skriven på engelska: variabelnamn, klassnamn metodnamn och även kommentarer
* Spelat skall vara skrivet Objektorienterat, så det skall innehålla olika klasser.
* Projektet finns upplagt på GitHub.

Dessutom ska koden vara strukturerad och du ska visa på att du förstår och kan använda dig av:
- variabler
- strängar
- tal
- villkorssatser
- repetitionssatser
- funktioner

Onödig kodupprepning ska i största mån undvikas.
         */