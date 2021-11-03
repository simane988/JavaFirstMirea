package ru.mirea.task5.furniture;

import java.util.ArrayList;
import java.util.Objects;

public class FurnitureShop {
    private ArrayList<Furniture> inStock;

    public FurnitureShop(){
        this.inStock = new ArrayList<>();
    }

    public void add(Furniture item, int amount, String id){
        item.amount = amount;
        item.id = id;
        inStock.add(item);
    }

    public String getStock(){
        StringBuilder ans = new StringBuilder();
        for (Furniture furniture : this.inStock) {
            ans.append(furniture.toString());
        }
        return ans.toString();
    }

    public void buy(String id, int amount){
        int num = 0;
        for (Furniture furniture : inStock) {
            if (Objects.equals(furniture.id, id)) {
                break;
            }
            num++;
        }
        if(this.inStock.get(num).amount - amount >= 0){
            this.inStock.get(num).amount -= amount;
            System.out.println("Here you go!");
        } else{
            System.out.println("There is not enough items. We have only " + this.inStock.get(num).amount + ".");
        }
    }
}
