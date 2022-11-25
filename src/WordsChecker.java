import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    Set<String> words =new HashSet<>();

    public WordsChecker(String text) {
        String[] parts=text.split("\\P{IsAlphabetic}+");
        for (String word:parts){
            words.add(word);
        }
    }

    public boolean hasWord(String word) {
        return words.contains(word);
    }
}
