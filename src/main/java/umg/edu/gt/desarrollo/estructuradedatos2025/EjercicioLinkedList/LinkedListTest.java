package umg.edu.gt.desarrollo.estructuradedatos2025.EjercicioLinkedList;

import org.junit.Test;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioLinkedList;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    @Test
    public void testRemoveDuplicates() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1); list.add(2); list.add(2); list.add(3); list.add(4); list.add(4);
        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(1); expected.add(2); expected.add(3); expected.add(4);
        assertEquals(expected, EjercicioLinkedList.removeDuplicates(list));
    }

   @Test
    public void testReverseLinkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A"); list.add("B"); list.add("C"); list.add("D");

        LinkedList<String> expected = new LinkedList<>();
        expected.add("A");  //Este orden es incorrecto a propósito
        expected.add("B");
        expected.add("C");
        expected.add("D");

        EjercicioLinkedList.reverseLinkedList(list);

        assertEquals(expected, list);  //Esto fallará porque la lista sí se invierte
    }

    /*CODIGO CORRECTO, EN EL CUAL NO FALLA EL TESTE
    @Test
    public void testReverseLinkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        LinkedList<String> expected = new LinkedList<>();
        expected.add("D");
        expected.add("C");
        expected.add("B");
        expected.add("A");
        EjercicioLinkedList.reverseLinkedList(list);
        assertEquals(expected, list);
    }*/


    @Test
    public void testMergeSortedLists() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1); list1.add(3); list1.add(5);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2); list2.add(4); list2.add(6);
        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(1); expected.add(2); expected.add(3); expected.add(4); expected.add(5); expected.add(6);
        assertEquals(expected, EjercicioLinkedList.mergeSortedLists(list1, list2));
    }


}

