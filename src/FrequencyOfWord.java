public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Cat dog cat and dogs";
        String word = "dog";
        int count = 0;
        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        System.out.println(count);
        // result
        // Additional comments need to be added
    }
}
