import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InputMismatchException {
        System.out.println("Começando o jogo!");

        ArrayList inventario = new ArrayList();
        Luca luca = new Luca("Luca", "15 anos", 200, inventario, 0);
        Pr0t0 robo = new Pr0t0("Pr0t0", "36 horas", 300, 0);

        luca.contarHistória();
        robo.contarHistória();

        boolean completo = false;
        Entrada entrada = new Entrada(completo, luca, robo);
        //entrada.introdução();
        //System.out.println("Fim da introdução");
        entrada.desafio();
    }
}