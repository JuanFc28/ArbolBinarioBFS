public class Node {
    Node left;
    Node right;
    char value;
    
        public Node(char value){
            this.value = value;
            right = null; //Por default no hay nada en la izquierda y derehca
            left= null;
        }
}
