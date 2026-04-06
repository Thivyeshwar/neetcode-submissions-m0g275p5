/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head == null){
            return null;
        }

        //step1.creating a list with exact same values;
        Node curr = head;
        while(curr != null){
           Node newNode = new Node(curr.val);
           newNode.next = curr.next;
           curr.next = newNode;
           curr = newNode.next;
        }

        //Step2: In the new list adding the random pointer values;
        curr = head;
        while(curr != null){
            if(curr.random != null){
            curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        //seperating the two list
        curr = head;
        Node newHead = head.next;
        Node newCur = newHead;
        while(curr != null){
            Node copy = curr.next;
            curr.next = copy.next;
            if(copy.next != null){
                copy.next = copy.next.next;
            }
            curr = curr.next;
        }
        return newHead;
    }
}
