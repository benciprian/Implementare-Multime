import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<String>();

        // Adding elements to the set
        mySet.add("apple");
        mySet.add("banana");
        mySet.add("orange");

        // Printing the set
        System.out.println("Set: " + mySet);

        // Checking if an element is in the set
        boolean containsApple = mySet.contains("apple");
        System.out.println("Contains 'apple': " + containsApple);

        // Removing an element from the set
        mySet.remove("banana");

        // Printing the set again
        System.out.println("Set after removing 'banana': " + mySet);

        // Clearing the set
        mySet.clear();

        // Printing the empty set
        System.out.println("Empty set: " + mySet);
    }
}
/*In Java, the Set interface is part of the java.util package and provides an
 unordered collection of unique elements.
Here's an example of how to implement a Set using a HashSet:
This code creates a HashSet object and adds some elements to it using the add method.
It then prints the set using System.out.println,
checks if an element is in the set using contains, removes an element using remove, clears the set using clear,
 and prints the empty set.
 */


