package collections.map.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> history = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String url) {
        if(currentPage != null){
            history.push(currentPage);
        }
        System.out.println("방문 : "+ url);
        currentPage = url;
    }

    public String goBack() {
        String backSite = null;
        if(!history.isEmpty()){
            backSite = history.pop();
            System.out.println("뒤로가기 : "+ backSite);
        }
        return backSite;
    }
    // 코드 작성

}