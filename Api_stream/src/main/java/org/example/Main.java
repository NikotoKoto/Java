package org.example;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 /*
        Handle stream
         */

        //Ex.1 Filter name
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");
        List<String> name = names.stream()
                .map(String::toLowerCase)
                .filter(n -> n.startsWith("a"))
                .toList();

        System.out.println(name);


        //Ex.2 Count elements

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Long number = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println(number);

        //Ex. 2.2 Square number
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        List<Integer> numms = nums.stream()
                .map(n-> n*n)
                .toList();

        int totalNumber = numms.stream()
                        .reduce(0,(n1,n2)-> n1+n2);

        System.out.println(totalNumber);
        System.out.println(numms);

        //EX. 2.3 Count words with length > 4
        List<String> words = List.of("java", "spring", "angular", "c", "go");
        Long countWord = words.stream()
                .filter(w-> w.length()> 4)
                .count();

        System.out.print(countWord);
        //Ex.3 Transform to uppercase

        List<String> wordsToUppercase = List.of("java","spring","angular");

        List<String> wordUppercase = wordsToUppercase.stream()
                .map(String::toUpperCase)
                .toList();

                System.out.println(wordUppercase);

      //Ex. 3.1 Average age
        record User(String name, int age) {}
        List<User> users = List.of(
                new User("Alice", 25),
                new User("Bob", 30),
                new User("Charlie", 20)
        );
        OptionalDouble averageAge = users.stream()
                .mapToInt(User::age)
                .average();

        System.out.println(averageAge);

      //Ex. 3.2 Find max

        List<Integer> findMaxNumber = List.of(10, 55, 23, 78, 4);
        int numberMax = findMaxNumber.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();

        System.out.println(numberMax);
     //Ex.4 Sum of squares

     List<Integer> chiffres = List.of(1,2,3,4);
     int total = chiffres.stream()
             .map(c->c*c)
             .reduce(0,(el1,el2)-> el1 + el2);

     System.out.println(total);



    //Ex.5 Longest word

    List <String> wordds = List.of("apple","banana","cherry","kiwi");

    String mot = wordds.stream()
            .reduce( (w1,w2) -> w2.length()<= w1.length() ? w1 : w2)
            .orElse("No word");

    System.out.println(mot);


    //Ex.6 Distinct & sort

        List<Integer> numberrs= List.of(5,4,3,2,5,3);

        List<Integer>numbersFinal = numberrs.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(numbersFinal);



    //Ex.7 Total price of products
        record Product(String name, double price, int quantity) {}
        List<Product> products = List.of(
                new Product("Book", 10.0, 2),
                new Product("Pen", 2.5, 5),
                new Product("Laptop", 1000.0, 1)

        );
        double totalprice = products.stream()
                .mapToDouble(p->p.price*p.quantity)
                        .sum();

        System.out.println(totalprice);


      //Ex.8 Filter + transform user

        record UserTransform(String name, int age) {}
        List<UserTransform> userTransforms = List.of(
                new UserTransform("Alice", 25),
                new UserTransform("Bob", 17),
                new UserTransform("Charlie", 30)
        );

        List<User> MajorUser = users.stream()
                .filter(u-> u.age >17)
                .map(u-> new User(u.name.toUpperCase(), u.age))
                .sorted(Comparator.comparing(User::name))
                .toList();

        System.out.println(MajorUser);

        //EX. 9 group name by first letter

        List<String> wordsEx9 = List.of("apple", "ant", "banana", "berry", "cherry");



        Map<Character, List<String>> grouped =
                wordsEx9.stream()
                        .collect(Collectors.groupingBy(w -> w.charAt(0)));

        System.out.println(grouped);


    }
}
