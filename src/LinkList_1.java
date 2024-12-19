public class LinkList_1 {
    public static Link_List_Class insertNode(Link_List_Class head, int value){

        //created new node
        Link_List_Class newNode = new Link_List_Class(value);

        // created copy of head node, so we don't loose links
        Link_List_Class temp = head;

        //traverse till last node
        while(temp.next != null){
            temp = temp.next; // by this we can move pointer
        }

        //linking last node to with new node
        temp.next = newNode;

        //return head so that we can traverse through this
        return head;
    }
}

/*
Ques: Program to add insert value in a link list

Approach:
1. Create new node with same link list class.
2. Since we are adding then we will add at the end,
3. traverse till end and make last node point new node and return head

TC: O(N);
SC: O(N);
*/