package Exercise.Exercise6;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Signature;

/*Create two objects - Alice and Bob
Demonstrate symmetric encryption and decryption of message sent between Alice and Bob
Use AES-256 encryption with GCM/NoPadding cipher
Demonstrate asymmetric encryption and decryption of message sent between Alice and Bob
Use RSA-2048 encryption ECB/PKCS1Padding
Demonstrate signing a message and validating the signature using RSA-2048 keys between Alice and Bob
 */
public class SignatureVerification {
    public static void main(String args[]) throws Exception{
        //Creating KeyPair generator object
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");

        //Initializing the key pair generator
        keyPairGen.initialize(2048);

        //Generate the pair of keys
        KeyPair pair = keyPairGen.generateKeyPair();

        //Getting the private key from the key pair
        PrivateKey privKey = pair.getPrivate();

        //Creating a Signature object
        Signature sign = Signature.getInstance("SHA256withRSA");

        //initialize the signature
        sign.initSign(privKey);
        byte[] bytes = "Hi we are learning JAVA".getBytes();

        // Adding the data to the signature
        sign.update(bytes);

        // cal the signature
        byte[] signature = sign.sign();

        // initialize the signature
        sign.initVerify(pair.getPublic());
        sign.update(bytes);

        //verifying
        boolean bool =sign.verify(signature);

        if (bool) {
            System.out.println("verified");
        } else {
            System.out.println("invalid");
        }




    }
}