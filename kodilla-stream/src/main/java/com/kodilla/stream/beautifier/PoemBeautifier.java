package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String txt, PoemDecorator txtExpression) {
        String effect = txtExpression.decorate(txt);
        System.out.println(effect);
    }
}
