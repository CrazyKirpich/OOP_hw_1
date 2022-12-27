// При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.
// 1. Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.
// 2. Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и реализуйте перегруженный метод
// getProduct(int name, int volume, int temperature), выдающий продукт, соответствующий имени, объему и температуре.
// 3. В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков и позвольте покупателю купить товар.

public class Main
{
    public static void main(String[] args)
    {
        HotDrink coffee = new  HotDrink("coffee", 0.2, true, 60, 100);
        HotDrink tea = new  HotDrink("tea", 0.4, true, 80, 40);
        HotDrink cappuccino = new  HotDrink("cappuccino", 0.5, false, 50, 150);
        HotDrinksVendingMachine hotDrVenMach = new HotDrinksVendingMachine();
        hotDrVenMach.addHotDrinks(coffee);
        hotDrVenMach.addHotDrinks(cappuccino);
        hotDrVenMach.addHotDrinks(tea);

        System.out.println(hotDrVenMach.getHotDrinks());

        hotDrVenMach.shopHotDrinks();
    }
}