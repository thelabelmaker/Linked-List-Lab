import java.security.Principal;

public class BinaryTree<E>{
    class Node<E> {
		
		private E data;
		
		private Node<E> less;
		private Node<E> greater;
		
		public Node()
		{
			data = null;
			less = null;
			greater = null;
		}
		
		public Node(E data) 
		{
			this.data = data;
			this.less = null;
			this.greater = null;
		}

		
		
		
		public String toString()
		{
			if(data == null){
				return null;
			}
			return data.toString();
		}
	}

    public Node<E> head;

    public BinaryTree(E data){
        this.head = new Node<E>(data);
    }


    public boolean add(E data){
        head = check(head, data);
        return true;
    }

    public Node<E> check(Node<E> current, E data){
        if(current == null){
            return new Node<E>(data);
        }else if((Integer) data < (Integer) current.data){
            current.less = check(current.less, data);
        }else if((Integer) data > (Integer) current.data){
            current.greater = check(current.greater, data);
        }else{
            return current;
        }
        return current;
    }

    public String post_order(){
        String str = "";
        str = post_helper(head.less, str);
        str = post_helper(head.greater, str);
        str += ", " + head.toString();
        return str.substring(2, str.length());
    }

    private String post_helper(Node<E> temp, String str){
        if(temp == null){
            return str;
        }else{
            str = post_helper(temp.less, str);
            str = post_helper(temp.greater, str);
        }
        

        return str + ", " + temp.data.toString();
    }

    public String pre_order(){
        String str = "";
        
        str = pre_helper(head.greater, str);
        str = pre_helper(head.less, str);
        str = head.toString() + ", " +str;
        return str.substring(0, str.length()-2);
    }

    private String pre_helper(Node<E> temp, String str){
        if(temp == null){
            return str;
        }else{
            str = pre_helper(temp.greater, str);
            str = pre_helper(temp.less, str);   
        }
        

        return temp.data.toString() + ", "  + str;
    }

    public String in_order(){
        String str = "";
        str = in_helper(head.less, str);
        str += ", " + head.toString();
        str = in_helper(head.greater, str);
        return str.substring(2);
    }

    private String in_helper(Node<E> temp, String str){
        if(temp == null){
            return str;
        }else{
            str = in_helper(temp.less, str);
            str = str + ", " + temp.data.toString();
            str = in_helper(temp.greater, str);
        }

        return str;
    }

}
