public class Encrypt {
        public static void main(String[] args) {
            int key=4;
            String text="hello";
            String enc_mess="";
            System.out.println(text);
            char[] chars=text.toCharArray();
            for(char c: chars) {
                c+=7;
                enc_mess+=c;
            }
            System.out.println(enc_mess);
    }
}
