import java.io.*;

class Q26 {
    public static void main(String[] args) {

        int lineCount = 0, wordCount = 0, charCount = 0;

        if (args.length == 0) {
            System.out.println("Please provide file name");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {

            String data;

            while ((data = reader.readLine()) != null) {
                lineCount++;

                String trimmed = data.trim();
                if (!trimmed.isEmpty()) {
                    String[] parts = trimmed.split("\\s+");
                    wordCount += parts.length;
                }

                charCount += data.length();
            }

            System.out.println("Lines = " + lineCount);
            System.out.println("Words = " + wordCount);
            System.out.println("Characters = " + charCount);

        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}