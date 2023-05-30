package codingClass.strings;
public class Main {
    public static void main(String[] args) {
        String input = "We are the largest STM Indexing and Abstracting Company from India. Our 360º solutions help publishers and pharmaceutical companies maximize the value of their information assets. With expertise spanning across multiple domains including, machine learning, text mining, literature curation, ontology development, content analytics and visualization we serve various industries with proprietary services and products.";

        String[] lines = new String[(input.length() + 19) / 20];
        int lineIndex = 0;
        int charIndex = 0;
        while (charIndex < input.length()) {
            String line = input.substring(charIndex, Math.min(charIndex + 20, input.length()));
            int lastSpace = line.lastIndexOf(' ');
            if (line.length() == 20 && lastSpace > 0) {
                line = line.substring(0, lastSpace);
                charIndex += lastSpace - 20;
            } else {
                charIndex += 20;
            }
            lines[lineIndex++] = line;
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }
}


