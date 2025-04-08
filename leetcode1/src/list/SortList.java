package list;

import common.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        List<Integer> res = new ArrayList<>();
        while (head != null) {
            res.add(head.val);
            head = head.next;
        }
        Collections.sort(res);
        ListNode newHead = new ListNode(res.get(0));
        ListNode prev = newHead;
        for (int i = 1; i < res.size(); i++) {
            newHead.next = new ListNode(res.get(i));
            newHead = newHead.next;
        }
        return prev;
    }
}
