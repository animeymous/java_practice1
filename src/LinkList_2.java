public class LinkList_2 {
    public static Link_List_Class reverseLinkList(Link_List_Class head){

        //condition to check if list if empty or contains only one element
        if(head == null || head.next == null){
            return head;
        }else{

            //prev and next two node to take care previous and next links
            Link_List_Class prev = null, next = null;
            Link_List_Class current = head;

            //reverse operation
            while (current != null){

                next = current.next; // stored neighbour address in next node
                current.next = prev; // linked current node to previous node for reversing
                prev = current; // update or move prev to current node
                current = next; // update or move current node to next node
            }

            return prev; // return prev as new head
        }
    }
}

/*
Ques: You are given a singly linked list having head node A.
You have to reverse the linked list and return the head node of that reversed list.

NOTE: You have to do it in-place and in one-pass.

Approach:
1. condition to check if list if empty or contains only one element
2. make 3 pointers current, prev and next three node to take care previous and next links and current node
3. reverse operation

TC: O(N);
SC: O(1);
*/