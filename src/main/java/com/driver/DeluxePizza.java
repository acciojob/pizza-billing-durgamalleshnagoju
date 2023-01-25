package com.driver;

public class DeluxePizza  {

    private int price;
    private boolean isVeg;
    private String bill;
    private boolean isAddTakeAway;
    private boolean isBillGenerated;

    public DeluxePizza(Boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.bill = "Base Price Of The Pizza: 450\n";
            this.bill += "Extra Cheese Added: 80\n";
            this.bill += "Extra Toppings Added: 70\n";
            this.price = 450;
        } else {
            this.bill = "Base Price Of The Pizza: 400\n";
            this.bill += "Extra Cheese Added: 80\n";
            this.bill += "Extra Toppings Added: 120\n";
            this.price = 600;
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
        if(!isBillGenerated){
            bill += "Total Price: "+price+"\n";
            this.isBillGenerated = true;
            return this.bill;

        }
        return "";
    }
}
