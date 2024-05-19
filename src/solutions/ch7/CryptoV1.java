package solutions.ch7;

/**
 * Encrypts strings (English Uppercase Alphabet)
 * based on Julius Caesar algorithm, shifting
 * the initial string k positions to the right.
 * Julius Caesar shifted three position to the right,
 * while Augustus Caesar shifted one RHS position.
 */
public class CryptoV1 {

    public static void main(String[] args) {
        String s = "JULIUS CAESAR";
        final int KEY = 45;

        String encrypted = encrypt(s, KEY);
        System.out.printf("%s --> %s\n", s, encrypted);

        String decrypted = decrypt(encrypted, KEY);
        System.out.printf("%s --> %s\n", encrypted, decrypted);
    }

    /**
     * Encrypts a string with symmetric-like cryptography.
     * Shifts initial chars key-positions to the right.
     *
     * @param s     the initial string
     * @param key   the secret key
     * @return      the encrypted string
     */
    public static String encrypt(String s, int key) {
        StringBuilder encrypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isUpperCase(ch)) encrypted.append(cipher(ch, key));
            else encrypted.append(ch);
        }

        return encrypted.toString();
    }

    /**
     * Decrypts a string with symmetric-like cryptography.
     * Shifts encrypted chars key-positions to the left.
     *
     * @param s     the encrypted string
     * @param key   the secret key
     * @return      the decrypted string
     */
    public static String decrypt(String s, int key) {
        StringBuilder decrypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isAlphabetic(ch)) decrypted.append(decipher(ch, key));
            else decrypted.append(ch);
        }

        return decrypted.toString();
    }

    /**
     * Encrypts an eng uppercase char based on
     * a secret key.
     *
     * @param ch    the initial char
     * @param key   the secret key
     * @return      the encrypted char
     */
    public static char cipher(char ch, int key) {
        int m, c;

        // message (char) position in 0-25
        // (English alphabet /Uppercase)
        m = ch - 65;

        // cipher position in 0-25
        c = (m + key) % 26;

        return (char) (c + 65);
    }

    /**
     * Decrypts an eng uppercase char based on
     * a secret key.
     *
     * @param ch    the encrypted char
     * @param key   the secret key
     * @return      the decrypted char
     */
    public static char decipher(char ch, int key) {
        int m, c;

        // message (char) position in 0-25
        // (English alphabet /Uppercase)
        c = ch - 65;

        // decipher position in 0 - 25
        // Αν το key είναι > 26 το c-key+26 είναι αρνητικό
        // Μπορούμε να πάρουμε
        m = (c - key + 26 * (Math.abs(c-key) + 1)) % 26;

        return (char) (m + 65);
    }
}
