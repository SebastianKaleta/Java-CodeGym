package pl.codegym.task.task15.task1530;


public abstract class DrinkMaker implements makeDrink {

    abstract void getRightCup();
    abstract void addIngredients();
    abstract void pour() ;

    public void makeDrink(){
         getRightCup();
        addIngredients();
       pour();
    }


}
