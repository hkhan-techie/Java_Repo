package com.mywork.designpatterns.creational.builder;

public class FoodPackage {

    private Food food;
    private Drink drink; // optional

    private FoodPackage(FoodPackageBuilder foodPackageBuilder) {
        this.food = foodPackageBuilder.food;
        this.drink = foodPackageBuilder.drink;
    }

    public Food getFood() {
        return this.food;
    }

    public Drink getDrink() {
        return this.drink;
    }

    public static class FoodPackageBuilder {
        private Food food;
        private Drink drink;

        public FoodPackageBuilder(Food food) {
            this.food = food;
        }

        public FoodPackageBuilder setFood(Food food) {
            this.food = food;
            return this;
        }

        public FoodPackageBuilder setDrink(Drink drink) {
            this.drink = drink;
            return this;
        }

        public FoodPackage build() {
            return new FoodPackage(this);
        }
    }
}
