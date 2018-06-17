package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q599MinimumIndexSumOfTwoListsTest {

    @Test
    public void findRestaurant() {
        Assert.assertArrayEquals(new String[]{"Shogun"}, Q599MinimumIndexSumOfTwoLists.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}));
        Assert.assertArrayEquals(new String[]{"Shogun"}, Q599MinimumIndexSumOfTwoLists.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"KFC", "Shogun", "Burger King"}));

    }
}