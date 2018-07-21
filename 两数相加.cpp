/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
//注意声明temp
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int jinwei=0;
        ListNode *head1=l1;
        ListNode *head2=l2;
        while(l1 !=NULL && l2!=NULL){
            int temp=l1->val+l2->val+jinwei;
            jinwei=temp/10;
            l1->val=l2->val=temp%10;
             if(l1->next==NULL && l2->next!=NULL){
                while(jinwei!=0){
                    l2=l2->next;
                   int b=l2->val+jinwei;
                    l2->val=b%10;
                     jinwei=b/10;
                    if(l2->next==NULL && jinwei!=0){
                        ListNode *a =(ListNode*)malloc(sizeof(ListNode));
                        a->val=jinwei;
                        a->next=NULL;
                        l2->next=a;
                        return head2;
                    }
                }
                return head2;
            }
             else if(l2->next==NULL && l1->next!=NULL){
                  while(jinwei!=0){
                    l1=l1->next;
                       int c=l1->val+jinwei;
                    l1->val=(c)%10;
                   jinwei=(c)/10;
                    if(l1->next==NULL && jinwei!=0){
                        ListNode *a =(ListNode*)malloc(sizeof(ListNode));
                        a->val=jinwei;
                        a->next=NULL;
                        l1->next=a;
                        return head1;
                    }
                }
                return head1;
             }
            else if(l2->next==NULL && l1->next==NULL){
                 if(jinwei!=0){
                       ListNode *a =(ListNode*)malloc(sizeof(ListNode));
                        a->val=jinwei;
                        a->next=NULL;
                        l2->next=a;
                        return head2;
                 }
                 return head2;
            }
            else {
            l2=l2->next;
            l1=l1->next;
            }
        }
    }
};