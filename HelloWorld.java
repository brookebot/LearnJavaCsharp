public class HelloWorld {
    //class names must match file name! 
    //comments in java are the same as c also.
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("I am learning Java for the first time!");
        System.out.println("It's a lot like C actually...");
        System.out.print("Just print only prints on one line.");
        System.out.print("so these statements appear next to eachother.");

        System.out.print("\nWe can also print math: 3+3=");
        System.out.println(3+3);

        // below is some practice with defining primitive variable types (and String, which is non-Primitive)!

        String myString = "Hello! I'm learning Java";
        int favNumber = 11;
        float Pi = 3.14f; //f has to be added at the end for float value?
        char firstLetter = 'A'; //only ONE character.
        boolean isJavaCool; // to be set later....

        byte appetizer = -127; //1 byte
        short salad = 32766; // 2 bytes
        long entree = 525600*525600; // 8 bytes
        double dessert = 3.141592653589f; //8 bytes decimal (not a balanced diet)

        isJavaCool = true;

        // Final Pam - final permanently sets value and var is immutable.
        final String coolestName = "Pam";

        //declare multiple variables of the same type
        char first = 'a', second = 'b', third = 'c';
        System.out.println(first + second + third);// but WATCH OUT this will give you the ascii values 97 + 98 + 96 = 294.

        //Logical Operators
        boolean X = true;
        boolean Y = false;

        System.out.println(X && Y); // and
        System.out.println(X || Y); // or
        System.out.println(isJavaCool && !Y); //Not operator
        
        //String operations
        String yay = "My favorite number is ";
        String simple = "It's November";//normally use backslash \' for apostrophe.

        System.out.println(yay + favNumber); // not a comma, but addition operator.
        System.out.println(simple.toUpperCase());
        System.out.println(simple.toLowerCase());

        System.out.println(simple.indexOf("No"));//finds index location of arg.

        //MATH
        int bigNumber = Math.max(1000, 2);
        int smallNumber = Math.min(1000, 2); //args are ints
        double square = Math.sqrt(2);
        double abst = Math.abs(-12.3);
        int random = (int) (Math.random() * 100); // explicit declaration to typecast to more narrow type

        System.out.println(random);

    }
}
