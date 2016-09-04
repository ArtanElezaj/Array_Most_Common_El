/*

Write a method that takes a sorted int[] and returns the most commonly-occurring value in the array. If there are multiple values tied as the most commonly-occurring, it should return the one that is greatest.

[0, 4, 9, 10, 10, 10, 10, 25, 25, 100] ->

10

[1, 2, 2, 4, 4, 5] ->

4

 */

package nyc.c4q.nesada;

public class Main {

    public static void main(String[] args) {

int [] myArray =  {0, 4, 9, 10, 10, 10, 10, 25, 25, 100};
        int [] myArray2 =  {1, 2, 2, 4, 4, 5};


System.out.println(mostCommonEl((myArray)));
        System.out.println(mostCommonEl((myArray2)));
    }

    public static int mostCommonEl(int[] a)
    {
        int countEl = 1;
        int currentCountEl;
        int ourEl = a[0];
        int current = 0;
        for (int i = 0; i < (a.length); i++)
        {
            current = a[i];
            currentCountEl = 0;
            for (int j = 1; j < a.length; j++)
            {
                if (current == a[j])
                    currentCountEl++;
            }
            if (currentCountEl >= countEl)
            {
                ourEl = current;
                countEl = currentCountEl;
            }
        }
        return ourEl;
    }
}
