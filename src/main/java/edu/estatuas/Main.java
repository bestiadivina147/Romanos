package edu.estatuas;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


        public static void main(String[] args) {

            List.of( "MMMDCCCLXXXVIII", // 3888
                            "MMDCCLXXVII",  // 2777
                            "CDXLIV", // 444
                            "CDXXXIX" // 439
                    ).stream()
                    .map(RomanNumber::new)
                    .forEach(n -> System.out.println(n.toString() + " = " + n.toDecimal()));
        }
}
