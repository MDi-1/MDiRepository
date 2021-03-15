package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    public static final String STANDARD = "Standard";
    public static final String THOUSAND = "1000 islands";
    public static final String BARBECUE = "Barbecue";

    public static final String LETTUCE = "lettuce";
    public static final String ONION = "onion";
    public static final String BACON = "bacon";
    public static final String CUCUMBER = "cucumber";
    public static final String CHILLI = "chilli";
    public static final String MUSHROOMS = "mushrooms";
    public static final String SHRIMPS = "shrimps";
    public static final String CHEESE = "cheese";

    private final boolean bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private boolean bun;
        private int burgers;
        private String sauce;
        private final List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(boolean bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            if (burgers < 1 || burgers > 3) {
                throw new IllegalStateException("No meat, no BigMac");
            }
            if (!(sauce.equals(STANDARD) || sauce.equals(THOUSAND) || sauce.equals(BARBECUE))) {
                throw new IllegalStateException("No valid sauce chosen");
            }
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final boolean bun, final int burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" + "bun with sesame='" + bun + '\'' + ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' + ", ingredients=" + ingredients + '}';
    }
}