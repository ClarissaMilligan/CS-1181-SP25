# Final Review
The final will be held on Friday, May 2. The exam is 2 hours. The exam will be a paper exam, so a writing utensil is required. The exam is individual and talking will not be tolerated. On the day of your exam, please wait outside the classroom as I will be seating you for the final.

## Topics after the Midterm (these will have significantly MORE focus)

### ADTs and Data Structures
You will need to understand the following concepts.

Topics include:
* ADTs
  * Understand what an ADT specifies (or rather DOESN'T specify)
* For all the following, you must be able to understand an example of how the data structure may be used
* Lists
  * Understand code using ArrayLists and LinkedLists
  * Differences between ArrayList and LinkedList implementations
  * Understand how both use memory
  * Understand which is faster/more efficient at which operations
* Stacks and Queues
  * Understand code using Stacks, Queues, and PriorityQueues
  * Understand each's policy for adding/removing items
  * Understand PriorityQueues and how they work (they are not internally sorted!!!)
* Maps and Sets
  * Understand the basics of each of these

### Recursion
You should be able to read and understand recursive code.

Topics include:
* Understand the purpose of the base case and how to construct one
* Understand the purpose of the recursive step
* Understand what happens when a recursive call is executed
* Understand how variables are passed between recursive calls

### Concurrent Programming
You should be able to read and understand multi-threaded code.

Topics include:
* Understand the two main ways threads can be created (extend Thread, implement Runnable)
* Understand the importance of run() vs start()
* Understand the importance of join()
* Understand what a race condition is
* Understand several ways to help prevent race conditions (volatile and synchronized)

### Sorting Algorithms
Have a very basic understanding of the main sorting algorithms and which is faster


## Topics from the Midterm (these will have significantly less focus)

### OOP Review, Abstract Classes, Interfaces
You will need to understand the following concepts.

Topics include:
* Inheritance
* Deep vs Shallow copies
* Polymorphism
* Abstract classes
    * Can I create an object for an abstract class?
    * What methods need to be implemented by children of an abstract class?
    * Can I inherit more than one abstract class?
* Interfaces
    * Can I implement more than one interface?
    * Understand Comparable interface and how it's used
* Understand the difference between abstract classes and interfaces

### Debugging

The questions will cover topics like:
* Errors vs Exceptions
* How to write your own Exceptions
* How to throw Exceptions
* Checked Exceptions

### GUIS

The questions will cover topics like:
* JFrame, what it is and how it works
* JPanel, what it is and what it is used for
* Basic Java Swing components
* The differences and benefits of using different ways to implement an ActionListener (check out the graphic for this)
* Basic Layouts

### Generics and Collections

For these questions, you will be expected to:
* Understand the difference between Collection and Collections
* Understand the benefits of using generics, especially with ArrayList
* Understand where a generic can be used
* Understand when to extend versus contain a class, specifically ArrayList
* Read/Write a generic class header
* Read/Write a generic method header
* Understand bounded type parameters
* Understand what a wildcard is and when it might be used

## Menti Final Review Questions


1. What is the problem with the following code?
    ```java
        public class Pet
        {
            public void eatFood(String foodItem);
            public void doTrick(String trickName);
            public String toString()
            {
                return "This is a pet!";
            }
        }
    ```
    - Interfaces cannot have methods with a method body (unless they are default or static)


2. Which of the following describes an abstract class?
    - can hold both abstract and concrete methods

3. What is the difference between comparable and comparator?
   - comparable: natural ordering comparator: additional ordering
   
4. How do you create your own exception?
   - extend the Exception class

5. What is the difference between an Error and an Exception?
   - Errors are large, unrecoverable problems, Exceptions can be handled
   
6. True/False: A JFrame is used to hold and organize multiple components directly
   - False

7. True/False: FlowLayout is the default layout manager
   - True

8. Which of the following is the briefest way of implementing an ActionListener?
   - lambda expression

9. True/False: The generic data type must always be accompanied by <>
   - False

10. What is wrong with this class header?
    ```java
        public class MovingTruck <E extends Comparable<E>>
    ```
    - nothing is wrong

11. What does this header mean?
    ```java
        public class MovingTruck <E extends Comparable<E>>
    ```
    - MovingTruck can contain any object that implements Comparble

12. What is wrong with the given code?
    ```java
        import java.util.ArrayList;
        import java.util.PriorityQueue;
    
        public class MovingTruck <E extends Comparable<E>> {
            private PriorityQueue<E> movingBoxes = new PriorityQueue<>();
    
            public void addAllBoxes(ArrayList<E> newBoxes) {
                movingBoxes.addAll(newBoxes);
            }   
        }
        class Test {
            public static void main(String[] args) {
                MovingTruck<String> truckContents = new MovingTruck<>();
                ArrayList<Integer> numbers = new ArrayList<>();
                truckContents.addAllBoxes(numbers);
            }
        }
    ```
    - numbers must be an ArrayList of String

13. What might I need to change if I wanted addAllBoxes to work for any class that extends E?
    ```java
        import java.util.ArrayList;
        import java.util.PriorityQueue;
    
        public class MovingTruck <E extends Comparable<E>> {
            private PriorityQueue<E> movingBoxes = new PriorityQueue<>();
    
            public void addAllBoxes(ArrayList<E> newBoxes) {
                movingBoxes.addAll(newBoxes);
            }   
        }
    ```
    - Change ArrayList<E> to ArrayList<? extends E>

14. Assuming the generic method is implemented properly, what is wrong with the following code?
    ```java
        import java.util.*;
    
        class Test {
            public static void main(String[] args) {
                LinkedList<Integer> nums = new LinkedList<>();
                String min = findMin(nums);
            }
            public static <T> T findMin(LinkedList<T> items) {
                // assume method is fully and correctly implemented
            }
        }
    ```
    - type mismatch since T is defined as Integer not String

15. What is the difference between Collections and Collection?
    - Collections: class; Collection: interface

16. Which operation does an ArrayList perform better than a LinkedList?
    - Data Access (get)

17. Which of the following is a correct statement about LinkedLists?
    - they make better use of memory as elements aren't stored contigously

18. True/False: Stack is a class and an ADT in Java
    - True

19. Which of the following describes how a Stack stores/accesses items?
    - LIFO

20. Which of the following is the best example of when to use a standard Queue?
    - To represent a line of customers at the DMV

21. True/False: ADTs specify an exact data type
    - False

22. True/False: ADTs do not specify an exact implementation OR memory usage
    - True

23. True/False: The contents of a PriorityQueue are always sorted
    - False

24. True/False: Sets allow duplicates in Java
    - False

25. True/False: Maps contain two generic data types that the user needs to specify
    - True

26. True/False: Recursion is always the best way to implement a solution to a problem
    - False

27. What is wrong with the following code?
    ```java
        public static int recursiveMethod(int value) {
            value = value - 1;
            int result = recursiveMethod(value);
            return result;
        }
    ```
    - A StackOverflowError will be thrown

28. How could you fix the following code?
    ```java
        public static int recursiveMethod(int value) {
            value = value - 1;
            int result = recursiveMethod(value);
            return result;
        }
    ```
    - Add a base case

29. Assuming WorkerThread is a properly defined class extending Thread, what is wrong with the following code?
    ```java
        public class ThreadMain {
            public static void main(String[] args) {
                Thread t1 = new WorkerThread();
                Thread t2 = new WorkerThread();
    
                t1.run();
                t2.run();
            }
        }   
    ```
    - calling run() directly will not actually create a new execution thread

30. What is the point of calling join()?
    - to cause the thread to pause execution until the joined thread is done

31. What is the point of the Runnable interface?
    - Allows for multithreading even if your class already extends another
    
32. Which of the following is the most valid way to handle race conditions?
    - synchronized methods / volatile variables

33. Which of the following sort algorithms is the fastest?
    - Merge


## Menti Midterm Review Questions


1. Swing component commonly used as a container object
    - JPanel

2. Swing component representing the window
    - JFrame

3. What kind of copy is being made in this example
    ```java
        public class Container {

            private ArrayList<Item> contents;

            public Container(ArrayList<Item> initial){
                this.contents = initial;
            }
        }
    ```
    - Shallow Copy

4. Since java doesn't have multi-inheritance, we often use _____ instead
    - Interfaces

5. Most concise way to add an ActionListener
    - Lambda Expression

6. What type of copy is being made in this example
    ```java
    public class Container {

        private ArrayList<Item> contents;

        public Container(ArrayList<Item> initial){
            for(Item i : initial){
                this.contents.add(new Item(i));
            }
        }
    }
    ```
    - Deep Copy

7. When adding an ActionListener, use this so action is encapsulated in a separate pre-existing component (i.e. not accessible by a different component)
    - Top Level Class

8. Lets us define data types as a parameters
    - Generics

9. Which of the following is true about type T?
    ```java
    public class Container<T extends Comparable<T>> {

        private ArrayList<T> contents;

        public Container(ArrayList<T> initial){
            this.contents.addAll(initial);
        }
    }

    ```

    - T must implement the comparable against another T

10. Method that was no body
    - Abstract Method

11. Handles an exception when it is thrown
    - Catch Block

12. Denotes that a generic should implement an interface
    - extends

13. Mostly static utility class commonly used with Lists
    - Collections

14. Which of the following will print LAST?
    ```java
        public static void doThing(){
            try {
                System.out.println("One");
                throw new Exception();
            }
            catch (Exception e){
                System.out.println("Two");
                return;
            }
            finally {
                System.out.println("Three");
            }
        }
    ```
    - "Three"

15. What class do we extend when we want to define our own error types?
    - Exception

16. What interface do we use when we want sort our own custom classes in a natural order?
    - Comparable

17. Copies an object's reference
    - Shallow Copy

18. Constructor that takes in an instance of the same object
    - Copy Constructor

19. Indicates that a method will duck its responsibility
    - Throws

20. Lets you specify that a generic should be an instance of a parent type
    - Bounded types
