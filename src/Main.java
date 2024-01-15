import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> g = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input jumlah data yang akan di proses");
        int u = Integer.parseInt(reader.readLine());
        int counter = 0;

        for (int index = 0; index < u; index++) {
            counter++;
            System.out.println("Masukan Nama " + counter + " : ");
            String name = reader.readLine();
            System.out.println("Huruf Yang Akan Dihitung : ");
            char s = reader.readLine().charAt(0);

            int count = countOccurrences(name, s);
            g.add(count);
        }

        for (int d : g) {
            System.out.println(d);
        }
    }

    private static int countOccurrences(String str, char target) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}
//Kode ini akan menghitung kemunculan huruf yang
// dimasukkan oleh pengguna dalam setiap nama dan kemudian menampilkan hasilnya.