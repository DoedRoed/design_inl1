public class Main {

    public static void main(String[] args) {
        // Person test = new Person(null);
        Person medNamn = new Person("namn");
        Person namnMailPhone = new Person("namn2", "mail", "555-555");
        //Person medNull = new Person(null, "mail", "555-555");

        System.out.println(medNamn + "\n" + namnMailPhone);
    }

}
