package fr.eql.AI111.algo.raf.stringSort.tri;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Tri {
    public static void main(String[] args) throws IOException {


        RandomAccessFile raf = new RandomAccessFile("C:/Users/forte/OneDrive/Bureau/projets/algo_raf/Algo_RAF/output.bin",
                "rw");

        int lineNumber = 0;  //  (0 , 388 )


        raf.seek(230*lineNumber);
        System.out.println("le pointeur se situe maintenant sur la " +
                "position : " + raf.getFilePointer());
        System.out.println("le caractere est : " + raf.readChar());


    }
}
