/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassexercise4;

/**
 *
 * @author ASUS
 */
public class InClassExercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(iteration('a', "Kamal"));
        System.out.println(counting('a', 'l', "Kamal"));
        System.out.println(specified('a', "Kamal"));

    }

    public static int iteration(char letter, String word) {
        int sum = 0;
        char[] arr = word.toCharArray();
        for (char c : arr) {
            if (c == letter) {
                sum++;

            }
        }
        return sum;
    }

    public static char counting(char firstLetter, char secondLetter, String word) {

        char letter = '$';
        int firstSum = 0;
        int secondSum = 0;
        char[] arr = word.toCharArray();
        for (char c : arr) {
            if (c == firstLetter) {

                firstSum++;

            } else if (c == secondLetter) {
                secondSum++;

            }
        }

        if (firstSum > secondSum) {

            letter = firstLetter;
        } else if (secondSum > firstSum) {

            letter = secondLetter;
        }
        return letter;

    }

    public static boolean specified(char letter, String word) {

        boolean exist = false;
        char[] arr = word.toCharArray();
        for (char c : arr) {
            if (c == letter) {
                exist = true;
            }
        }
        return exist;
    }

}
