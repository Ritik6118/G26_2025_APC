package Lec_15;

import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.Comparator;
import java.util.PriorityQueue;

public class merge_k_sorted {

}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>(new NodeComparator());
        for(ListNode head:lists){
            while(head!=null){
                pq.add(head);
                head=head.next;
            }
        }
        ListNode temp=new ListNode();
        ListNode ans=temp;
        while(!pq.isEmpty()){
            temp.next=pq.poll();
            temp=temp.next;
        }
        temp.next=null;
        return ans.next;
    }
}
class NodeComparator implements Comparator<ListNode>{
    public int compare(ListNode l1,ListNode l2){
        return l1.val-l2.val;
    }
}
