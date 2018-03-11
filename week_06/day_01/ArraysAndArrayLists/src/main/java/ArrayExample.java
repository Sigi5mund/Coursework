public class ArrayExample {

    String[] words;

    public ArrayExample(){
        this.words = new String[5];
    }
    public void add(String word) {
        this.words[0] = word;
    }

    public int getWordCount() {
        return this.words.length;
    }
}
