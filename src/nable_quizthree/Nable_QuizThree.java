/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nable_quizthree;

import java.util.Scanner;

/**
 *
 * @author Jake Marson Nable
 */
public class Nable_QuizThree {


    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        
        
        System.out.println("what do you want to do?");
        System.out.println("1. Question One");
        System.out.println("2. Question Two");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                menuone();
                break;
            case 2:
                menutwo();
                break;
            default:
                throw new AssertionError();
        }
    }
    
    //question one
    public static int MAX = 9;
    private int [] dataone;
    private int front;
    private int rear;
    
    public Nable_QuizThree(){
        dataone = new int[MAX];
        front = 0;
        rear = 0;
    }
    
    public static void menuone() throws Exception{
        Nable_QuizThree listone = new Nable_QuizThree();
                
                while (true) {                    
                    System.out.println("1. Insertion");
                    System.out.println("2. Display");
                    System.out.println("3. EXIT");
                    int choice = scan.nextInt();
                    int element;
                    
                    switch (choice) {
                        case 1:
                            System.out.println("Insert element");
                            element = scan.nextInt();
                            listone.insertionone(element);
                            break;
                        case 2:
                            listone.displayone();
                            break;
                        case 3:
                            
                            return;
                        default:
                            throw new AssertionError();
                    }
                }
                
    }
    private int insertionone(int index) throws Exception{
        
        if(front == MAX){
            throw new Exception("Queue is Empty");
        } else{
            dataone[rear++] = index;
        }
        return 0;
    }
    private void displayone()throws Exception{
        if(front == rear){
            throw new Exception("List is Empty");
        }
        
        System.out.println("-----------------------");
        System.out.println("\n List Elements:");
        
        for(int i = front; i < rear ;i++){
            System.out.println(dataone[i] + "");
        }
        System.out.println("---------------------");
    }
    //Question two
    public class Node {
        int data;
        Node next;
    }
    
    private Node head, tail;
    private int size;
    
    public static void menutwo()throws Exception{
        Nable_QuizThree listtwo = new Nable_QuizThree();
        
        while (true) {
            System.out.println("1. Insetion Front");
            System.out.println("2. Insertion End");
            System.out.println("3. Delete Front");
            System.out.println("4. Delete End");
            System.out.println("5. Display");
            System.out.println("6. EXIT");
            int choice = scan.nextInt();
            int element;
            
            switch (choice) {
                case 1:
                    System.out.println("Please Enter Element");
                    element = scan.nextInt();
                    listtwo.insertbeg(element);
                    break;
                case 2:
                    System.out.println("Please Enter Element");
                    element = scan.nextInt();
                    listtwo.insertend(element);
                    break;
                case 3:
                    listtwo.deletebeg();
                    break;
                case 4:
                    listtwo.deleteend();
                    break;
                case 5:
                    listtwo.display();
                    break;
                case 6:
                    return;
                default:
                    throw new AssertionError();
            }
            
        }
    }
    
    private Node createNewNode(int index) throws Exception {
    Node node = new Node();
    
    node.data = index;
    node.next = null;
    
    return node;
    
    }
    
    private void insertbeg(int item)throws Exception{
        Node node = createNewNode(item);
    
        if (size == 0){
        head = tail = node;
        } else{
            node.next = head;
            head = node;
        }
    
        tail.next = tail;
    
        size++;
    }
    private void insertend(int item) throws Exception{
        Node node = createNewNode(item);
    
        if(size > 0){
            tail.next = node;
            tail = node;
        
        } else if (size == 0){
            head = tail = node;
        }
        tail.next = head;
        size++;
    }
    private int deletebeg () throws Exception{
        if(head == null){
        throw new Exception("Queue is emty");
        }
        
        int temporary = head.data;
        head = head.next;
        return temporary;
    }
    
    private void deleteend () throws Exception {
        Node prev = tail.next;
        prev.next = head;
        tail = prev;
    }
    
     public void display() throws Exception{
        if (size == 0){
        throw new Exception ("List is empty");
        }
    
        Node temporary = head;
        System.out.println("-----------------------");
        System.out.println("\n List Elements:");
        while(temporary != tail){
            
            System.out.println(temporary.data + "  ");
            temporary = temporary.next;

        }
        System.out.println(tail.data + "  ");
        System.out.println("-----------------------");
    }
     
     
    
}
