package UsefulCodes;

import org.apache.commons.codec.binary.Base64;

public class Base64encoder {

    public static void main(String [] args){
        String pwd = "Password";

        //Encode data on your side using Base64
        byte[] bytesencoded = Base64.encodeBase64(pwd.getBytes());
        System.out.println("Encoded value is: "+ new String(bytesencoded));

        //Decode Data on other side
        byte[] valueDecoded = Base64.decodeBase64(bytesencoded);
        System.out.println("Decoded value is: "+ new String(valueDecoded));

        System.out.println(com.sun.jersey.core.util.Base64.base64Decode(pwd));
    }
}
