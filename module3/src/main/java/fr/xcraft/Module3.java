package fr.xcraft;

import java.util.Arrays;
import java.util.List;

public class Module3 {

    public static String process(String input) {
        String chiffrement =
                "key1 [x2]\n" +
                "key2\n" +
                "key1 [x1]"; // TODO PARSE JSON
        String[] lines = chiffrement.split("\n");

//        Arrays.stream(lines).flatMap((line) -> {
//            if(!line.contains("[")) {
//                return List.of(line);
//            }
//
//            List<String> strings = Arrays.stream(line.split(" \\[")).toList();
//            return strings;
//
//        } );


        return "";
    }

    class Module1Output {
        private String chiffrement;

        public String getChiffrement() {
            return chiffrement;
        }

        public void setChiffrement(String chiffrement) {
            this.chiffrement = chiffrement;
        }
    }

}
