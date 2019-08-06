package com.kodcu.question01;

/**
 * Altug Bilgin Altintas
 *
 * Effective Java Workshop
 *
 * Email : altug@kodcu.com Twitter : @altugaltintas
 */

/*
TODO: 
 1 - Initialize (create) the class according to the fields below - 5 minutes
 2 - Instructor will show the solutions
 3 - Refactor and ask questions
 */
public class NutritionFacts {

    private final int servingSize; // must
    private final int servings; // must
    private final int calories; // optional
    private final int fat;  // optional
    private final int sodium; // optional
    private final int carbohydrate = 0; // optional

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
    }

    

    public static class Builder {

        private final int servingSize; // must
        private final int servings; // must
        private  int calories; // optional
        private  int fat;  // optional
        private  int sodium; // optional
        private  int carbohydrate = 0; // optional

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder setCalories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder setFat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder setSodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder setCarbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }
        
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
        
        
        
        
    }

    @Override
    public String toString() {
        return "NutritionFacts{" + "servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories + ", fat=" + fat + ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + '}';
    }

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(10,10)
                .setCalories(100)
                .setSodium(10).setFat(790).build();
        
    }

}
