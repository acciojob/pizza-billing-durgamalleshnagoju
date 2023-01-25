package com.driver;

public class DeluxePizza  {

    private int price;
    private boolean isVeg;
    private String bill;
    private boolean isAddTakeAway;

    public DeluxePizza(Boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 450;
            this.bill = "Base Price Of The Pizza: 450\n";
        } else {
            this.price = 600;
            this.bill = "Base Price Of The Pizza: 600\n";
        }
    }


    public void addExtraCheese() {

    }


    public void addExtraToppings() {

    }


    public int getPrice() {
        return this.price;
    }


    public void addTakeaway() {
        if(isAddTakeAway){
            return;
        }
        price +=20;
        bill += "Paperbag Added: 20\n";
        isAddTakeAway = true;
    }


    public String getBill() {
        bill += "Total Price: "+price+"\n";
        return this.bill;
    }
}
