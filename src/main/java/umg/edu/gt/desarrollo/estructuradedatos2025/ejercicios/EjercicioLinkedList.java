package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class EjercicioLinkedList {

	// Problema 1: Eliminar duplicados dejando solo la primera aparición
	public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> list) {
		HashSet<Integer> seen = new HashSet<>();
		LinkedList<Integer> result = new LinkedList<>();
		for (Integer num : list) {
			if (!seen.contains(num)) {
				seen.add(num);
				result.add(num);
			}
		}
		return result;
	}

	// Problema 2: Invertir la lista sin usar otra lista o ArrayList
	public static void reverseLinkedList(LinkedList<String> list) {
		ListIterator<String> left = list.listIterator();
		ListIterator<String> right = list.listIterator(list.size());

		for (int i = 0, mid = list.size() / 2; i < mid; i++) {
			String temp = left.next();
			left.set(right.previous());
			right.set(temp);
		}
	}

	// Problema 3: Intercalar dos listas ordenadas
	public static LinkedList<Integer> mergeSortedLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		LinkedList<Integer> mergedList = new LinkedList<>();
		int i = 0, j = 0;
		while (i < list1.size() && j < list2.size()) {
			if (list1.get(i) < list2.get(j)) {
				mergedList.add(list1.get(i++));
			} else {
				mergedList.add(list2.get(j++));
			}
		}
		while (i < list1.size()) {
			mergedList.add(list1.get(i++));
		}
		while (j < list2.size()) {
			mergedList.add(list2.get(j++));
		}
		return mergedList;
	}
}
