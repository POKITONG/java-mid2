package collection.map.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> history = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String url) {

        /*urlStack.push(url);
        System.out.println("방문: " + urlStack.peek());*/
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if (!history.isEmpty()) {
            history.pop();
            System.out.println("뒤로 가기: " + history.peek());
            return history.peek();
        }
        return null;
    }
}
