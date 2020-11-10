public class Main {
    public static void main(String[] args) {

        String str = "abba";
        char ch = 'a';
        int count = 0;

        while(str.contains( ""+ch)){
            str = str.replaceFirst(""+ch, "");
            count++;
            }
        System.out.println(count); //a2
        }
        // result:a2


    }

