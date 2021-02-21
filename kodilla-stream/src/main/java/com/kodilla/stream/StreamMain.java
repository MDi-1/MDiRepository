package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.world.World;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier beautifier = new PoemBeautifier();
        beautifier.beautify("\n\n\n---- Starting execution of Kodilla exercise 7.1 ----\n", txt -> txt);
        beautifier.beautify("This is just sample text for Poem Beautifier.", txt -> txt.toUpperCase());
        beautifier.beautify("This is just sample text for Poem Beautifier.", txt -> txt.toLowerCase());
        beautifier.beautify("This is just sample text for Poem Beautifier.", txt -> txt.replace(" ", "_"));
        beautifier.beautify("This is just sample text for Poem Beautifier.", txt -> " --== " +txt+ " ==-- ");


        System.out.println("\n\n\nUsing Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.charAt(0) == 'M')
                .forEach(System.out::println);

        BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));             // [1]

        System.out.println("# elements: " + theResultMapOfBooks.size());             // [2]
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
                .forEach(System.out::println);



        // exercise 7.3
        Forum forum = new Forum();
        try { forum.generate(); } catch (IOException e) { e.printStackTrace(); }

        System.out.println("\n\nGenerated user list of the forum - exercise 7.3 :");
        forum.getUserList().stream()
                .forEach(System.out::println);

        System.out.println("\nFiltered output map:");
        Map<Integer, ForumUser> forumUserList = forum.getUserList().stream()
                .filter(u -> u.getUserGender() == 'M')
                .filter(u -> u.getUserBirthDate().plusYears(20).isBefore(LocalDate.now()))
                .filter(u -> u.getPostQuantity() >= 1)
                .collect(Collectors.toMap(u -> u.getUserIDnumber(), u -> u));

        forumUserList.entrySet().stream()
                .map(entry -> entry.getValue())
                .forEach(System.out::println);
    }
}