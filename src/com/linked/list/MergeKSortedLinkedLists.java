package com.linked.list;

import java.util.Comparator;
import  java.util.Queue;
import  java.util.PriorityQueue;
import java.util.List;

/**
 * Created by Laks on 2/22/16.
 */
public class MergeKSortedLinkedLists {

    public static ListNode mergeKLists(List<ListNode> lists) {
        if (lists.isEmpty()) return null;
        int end = lists.size() - 1;
        while (end > 0) {
            int begin = 0;
            while (begin < end) {
                lists.set(begin, MergeSortedList.mergeTwoLists(lists.get(begin),
                        lists.get(end)));
                begin++;
                end--;
            }
        }
        return lists.get(0);
    }
}
