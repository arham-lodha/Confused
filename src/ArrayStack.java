class ArrayStack<T> implements IStack<T> {

    private int top;
    private Object[] arr;
    private static final int DEFAULT_SIZE = 10;

    public ArrayStack(int size) {
        arr = new Object[size];
        top = -1;
    }

    public ArrayStack(){
        arr = new Object[DEFAULT_SIZE];
        top = -1;
    }

    public void push(T value){
        if(isFull()){
            throw new IllegalStateException("The stack is food");
        }
        top++;
        arr[top] = value;
    }

    @Override
    public T pop(){
        if(isEmpty()){
            throw new IllegalStateException("The stack is empty");
        }
        top--;
        return (T) arr[top+1];
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new IllegalStateException("The stack is empty");
        }
        return (T) arr[top];
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public boolean isFull() {
        return top >= arr.length;
    }

    @Override
    public void clear() {
        top = -1;
    }

    @Override
    public String toString() {
        String stack = "";
        for(int i = 0; i <= top; i++){
            stack += arr[i] + " ";
        }
        return stack;
    }

    @Override
    public String ArrayToString() {
        String stack = "";
        for(int i = 0; i < arr.length; i++){
            stack += arr[i] + " ";
        }
        return stack;
    }
}
