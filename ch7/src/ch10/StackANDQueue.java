package ch10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackANDQueue {
    public static void main(String[] args) {
        Stack st=new Stack();
//      Stack�� �߰�(push)/ ����(pop)
        st.push(0); //�߰�
        st.push(1);
        st.push(2);

        st.pop(); //����
        System.out.println(st);


        Queue q=new  LinkedList(); //Queu�� interface�� LinkedList�� ����
//        Q�� �߰�(offer) / ����(poll)

        q.offer(0); //�߰�
        q.offer(1);
        q.offer(2);
        q.offer(3);

        q.poll(); //����
        System.out.println(q);


    }
}