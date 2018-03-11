package org.list;

class Node {
    int value;
    Node nextNode;

    void insertValue(int newValue){
        value = newValue;
    }

    int getValue(){
        return value;
    }

    Node getNextNode(){
        return nextNode;
    }

    void setNextNode(Node node){
        nextNode = node;
    }

}

public class LinkedList {

    private int linkedListSize = 0;
    private Node head = null;


    public int getNodesSize() {
        return linkedListSize;
    }

    public int getHead(){
        return head.getValue();
    }

    public void addFront(int value){
        Node newNode = new Node();
        newNode.insertValue(value);
        if (head != null){
            newNode.setNextNode(head);
        }
        head = newNode;
        linkedListSize +=1;
    }

    public int getSecondNode(int nodeValue){
       return head.getNextNode().getValue();
    }





}



