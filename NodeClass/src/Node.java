public class Node<T> {
    //T as in type
    private T data;
    private Node front;
    private Node back;

    //empty constructor, all instance data are null
    public Node(){
    }

    //data is intialized, back and front are null (as in a one-item ArrayList)
    public Node(T data){
        this.data = data;
    }


    //data is initialized along with either front or back (end or beginning of ArrayList)
    public Node(T data, Node node, boolean isFront){
        this.data = data;
        //if it is the front item, there are only items behind it
        if(isFront){
            this.back = node;
        } else {
            this.front = node;
        }
    }

    //initialize all instance data
    public Node(T data, Node front, Node back){
        this.data = data;
        this.back = back;
        this.front = front;
    }

    //accessor: returns the value of the data
    public T getData(){
        return this.data;
    }

    //accessor: returns the item in front of the data
    public Node getFront(){
        return this.front;
    }

    //accessor: returns the item behind the data
    public Node getBehind(){
        return this.back;
    }

    //mutator: initialize data to given value
    public void setData(T data){
        this.data = data;
    }

    //mutator: initialize front to given Node
    public void setFront(Node front){
        this.front = front;
    }

    //mutator: initialize data to given value
    public void setBehind(Node back){
        this.back = back;
    }











}
