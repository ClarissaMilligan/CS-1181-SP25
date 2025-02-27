# Midterm Review
The midterm will be held on Friday, February 28. The exam is 55 minutes. The exam will be a paper exam, so a writing utensil is required. The exam is individual and talking will not be tolerated. On the day of your exam, please wait outside the classroom as I will be seating you for the midterm.

Majority of questions are multiple choices, some short answer, a couple matching, and a few fill in the blank

## OOP Review, Abstract Classes, Interfaces
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

## Debugging

The questions will cover topics like:
* Errors vs Exceptions
* How to write your own Exceptions
* Checked Exceptions

## GUIS

The questions will cover topics like:
* JFrame, what it is and how it works
* JPanel, what it is and what it is used for
* Basic Java Swing components
* The differences and benefits of using different ways to implement an ActionListener (check out the graphic for this)
* Basic Layouts

## Generics and Collections

For these questions, you will be expected to:
* Understand the difference between Collection and Collections
* Understand the benefits of using generics, especially with ArrayList
* Understand where a generic can be used
* Understand when to extend versus contain a class, specifically ArrayList
* Read/Write a generic class header
* Write a generic method header
* Understand bounded type parameters

## Menti Review Questions


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
