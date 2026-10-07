
import java.util.Scanner;

class Main{
    int arr[] = new int[5];
    int i=-1;
    
    void insertElement(){
        Scanner r = new Scanner(System.in);
        if (i== arr.length - 1){
            System.out.println("Array Is Full.");
        }else{
            System.out.println("Enter Data To Be Stored.");
               int data = r.nextInt();
            i++;
            arr[i] =  data;
        }
        }
    void deleteElement(){
        Scanner r = new Scanner(System.in);
        if (i == - 1){
            System.out.println("Array Is EMPTY.");
        }else{
            System.out.println("Enter Data To Be Deleted.");
               int data = r.nextInt();
            for (int a = 0; a<arr.length; a++){
                if (arr[a]==data){
                    arr[a] = 0;
                    break;
                }
                if(a == arr.length-1){
                                System.out.println("Data Nahi Mila.");
                }
            }
        }
    }
        void updateElement(){
        Scanner r = new Scanner(System.in);
            if (i == - 1){
            System.out.println("Array Is EMPTY.");
        }else{
            System.out.println("Enter Data To Update.");
               int data = r.nextInt();
                System.out.println("Enter Data After Update.");
                int n = r.nextInt();
            for (int a = 0; a<arr.length; a++){
                if (arr[a]==data){
                    arr[a] = n;
                    break;
        }
            }
            }
        }
        void displayElement(){
        Scanner r = new Scanner(System.in);
            System.out.println("Array Elements Are:-");
            for (int a = 0; a<=i; a++){
                System.out.print(arr[a]+ "  ");
            }
            System.out.println();
        }
            

                
    public static void main(String args[]){
        Main m = new Main();
        Scanner r = new Scanner(System.in);
        int choice=0;
       do{
           System.out.println("Enter 1:- (For Inserting Element)");
           System.out.println("Enter 2:- (For Deleting Element)");
           System.out.println("Enter 3:- (For Updating Element)");
           System.out.println("Enter 4:- (For Displaying)");
           System.out.println("Enter 5:- (For Exit)");

           System.out.println("Enter Your Choice");
            choice = r.nextInt();

           switch(choice){
               case 1:
                   m.insertElement();
                   break;
               case 2 :
                   m.deleteElement();
                   break;
               case 3:
                   m.updateElement();
                   break;
               case 4 :
                   m.displayElement();
                   break;
               case 5 :
                   System.out.println("Program Terminated");
                   break;
               default:
                 System.out.println("Invalid Choice");
           }
       }while(choice != 5);
           }
}
