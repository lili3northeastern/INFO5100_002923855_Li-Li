package Exercise.Exercise4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4Pattern4 {

        private static String REGEX = "Wen";
        private static String INPUT = "Wen says loving you. " +
                "Wen said loving you.";
        private static String REPLACE = "Lily";

        public static void main(String[] args) {
            Pattern p = Pattern.compile(REGEX);
            // get a matcher object
            Matcher m = p.matcher(INPUT);
            INPUT = m.replaceAll(REPLACE);
            System.out.println(INPUT);
        }
    }

