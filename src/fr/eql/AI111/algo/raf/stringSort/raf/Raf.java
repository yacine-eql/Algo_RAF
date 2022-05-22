package fr.eql.AI111.algo.raf.stringSort.raf;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;


public class Raf {
    public static void main(String[] args) throws IOException {


        RandomAccessFile raf = new RandomAccessFile("C:/Users/forte/OneDrive/Bureau/projets/algo_raf/Algo_RAF/output.bin",
                "rw");

        FileReader in = new FileReader("C:/Users/forte/OneDrive/Bureau/projets/algo_raf/Algo_RAF/output.txt");
        BufferedReader br = new BufferedReader(in);


        String line ;

        while ((line = br.readLine()) != null) {

            raf.writeChars(line);

        }
        raf.seek(0);

        int index = 230;
        int length = 98;

        raf.seek(index);
        String vinName ="";
        do {
           vinName += raf.readChar();
        }while (raf.getFilePointer()<= index + length);

        System.out.println("le Nom du Vin : " + vinName);
        System.out.println("le pointeur se situe maintenant sur la " +
                "position : " + raf.getFilePointer());
        raf.seek(index+220);

        String standNumber ="";
        do {
            standNumber += raf.readChar();

        }while (raf.getFilePointer()<= index + 226);

        System.out.println("le " + vinName.trim() + " correspond au numero du stand : " + standNumber);



        raf.close();
        br.close();
        in.close();


    }
}
