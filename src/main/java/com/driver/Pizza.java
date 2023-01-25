package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isAddExtraCheese;
    private boolean isAddTakeAway;
    private boolean isAddExtraToppings;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price = 300;
            this.bill = "Base Price Of The Pizza: 300\n";
        } else {
            this.price = 400;
            this.bill = "Base Price Of The Pizza: 400\n";
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isAddExtraCheese||isAddExtraToppings){
            return;
        }
        bill += "Extra Cheese Added: 80\n";
        price += 80;
        isAddExtraCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isAddExtraToppings){
            return;
        }
        if(isVeg){
            bill += "Extra Toppings Added: 70\n";
            price += 70;
        } else{
            bill += "Extra Toppings Added: 120\n";
            price += 120;
        }
        isAddExtraToppings = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(isAddTakeAway){
            return;
        }
        bill += "Paperbag Added: 20\n";
        price += 20;
        isAddTakeAway = true;
    }

    public String getBill(){
        // your code goes here
        bill += "Total Price: "+price+"\n";
        return this.bill;
    }
}
