

import java.util.*;

public class App {
    public static void main(String[] args) {

        final String filePath = "drinks.csv";

        List<Bebida> bebidas = Util.lerArquivo(filePath);

        Util.quickSort(bebidas, 0, bebidas.size() - 1);

        for (Bebida b: bebidas)
            System.out.println("\n" + b);
    }
}