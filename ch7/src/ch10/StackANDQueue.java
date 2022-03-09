package ch10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackANDQueue {
    public static void main(String[] args) {
        Stack st=new Stack();
//      Stack의 추가(push)/ 추줄(pop)
        st.push(0); //추가
        st.push(1);
        st.push(2);

        st.pop(); //추출
        System.out.println(st);


        Queue q=new  LinkedList(); //Queu는 interface라서 LinkedList로 생성
//        Q의 추가(offer) / 추출(poll)

        q.offer(0); //추가
        q.offer(1);
        q.offer(2);
        q.offer(3);

        q.poll(); //추출
        System.out.println(q);


    }
}