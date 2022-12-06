package Exercise.Exercise6;

import java.nio.charset.StandardCharsets;
import java.security.PublicKey;
import java.security.Signature;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import javax.crypto.Cipher;
/*Create two objects - Alice and Bob
Demonstrate symmetric encryption and decryption of message sent between Alice and Bob
Use AES-256 encryption with GCM/NoPadding cipher
Demonstrate asymmetric encryption and decryption of message sent between Alice and Bob
Use RSA-2048 encryption ECB/PKCS1Padding
Demonstrate signing a message and validating the signature using RSA-2048 keys between Alice and Bob
 */
public class CipherDecrypt {
    public static void main(String args[]) throws Exception {

        // Signature object
        Signature sign = Signature.getInstance("SHA256withRSA");

        // keypair generator obj
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");

        // init
        keyPairGen.initialize(2048);

        // gen pair of keys
        KeyPair pair = keyPairGen.generateKeyPair();

        // get the public key
        PublicKey publicKey = pair.getPublic();

        // create the cipher object
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

        // inti the cipher obj
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        // add data to the cipher
        byte[] input = "My name is Alice".getBytes();
        cipher.update(input);

        // encrypt the data
        byte[] cipherText = cipher.doFinal();

        System.out.println(new String(cipherText, "UTF8"));

        // INITIALIZE same cipher for decryption
        cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());

        // Decrypt the message
        byte[] decipheredText = cipher.doFinal(cipherText);

        // print it
        System.out.println(new String(decipheredText));


    }
}