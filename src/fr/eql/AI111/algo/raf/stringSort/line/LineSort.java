package fr.eql.AI111.algo.raf.stringSort.line;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class LineSort {


    public static void main(String[] args) throws IOException {

        FileReader in = new FileReader("C:/Users/forte/OneDrive/Bureau/projets/algo_raf/vin/VINStp.txt");
        BufferedReader br = new BufferedReader(in);


        List<String[]> lines = new ArrayList<>();
        String line;

        String[] dataArray ;
        while ((line = br.readLine()) != null) {
            dataArray = line.split("\t");
            lines.add(dataArray);
        }

        PrintWriter pw = new PrintWriter(new FileWriter(new File("output.txt")));

        for (String[] strings : lines) {
            pw.write("\r\n");
            System.out.println();

            for (String s : strings) {
                if (s.equals(strings[5])||(s.equals(strings[4]) || (s.equals(strings[3])))) {
                    s += String.join("", Collections.nCopies(5 - s.length(), " "));
                     pw.write(s);
                    System.out.print(s);
                }else if ((s.equals(strings[1]) || (s.equals(strings[2])))){

                    s += String.join("", Collections.nCopies(25 - s.length(), " "));
                    pw.write(s);
                    System.out.print(s);
                }else {
                    s += String.join("", Collections.nCopies(50 - s.length(), " "));
                    pw.write(s);
                    System.out.print(s);
                }

            }
            }pw.close();

        System.getProperty("file.encoding");
        }
    }








