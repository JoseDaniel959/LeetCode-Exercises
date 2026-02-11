package com.mycompany.app.Programming;

public class MergeTwoSortedList {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode FirstElement = list1;
        ListNode SecondElement = list2;
        ListNode sortedList = new ListNode();
        ListNode LastElementInSortedList = sortedList;

        if (list1 == null && list2 == null) {
            System.out.println("ENTROO");
            return null;
        } else if (list1 == null && list2 != null) {
            System.out.println("ENTROO 1");
            sortedList.val = list2.val;
            SecondElement = list2.next;
        } else if (list2 == null && list1 != null) {
            System.out.println("ENTROO 2");
            sortedList.val = list1.val;
            FirstElement = list1.next;
        } else if (list1.val > list2.val) {
            System.out.println("ENTROO 3");
            sortedList.val = list2.val;
            SecondElement = list2.next;
        } else if (list1.val <= list2.val) {
            System.out.println("ENTROO 4");
            sortedList.val = list1.val;
            FirstElement = list1.next;
        }

        while (FirstElement != null || SecondElement != null) {
            ListNode elementI = new ListNode();

            if (FirstElement == null && SecondElement == null) {
                return sortedList;
            } else if (FirstElement == null && SecondElement != null) {
                System.out.println("ENTROO while 1");
                elementI.val = SecondElement.val;
                LastElementInSortedList.next = elementI;
                LastElementInSortedList = elementI;
                SecondElement = SecondElement.next;
            } else if (SecondElement == null && FirstElement != null) {
                System.out.println("ENTROO while 2");

                elementI.val = FirstElement.val;
                LastElementInSortedList.next = elementI;
                LastElementInSortedList = elementI;
                FirstElement = FirstElement.next;
            } else if (FirstElement.val > SecondElement.val) {
                System.out.println("ENTROO while 3");
                elementI.val = SecondElement.val;
                LastElementInSortedList.next = elementI;
                LastElementInSortedList = elementI;
                SecondElement = SecondElement.next;
            } else if (FirstElement.val <= SecondElement.val) {
                System.out.println("ENTROO while 4");
                elementI.val = FirstElement.val;
                LastElementInSortedList.next = elementI;
                LastElementInSortedList = elementI;
                FirstElement = FirstElement.next;
            }

        }

        return sortedList;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}