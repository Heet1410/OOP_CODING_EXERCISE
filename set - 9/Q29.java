import java.io.*;

class Q28 {
    public static void main(String[] args) {

        int l = 0, w = 0, c = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String str;

            while ((str = br.readLine()) != null) {
                l++;

                String temp = str.trim();
                if (!temp.equals("")) {
                    w += temp.split("\\s+").length;
                }

                c += str.length();
            }

            br.close();

            System.out.println("Lines: " + l);
            System.out.println("Words: " + w);
            System.out.println("Chars: " + c);

        } catch (Exception e) {
            System.out.println("Problem reading file");
        }
    }
}