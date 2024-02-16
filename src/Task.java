import java.util.Stack;
import java.util.Scanner;
public class Task{
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                //<====================FIRST STACK=====================================>
                Stack<Integer> ID = new Stack<Integer>();
                Stack<String> Name = new Stack<String>();
                Stack<String> Class = new Stack<String>();
                Stack<String> Gender = new Stack<String>();
                Stack<Integer> Marks = new Stack<Integer>();

                // Input data into the first stack
                for (int i = 1; i <=10; i++) {
                        System.out.println("Enter ID: ");
                        ID.push(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Enter Name: ");
                        Name.push(sc.nextLine());
                        System.out.println("Enter Class: ");
                        Class.push(sc.nextLine());
                        System.out.println("Enter Marks: ");
                        Marks.push(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Enter Gender: ");
                        Gender.push(sc.nextLine());
                }
                //<======================SECOND STACK=============================>
                Stack<Integer> id1 = new Stack<Integer>();
                Stack<String> name1 = new Stack<String>();
                Stack<String> class1 = new Stack<String>();
                Stack<String> gender1 = new Stack<String>();
                Stack<Integer> marks1 = new Stack<Integer>();

                // Reverse the order of elements in the second stack
                for (int i =1; i<=10; i++) {
                        id1.push(ID.pop());
                        name1.push(Name.pop());
                        class1.push(Class.pop());
                        gender1.push(Gender.pop());
                        marks1.push(Marks.pop());
                }
                System.out.printf("%-4s%-15s%-15s%-6s%-8s\n", "ID", "NAME", "CLASS", "MARK", "GENDER");
                for (int i =1;i<=10;i++) {
                        System.out.printf("%-4d%-15s%-15s%-6d%-8s\n", id1.peek(), name1.peek(), class1.peek(), marks1.peek(), gender1.peek());
                        ID.push(id1.pop());
                        Name.push(name1.pop());
                        Class.push(class1.pop());
                        Marks.push(marks1.pop());
                        Gender.push(gender1.pop());
                }
                System.out.println();
                System.out.println("Do you want to edit something or exit?\n1. Edit\nOR\nPress any Key to Exit");
                int user_choice = sc.nextInt();

                if (user_choice == 1) {
                        System.out.println("Enter Row: ");
                        int rowToEdit = sc.nextInt();
                        sc.nextLine();

                        for (int i=1; i <=10; i++) {
                                if(i!=rowToEdit){
                                        id1.push(ID.pop());
                                        name1.push(Name.pop());
                                        class1.push(Class.pop());
                                        marks1.push(Marks.pop());
                                        gender1.push(Gender.pop());
                                }else {
                                        ID.pop();
                                        Name.pop();
                                        Class.pop();
                                        Marks.pop();
                                        Gender.pop();
                                        //Adding new Value to Stack
                                        System.out.println("Enter ID: ");
                                        id1.push(sc.nextInt());
                                        sc.nextLine();
                                        System.out.println("Enter Name: ");
                                        name1.push(sc.nextLine());
                                        System.out.println("Enter Class: ");
                                        class1.push(sc.nextLine());
                                        System.out.println("Enter Marks: ");
                                        marks1.push(sc.nextInt());
                                        sc.nextLine();
                                        System.out.println("Enter Gender: ");
                                        gender1.push(sc.nextLine());
                                }
                        }
                        // Display the updated table
                        System.out.printf("%-4s%-15s%-15s%-6s%-8s\n", "ID", "NAME", "CLASS", "MARK", "GENDER");
                        for (int i=1;i<=10;i++){
                                System.out.printf("%-4d%-15s%-15s%-6d%-8s\n", id1.pop(), name1.pop(), class1.pop(), marks1.pop(), gender1.pop());
                        }
                }
        }
}
