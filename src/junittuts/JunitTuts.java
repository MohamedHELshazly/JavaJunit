
package junittuts;

import java.util.Scanner;


public class JunitTuts {

    // input ==> AACD ==> CD , ACD ==> CD, CDEF ==> CDEF , CDAA ==> CDAA
    
    public String truncate(String str){
        if(str.length() <= 2){
            return str.replace("A", "");
        }
        String first2 = str.substring(0,2);
        String restOfStr = str.substring(2);
        return first2.replaceAll("A", "")+ restOfStr;
    }
    
    private int [] data = new int[100000];
    private int arraySize = 10000;
    
    public void generateRandomArray(){
        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random()*10000);
        }
    }
    public void printArray(){
        System.out.println("---------------------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("|"+i+"|");
            System.out.println(data[i]+"|");
            System.out.println("---------------------");
        }
    }
    
    public boolean sameFirstSameLast(String str){
        if(str.length() <= 1){
            return false;
        }else if(str.length() == 2){
            return true;
        }
        String first2 = str.substring(0,2);
        String last2= str.substring(str.length()-2);
        return first2.equals(last2);
    }
    
    public static void main(String[] subs){
        JunitTuts j= new JunitTuts();
        j.generateRandomArray();
        //j.printArray();
        j.bubbleSort();
        
        
//        System.out.print("Enter a string: ");
//        String input= "";
//        Scanner sc = new Scanner(System.in);
//        input = sc.next();
//        //System.out.println("the returned value is " + truncate(input));
//        sc.close();
           
    }
    public void swapValues(int first, int second){
        int temp= data[first];
        data[second]= temp;
    }
    public void bubbleSort(){
        for (int i = arraySize-1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j+1]) {
                    swapValues(j, j+1);
                }
            }
            
        }
        printArray();
    }
    public void selectionSort(){
        for (int i = 0; i < arraySize; i++) {
            int min = i;
            for (int j = i; j < arraySize; j++) {
                if (data[min] > data[j]) {
                    min=j;
                }
            }
            swapValues(i, min);
            printArray();
        }
    }
}
