package Exercise.Exercise4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4Pattern2 {
        private static final String REGEX = "\\bdog\\b";
        private static final String INPUT =
                "dog dog dog doggy dog";

        public static void main( String[] args ){
            Pattern p = Pattern.compile(REGEX);
            Matcher m = p.matcher(INPUT);
            int count = 0;

            while(m.find()) {
                count++;
                System.out.println("Match number "+count);
                System.out.println("start(): "+m.start());
                System.out.println("end(): "+m.end());
            }
        }
    }

