package L08;

import java.util.LinkedList;
import java.util.Queue;

public class Q {

    public static void main(String[] args) {
        int N = 4;
        Queue<Integer> q = nLevel(N);
    }

    private static Queue<Integer> nLevel(int n) {
        if (n <= 0)
            return null;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                q.add(i);
            }
        }
        return q;
    }

    private static boolean isNLevel(Queue<Integer> q, int n) {
        if (q == null | q.isEmpty())
            return false;

        Queue<Integer> copy= new LinkedList<>();
        Queue<Integer> t= new LinkedList<>();

        while(!q.isEmpty()){
            copy.add(q.peek());
            t.add(q.remove());
        }
        while(!t.isEmpty()){
            q.add(t.remove());
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (copy.isEmpty())
                    return false;
                if (copy.remove() != i)
                    return false;
            }
        }
        return copy.isEmpty();
    }

    private static boolean isNLevel2(Queue<Integer> q, int n) {
        if (q == null || q.isEmpty())
            return false;


        Queue<Integer> temp = nLevel(n);

        while (!q.isEmpty() && !temp.isEmpty()) {
            if (q.remove() != temp.remove())
                return false;
        }
        return temp.isEmpty() && q.isEmpty();
    }
}
