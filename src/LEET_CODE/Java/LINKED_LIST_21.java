package LEET_CODE.Java;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LINKED_LIST_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }

        if(list2 == null) {
            return list1;
        }

        ArrayList<Integer> list = new ArrayList<>();

        ListNode list1FirstNode = list1;
        while(list1FirstNode != null) {
            list.add(list1FirstNode.val);
            list1FirstNode = list1FirstNode.next;
        }

        ListNode list2FirstNode = list2;
        while(list2FirstNode != null) {
            list.add(list2FirstNode.val);
            list2FirstNode = list2FirstNode.next;
        }

        for(int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(j) < list.get(min)) {
                    min = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, temp);
        }

        ListNode listNodeRes = new ListNode();
        ListNode firstNodeRes = listNodeRes;

        for(int i = 0; i < list.size(); i++) {
            firstNodeRes.val = list.get(i);
            firstNodeRes.next = (i == list.size() - 1) ? null : new ListNode();
            firstNodeRes = firstNodeRes.next;
        }

        return listNodeRes;
    }

    /**
     * Result test case 1: 1, 1, 2, 3, 4, 4
     * Result test case 2: 1, 1, 2, 3, 4, 4
     */
    public static void main(String[] args) {
        LINKED_LIST_21 linked_list_21 = new LINKED_LIST_21();

        ListNode listNodeOne = new ListNode();
        ListNode listNodeTwo = new ListNode();

        ListNode firstNodeOne = listNodeOne;
        ListNode firstNodeTwo = listNodeTwo;

        int[] array1 = {};
        int[] array2 = {};

        for(int i = 0; i < array1.length; i++) {
            firstNodeOne.val = array1[i];
            firstNodeOne.next = (i == array1.length - 1) ? null : new ListNode();
            firstNodeOne = firstNodeOne.next;
        }

        for(int i = 0; i < array2.length; i++) {
            firstNodeTwo.val = array2[i];
            firstNodeTwo.next = (i == array2.length - 1) ? null : new ListNode();
            firstNodeTwo = firstNodeTwo.next;
        }

        ListNode result = linked_list_21.mergeTwoLists(listNodeOne, listNodeTwo);

        ListNode firstNodeRes = result;
        while(firstNodeRes != null) {
            System.out.println("ITEM: " + firstNodeRes.val);
            firstNodeRes = firstNodeRes.next;
        }
    }
}
