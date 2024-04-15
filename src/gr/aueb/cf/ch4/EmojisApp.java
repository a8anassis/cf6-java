package gr.aueb.cf.ch4;

/**
 * Prints the whole range of emojis.
 * Range: 1F600 - 1F64F
 */
public class EmojisApp {

    public static void main(String[] args) {
        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int counter = 0;

        int emoji = emojiStart;

        while (emoji <= emojiEnd) {
            System.out.print(Character.toChars(emoji));
            System.out.print(" ");
            emoji++;
            counter++;
            if (counter % 16 == 0) {
                System.out.println();
            }
        }
    }
}
