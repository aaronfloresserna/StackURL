package StackURL;

public class Stack implements IStack {

    private Node top;
    private int size = 0;

    public class Node {
        public URL url;
        public Node nextNode;

        public Node(URL url){
            this.url = url;
        }
    }

    @Override
    public void push(URL url) {
        Node node = new Node(url);
        node.nextNode = top;
        top = node;
        ++size;
    }

    @Override
    public URL peek() {
        if (top != null)
            return top.url;
        else 
            return null;
    }

    @Override
    public URL pop() {
        if (top != null){
            Node nodePop = top;
            top = top.nextNode;
            nodePop.nextNode = null;
            --size;
            return peek();
        } else {
            return null;
        }
        
    }

    @Override
    public int search(URL url) {
        if (top != null) {
            Node pointer = top;
            int position = 0;
            while (pointer.nextNode != null) {
                if (pointer.url == url) {
                    break;
                } else {
                    pointer = pointer.nextNode;
                    ++position;
                }  
            }
            return position;
        } else {
            return 404;
        }
    }

    @Override
    public boolean empty() {
        if (top != null)
            return false;
        else 
            return true;
    }

    @Override
    public int size() {
        return size;
    }

    public void iterate(){
        Node pointer = top;
        while (pointer != null ) {
            System.out.println(pointer.url.getUrl());
            pointer = pointer.nextNode;
        }
    }
    
}
