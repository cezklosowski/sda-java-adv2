package Ex08;
/*
Input:
the input text should be taken from the file in the filesystem (assume that it is an UTF-8 plain text).
the name of the file should be provided via the command line.
the text may contain only the following symbols: English letters (a-z, A-Z), limited set of punctuation marks (. ! ? ; , :) and whitespaces (space, \t, \r \n). Otherwise the error message should be displayed.
Output:
the result of the analysis should be written in UTF-8 encoded HTML-format to the file in the filesystem
feel free to pick the appearance of the result HTML. Please, test it against the Chrome browser.
the name of the output file should be provided via the command line
the output should contain the following metrics of the input text:
1) number of words
2) number of sentences (sentence ends with . ? or ! characters, assume that each sentence in the text ends with one of these characters).
3) average amount of words in a sentence (formatted with 2 decimal places).
Build:
should be sent to us as a .zip file with the maven project, which contains TextAnalysisRunner executable class, which is the entry point
maven dependencies and the number of the classes in the project are not limited
General code requirements:
take into consideration that in the future the analysing logic can be part of bigger infrastructure, so that the text might not be provided via the filename in the command line, but somehow otherwise.
take into consideration that it might be needed in the future to present the analysis result in some other formats (JSON etc).
take into consideration that other text metrics might be required in the future.
 */

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input file name:");
        String inputFileName = "C:\\Users\\cezkl\\IdeaProjects\\sda-java-adv2\\src\\main\\java\\Ex08\\" + sc.nextLine();

        StringBuilder fileText = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFileName), "UTF8"))) {

            String line;
            while ((line = br.readLine()) != null) {
                fileText.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String fileTextString = fileText.toString();
        if(!fileTextString.matches("[A-Za-z\\.!\\?\\;,: \\t, \\r \\n]*")){
            System.out.println("Wrong file!");
        } else{
            System.out.println("Input name of output file:");
            String outputFileName = "C:\\Users\\cezkl\\IdeaProjects\\sda-java-adv2\\src\\main\\java\\Ex08\\" + sc.nextLine();
            File outputFile = new File(outputFileName);
            StringBuilder outputFileTextBuilder = new StringBuilder();
            outputFileTextBuilder.append("File contains " + numbersOfWords(fileTextString) + " of words.\n");
            outputFileTextBuilder.append("File contains " + numbersOfSentences(fileTextString) + " of sentences.\n");
            outputFileTextBuilder.append("Average number of words in sentence is " + averageNumbersOfWordsInSentence(fileTextString) + "\n");
            System.out.println(outputFileTextBuilder);



        }



    }

    public static int numbersOfWords(String text){
        String[] words = text.split(" ");
        return words.length;
    }

    public static int numbersOfSentences(String text){
        String[] sentences = text.split("[\\.\\?!]");
        return sentences.length;
    }

    public static double averageNumbersOfWordsInSentence(String text){
        return numbersOfWords(text)/numbersOfSentences(text);
    }
}
