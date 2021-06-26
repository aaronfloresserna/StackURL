package StackURL;

public interface IStack {
    
    public URL peek();

    public URL pop();

    public void push(URL url);

    public int search(URL url);

    public boolean empty();

    public int size();

}
