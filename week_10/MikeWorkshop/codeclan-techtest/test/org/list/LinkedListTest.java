package org.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LinkedListTest {

    LinkedList linkedlist1;

    @Before
    public void setUp(){
        linkedlist1 = new LinkedList();
    }

    @Test
    public void WhenCreated_LinkedListHasNoElements() {
        assertEquals(0, linkedlist1.getNodesSize());

    }

    @Test
    public void canCreateHeadNode(){
        linkedlist1.addFront(42);
        assertEquals(1, linkedlist1.getNodesSize());
        assertEquals(42, linkedlist1.getHead());
    }

    @Test
    public void canReclassifyHeadNode(){
        linkedlist1.addFront( 41);
        linkedlist1.addFront(42);
        assertEquals(2, linkedlist1.getNodesSize());
        assertEquals(42, linkedlist1.getHead());
        assertEquals(41, linkedlist1.getNextNode(42));
    }

    @Test

}
