public class LinkList_3 {
    public static Link_List_Class deleteNode(Link_List_Class head, int index){

        //assign head to temp variable
        Link_List_Class temp = head;

        //function to move pointer to the index - 1 position
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }

        //updating index-1 node with the index + 1 node address
        temp.next = temp.next.next;

        return head;
    }
}

/*
* Ques: You are given the head of a linked list A and an integer B. Delete the B-th node from the linked list.
* Note : Follow 0-based indexing for the node numbering.
*
* Approach: Linear
* 1: traverse to the index - 1th node
* 2: assign the index + 1th node address to the index - 1th node
* 3: return head
* TC: O(N)
* SC: (1)
* */