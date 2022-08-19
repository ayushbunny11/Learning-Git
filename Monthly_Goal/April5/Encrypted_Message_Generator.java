import java.util.*;
import java.io.*;

public class Encrypted_Message_Generator {
    public static void main(String[] args) throws IOException {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a message: ");
        String message=sc.nextLine();
        char enc;
        int key =sc.nextInt();
        String enc_mess="";
        for(int i=0; i<message.length();i++){
            enc=message.charAt(i);
            int ascii = enc;
            enc=(char) (ascii+key);
            enc_mess+=enc;

        }



        sc.close();



        //File Codefile = new File("CodeGen.txt");
        FileWriter writeFile = new FileWriter("CodeGen.txt");
        writeFile.write("Encrypted Message: "+enc_mess+"\n");
        writeFile.write("Key: "+Integer.toString(key));
        writeFile.close();
    }
}
