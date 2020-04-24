import java.util.Scanner; //Scanner imported since it is required
	public class StrictlyIdentical {
		
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Declare the scanner `
        System.out.print("Enter size of list 1 then inputs: "); //Prompts a user to enter the wanted number of inputs and said inputs.
        int size = input.nextInt(); //states that size is relative to user input
        int[] list1 = new int[size];
        for (int i = 0; i < size; i++) list1[i] = input.nextInt(); // saves inputs to array
        System.out.print("Enter size of list 2 then inputs: ");
        size = input.nextInt(); 
        int[] list2 = new int[size];
        for (int i = 0; i < size; i++) list2[i] = input.nextInt(); // similar to the process involving list 1
        if (equals(list1, list2)) {
            System.out.println("The lists are strictly identical");
        } else {
            System.out.println("The lists are not strictly identical");
        }//If else statement will display one message if the lists are identical or not.

    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) return false;
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) return false;
        }//Sets up a if statement if a list is not equal to another.

        return true;
    }
}
// Sample of 1 2 3 4 5 and 1 2 3 4 5 displayed the strictly identical section. 