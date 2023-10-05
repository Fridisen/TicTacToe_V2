import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        Scanner scanner = new Scanner(System.in);


        Board b = new Board();
        b.printBoard();

        ArrayList<Players> players = new ArrayList<>();

        Players p1 = new Players("Långben", 'X');
        Players p2 = new Players("Musse", 'O');


        do {
            boolean placementValid = false;
            while (placementValid == false) {
                System.out.println(p1.getName() + " place your marker (1-9)");
                int input3 = scanner.nextInt();
                placementValid = b.placeMarker(input3, p1.getMarker());
                b.printBoard();
                scanner.nextLine();
            }

            /*if (b.check4Winner(p1.getMarker())){
                System.out.println( p1.getName() + "Wins");
                System.out.println("do you wanna play again? (j/n)");
            } */

            System.out.println(p2.getName() + " place your marker (1-9)");
            int input2 = scanner.nextInt();
            b.placeMarker(input2, p2.getMarker());
            b.printBoard();
            scanner.nextLine();

        } while (!b.winner);


    }
}

