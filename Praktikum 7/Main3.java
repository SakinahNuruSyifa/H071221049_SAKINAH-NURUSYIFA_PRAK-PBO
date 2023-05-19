import java.util.ArrayList;
import java.util.List;

class FoodFactory {
    public static Food getFood(String type) {
        switch(type){
            case "Burger" :
                return new Burger();
            case "Pizza" :
                return new Pizza();
            case "Steak" :
                return new Steak();
            default:
                throw new IllegalArgumentException("Inputan tidak valid");
        }
    }
}

interface Food {
    int getPrice();
}
class Burger implements Food{
    int price = 15000;

    @Override
    public int getPrice() {
        return price;
    }
}

class Pizza implements Food{
    int price = 50000;

    @Override
    public int getPrice() {
        return price;
    }
}

class Steak implements Food{
    int price = 30000;

    @Override
    public int getPrice() {
        return price;
    }
}

class Restaurant{
    public static int calculateTotal(List<Food> foodList) {
        int total = 0;
        for(Food food : foodList) {
            total += food.getPrice();
        }
        return total;
    }
}

class Main3{
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood("Burger");
        Food pizza = FoodFactory.getFood("Pizza");
        Food steak = FoodFactory.getFood("Steak");

        List<Food> foodList = new ArrayList<>();
        foodList.add(burger);
        foodList.add(pizza);
        foodList.add(steak);

        System.out.println("Total price : " + Restaurant.calculateTotal(foodList));
    }
}