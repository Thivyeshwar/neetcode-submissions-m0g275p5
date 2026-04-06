/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //list 1 numbers
        ListNode currNum = l1;
        int f1 = 0;
        while(currNum != null){
            int num = currNum.val;
            f1 = f1 * 10 + num;
            currNum = currNum.next;
        }

        ListNode currNum2 = l2;
        int f2 = 0;
        while(currNum2 != null){
            int num = currNum2.val;
            f2 = f2 * 10 + num;
            currNum2 = currNum2.next;
        }

        int reversedNum = helperFunction(f1,f2); 

        String s = Integer.toString(reversedNum);
        ListNode newNode = new ListNode(Character.getNumericValue(s.charAt(0)));
        ListNode trav = newNode;

        for(int i=1;i<s.length();i++){
            int digit = Character.getNumericValue(s.charAt(i));
            trav.next = new ListNode(digit);
            trav = trav.next;
        }
        
        ListNode a = newNode;
        ListNode prev = null;
        while(a != null){
            ListNode c1 = a.next;
            a.next = prev;
            prev = a;
            a = c1;
        }
        return prev;
    }

    public static int helperFunction(int f1,int f2){
        int num1 = f1;
        int reversedNum1 = 0;
        while(num1 != 0){
            int digit = num1 % 10;
            reversedNum1 = reversedNum1 * 10 + digit;
            num1 /= 10;
        }

        int num2 = f2;
        int reversedNum2 = 0;
        while(num2 != 0){
            int digit = num2 % 10;
            reversedNum2 = reversedNum2 * 10 + digit;
            num2 /= 10;
        }

        int ans = 0;
        ans = reversedNum1 + reversedNum2;
        return ans;
    }
}
