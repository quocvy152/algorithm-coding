package LEET_CODE.Java;

class ListNodeInCycleList {
    int val;
    ListNodeInCycleList next;

    ListNodeInCycleList(int x) {
        val = x;
        next = null;
    }
}

/**
 * Sử dụng thuật toán: Tortiuse and Hare algorithm
 * - Thuật toán này sẽ có 2 con trỏ 1 con trỏ chạy chậm và 1 con trỏ chạy nhanh (thường chạy nhanh hơn 2 bước so với con trỏ chậm)
 * - TH1: Nếu con trỏ nhanh chạy và bằng con trỏ chậm thì đây là Cycle List
 * - TH2: Nếu con trỏ nhanh chạy và nó bằng null hoặc next của nó bằng null thì nó không phải là Cycle List
 */
public class CycleList {
    public boolean hasCycle(ListNodeInCycleList head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNodeInCycleList slow = head;
        ListNodeInCycleList fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}