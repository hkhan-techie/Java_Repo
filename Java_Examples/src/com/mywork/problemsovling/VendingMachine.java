package com.mywork.problemsovling;

enum State {
    IDLE,
    COIN_INSERTED,
    DRINK_SELECTED,
    OUT_OF_STOCK
}

public class VendingMachine {
    private State currentState = State.IDLE;

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.insertCoin();
        machine.selectDrink("Coke");
    }

    public void insertCoin() {
        if (currentState == State.IDLE) {
            currentState = State.COIN_INSERTED;
            System.out.println("Coin inserted.");
        } else {
            System.out.println("Invalid operation.");
        }
    }

    public void selectDrink(String drink) {
        if (currentState == State.COIN_INSERTED) {
            if (isDrinkInStock(drink)) {
                currentState = State.DRINK_SELECTED;
                System.out.println("Dispensing " + drink);
                currentState = State.IDLE;
            } else {
                currentState = State.OUT_OF_STOCK;
                System.out.println(drink + " is out of stock.");
                currentState = State.IDLE;
            }
        } else {
            System.out.println("Invalid operation.");
        }
    }

    private boolean isDrinkInStock(String drink) {
        // Logic to check if the drink is in stock
        return true; // Assuming all drinks are in stock for simplicity
    }

    public State getCurrentState() {
        return currentState;
    }
}
