import java.io.*;

class Q27 {
    public static void main(String[] args) {

        try {
            // Writing
            FileWriter fw = new FileWriter("stud.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("101 Amit 78\n");
            bw.write("102 Neha 85\n");
            bw.write("103 Raj 90\n");

            bw.close();

            // Reading
            BufferedReader br = new BufferedReader(new FileReader("stud.txt"));
            String line;

            System.out.println("Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error in file handling");
        }
    }
}