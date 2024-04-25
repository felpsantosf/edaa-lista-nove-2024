

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util {

    public static List<Bebida> lerArquivo(String filePath){
        List<Bebida> lista = new ArrayList<>();

        try
        {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            scanner.nextLine();

            while (scanner.hasNextLine()){
                String[] bebidaCsv = scanner.nextLine().split(",");

                lista.add(new Bebida(
                        bebidaCsv[0],
                        Integer.parseInt(bebidaCsv[1]),
                        Integer.parseInt(bebidaCsv[2]),
                        Integer.parseInt(bebidaCsv[3]),
                        Float.parseFloat(bebidaCsv[4])
                        )
                );
            }

            scanner.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return lista;
    }


    public static void quickSort(List<Bebida> array, int startIndex, int endIndex) {
        Bebida pivot = array.get(startIndex);
        int left = startIndex;
        int right = endIndex;

        while (left <= right){
            while (array.get(left).get_numVinhosServidos() < pivot.get_numVinhosServidos()){
                left++;
            }

            while (array.get(right).get_numVinhosServidos() > pivot.get_numVinhosServidos()){
                right--;
            }

            if(left <= right){
                Bebida temp = array.get(left);
                array.set(left, array.get(right));
                array.set(right, temp);

                left++;
                right--;
            }
        }

        if(startIndex < right){
            quickSort(array, startIndex, right);
        }

        if(left < endIndex){
            quickSort(array, left, endIndex);
        }
    }

}