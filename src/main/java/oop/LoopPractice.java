package oop;

public class LoopPractice {
    public static void main(String[] args) {
        printSquare(10);
    }
    public static void printSquare(int size){
        for (int i=0; i <size;i++){
            for (int y=0; y<size;y++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
