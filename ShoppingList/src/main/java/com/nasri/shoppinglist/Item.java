package com.nasri.shoppinglist;

public class Item {

    private String title;
    private int amountNeeded;
    private int amountBoughtSoFar;

    public Item(String title){
        this.title = title;
    }

    public Item(String title, int amountNeeded){
        this.title = title;
        this.amountNeeded = amountNeeded;
    }

    public void addToAmountNeeded(int additional){
        this.amountNeeded += additional;
    }

    public void updateBought(int bought){
        if (amountNeeded - (amountBoughtSoFar + bought) < 0){ throw new IllegalArgumentException("More is bought than was required.");}
        else{
            amountBoughtSoFar += bought;
            System.out.println("Purchase successfully updated.");
        }
    }

    public boolean isFulfilled(){
        return getAmountLeft() == 0;
    }

    public void markBought(){
        amountBoughtSoFar = amountNeeded;
    }

    public int getAmountLeft(){
        return (amountNeeded - amountBoughtSoFar);
    }

    public String getTitle(){
        return this.title;
    }
    public int getAmountNeeded(){
        return amountNeeded;
    }
    public int getBought(){
        return amountBoughtSoFar;
    }
}
