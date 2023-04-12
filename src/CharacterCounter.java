/**

 *description: Write a program that counts the occurrence of each letter in the below String. Consider upper case and
 * lower case the same letter.
 * @author Steven Halla
 * @author STUDENT LAST_NAME
 * @version 1.0 (VERSION)
 * @since 11 april 2023 (DATE THE PROGRAM WAS WRITTEN)
 * Project: Lab 2.1
 */


public class CharacterCounter {

    public static void main(String[] args) {
        // this sets a string array  with storyString being the name of our variable
        String storyString = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age" +
                " of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light," +
                " it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything" +
                " before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other " +
                "way—in short, the period was so far like the present period, that some of its noisiest authorities insisted on " +
                "its being received, for good or for evil, in the superlative degree of comparison only.";


        //this is going to create an array to store each character, with a length of 26 to account for letters A-Z
        int[] characterCounter = new int[26];

        //toCharArray returns an array of characters
        for (char c : storyString.toCharArray()) {
            //we set all letters to lower case so that we can properly group them together with upper case
            char lowerChar = Character.toLowerCase(c);
            //this is to check if its a lowercase letter, the above turns all upper case to lower case
            if (lowerChar >= 'a' && lowerChar <= 'z') {
                characterCounter[lowerChar - 'a']++;
            }
        }
        //for loop to print out each letter a-z and its number of occuranccs
        for (int i = 0; i < 26; i++) {
            char letter = (char) ('a' + i);
            System.out.printf("%c: %d%n", letter, characterCounter[i]);
        }
    }
}

