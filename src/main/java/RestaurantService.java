import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName) throws restaurantNotFoundException {
        //DELETE ABOVE STATEMENT AND WRITE CODE HERE
        boolean restaurantFound =false;

        for (Restaurant r:restaurants){
            if (r.getName().equals(restaurantName)){
                restaurantFound=true;
                return r;
            }
        }

        throw new restaurantNotFoundException(restaurantName);
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }


    public int orderTotal(String restaurantName, ArrayList<String> itemList){
    /*Order total method
        Input will be Restaurant name and an ArrayList of item names
        Output should be the total order value

        Steps:
        If restaurant exists,
            -send itemList to restaurant object
        get itemTotal and return the same
     */
        return 0;
    }
}
