package Exercise.Exercise6;


import java.security.MessageDigest;

/*Create two objects - Alice and Bob
Demonstrate symmetric encryption and decryption of message sent between Alice and Bob
Use AES-256 encryption with GCM/NoPadding cipher
Demonstrate asymmetric encryption and decryption of message sent between Alice and Bob
Use RSA-2048 encryption ECB/PKCS1Padding
Demonstrate signing a message and validating the signature using RSA-2048 keys between Alice and Bob
 */

public class MessageDigestExercise{
    public static void main(String args[]) throws Exception{
        // message
        String message = "Hello Bob";

        // Creating the MessageDigest object
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        // Pass the data
        md.update(message.getBytes());

        // gene the digest
        byte[] digest = md.digest();


        //print it
        System.out.println(digest);

    }
}
