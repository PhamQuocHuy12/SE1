package tut3;
import java.io.*;
import java.util.Scanner;


/**
 * @overview a standalone procedure that read a file containing words
 * and white space then produce a compressed version of the file that
 * only contains words without any white space but it still preserve lines
 */
public class ex4_1 {
	public static void main (String[] args) {
		System.out.println("nhap path");
		Scanner s = new Scanner(System.in);
		String text = s.next();
		compress(text);
	}
	/**
     * @requires text file maximum line = 100 /\ path not null /\ path is correct
     * @modifies text file
     * @effects
     *      if (path eq null || file not found)
     *          print err to console: "Invalid path: "+ path
     *          continue
     *      else
     *          compress text file
     */
    public static void compress(String text){
        BufferedReader br;
        BufferedWriter bw;
        String[][] data = new String[100][100];
        int currentLine = 0;

        while(true){
            try{
                br = new BufferedReader(new FileReader(text));

                for (String line; (line = br.readLine()) != null;){
                    String[] readLine = line.split(" ");
                    data[currentLine] = readLine;
                    currentLine++;

                    if(currentLine == 100){
                        System.err.println("File cannot compressed! (excess line number)");
                        return;
                    }
                }

                File file = new File(text);
                Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));

                for (String[] line: data) {
                    for (String str : line) {
                        if(str != null)
                            out.append(str);
                    }
                    out.append("\r\n");
                }
                out.flush();

                break;

            }catch (IOException e){
                System.err.println("Invalid path: "+text);
            }
        }
    }
}
