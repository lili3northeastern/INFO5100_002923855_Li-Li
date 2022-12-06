package Exercise.Exercise6;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import java.security.Key;
import java.security.SecureRandom;

/*Create two objects - Alice and Bob
Demonstrate symmetric encryption and decryption of message sent between Alice and Bob
Use AES-256 encryption with GCM/NoPadding cipher
Demonstrate asymmetric encryption and decryption of message sent between Alice and Bob
Use RSA-2048 encryption ECB/PKCS1Padding
Demonstrate signing a message and validating the signature using RSA-2048 keys between Alice and Bob
 */

public class KeyGeneratorExercise{
    public static void main(String args[]) throws Exception{

        // create keygen obj
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");

        // create secure random obj
        SecureRandom secRandom = new SecureRandom();

        // Initialize the keygen
        keyGen.init(secRandom);

        // GEN THE KEY
        Key key = keyGen.generateKey();

        // print it
        System.out.println(key);



    }
}