import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Array per memorizzare i nomi
        String[] nomi = new String[10];
        int contaNome = 0;

        Scanner in = new Scanner(System.in);
        String names1 = "casa";

        // Array per memorizzare le ripetizioni dei nomi
        int[] ripetizione = new int[10];

        // Array per memorizzare l'indice del nome più lungo
        int nomePiuLungo = -1;

        // Array per memorizzare l'indice del nome più corto
        int nomePiuCorto = -1;

        // Menu per scegliere l'azione da eseguire
        int scelta;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Aggiunta di un nome");
            System.out.println("2 - Cancellazione del singolo nome");
            System.out.println("3 - Ricerca sequenziale di un nome");
            System.out.println("4 - Visualizza nomi ripetuti con numero ripetizioni");
            System.out.println("5 - Modifica di un nome");
            System.out.println("6 - Visualizzazione di tutti i nomi presenti");
            System.out.println("7 - Ricerca del nome più lungo e più corto");
            System.out.println("8 - Cancellazione di tutte le occorrenze di un nome");
            System.out.println("0 - Uscita");
            System.out.print("Inserisci la tua scelta: ");
            scelta = in.nextInt();
            in.nextLine();
            switch (scelta) {
                case 1:
                    aggiungiNome(nomi, ripetizione, contaNome);
                    break;
                case 2:
                    cancellaNome(nomi, ripetizione, contaNome);
                    break;
                case 3:
                    ricercaSequenziale(nomi, names1);
            }

        } while (scelta != 0);
    }

    private static void cancellaNome(String[] nomi, int[] ripetizioni, int nameCount) {


    }


    private static void aggiungiNome(String[] nomi, int[] ripetizioni, int nameCount) {
    }


    private static boolean ricercaSequenziale(String[] nomi, String nomi2) {
        boolean trovato = false;

        for (int i = 0; i < nomi.length; i++) {
            if (nomi2.equals(nomi[i])) {
                trovato = true;
                break;
            }
        }
        return trovato;
    }
}