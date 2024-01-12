import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Poplutator {

    public static LinkedList<Person> generatePersonList(int listLength) throws Exception {

        if (listLength == 0) {
            throw new Exception("ERROR");
        }

        LinkedList<Person> list = new LinkedList<Person>();

        for (int i = 0; i <= listLength; i++) {
            String name = sweAlphabetRandomNameGen();

            String emailString = name + "@email.com";

            Person person = new Person(name, emailString);

            list.add(person);

        }

        return list;
    }
    static private String sweAlphabetRandomNameGen()
    {
        String sweAlphabet = "abcdefghijklmnopqrstuvwxyzåäö";
        
        StringBuilder builder = new StringBuilder();

        int randomNameLength = ThreadLocalRandom.current().nextInt(7) + 2;

        for(int i = 0; i < randomNameLength; i++)
        {
           int  randomNumber = ThreadLocalRandom.current().nextInt(sweAlphabet.length());

           builder.append(sweAlphabet.charAt(randomNumber));
        }

        
        return builder.toString();
    }
    static private String nonsensNameGen() {
        int randomNameLength = ThreadLocalRandom.current().nextInt(6) + 6;

        byte[] randomBytes = new byte[randomNameLength];

        ThreadLocalRandom.current().nextBytes(randomBytes);

        String name = new String(randomBytes, StandardCharsets.UTF_8);

        return name;
    }

}
