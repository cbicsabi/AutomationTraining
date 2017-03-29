package generics;

import org.apache.log4j.Logger;

public class Main {

    private static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Box<String> withString = new Box<>("my string");

        System.out.println(withString.getContent().length());

        LOGGER.debug("String box content:" + withString.getContent());

        Box<Integer> withInteger = new Box<>(33);

        System.out.println(withInteger.getContent().doubleValue());

        print("unu");
        print("unu", "doi");
    }

    private static void print(String... args){
        for(String a: args){
            System.out.println(a);
        }
    }
}
