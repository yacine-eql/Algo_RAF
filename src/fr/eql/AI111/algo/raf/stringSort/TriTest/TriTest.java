package fr.eql.AI111.algo.raf.stringSort.TriTest;

public class TriTest {

    public static void main(String[] args) {
        int[] tab = {12,3,11,8,5,10,4,1};

        TriTest triTest = new TriTest();
        triTest.triExtraction(tab);

    }


    public void triExtraction(int[] tab) {


        System.out.println("Tri par Extraction, initialement tab : ");

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        int nbComp = 0;
        int nbPermut = 0;
        int i, j;
        for (i = tab.length - 1; i > 0; i--) {
            int k = i;
            for (j = 0; j < i; j++) {
                nbComp++;
                if (tab[j] > tab[k]) {
                    k = j;
                }
            }
            nbComp++;
            if (k != i) {
                nbPermut++;

                int temp = tab[i];
                tab[i] = tab[k];
                tab[k] = temp;

            }
        }
        System.out.println("\r\nfin du tri par Extraction, nb comparaisons " + nbComp + ", nb permutations " + nbPermut);
        for (i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}