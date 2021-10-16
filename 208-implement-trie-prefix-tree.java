class Trie {
    Node root ;
    public Trie() {
        root = new Node();
        root.val = ' ' ;
    }
    
    public void insert(String word) {
        Node node = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(node.children[c- 'a'] == null){
                node.children[c -'a'] = new Node(c);
            }
            node = node.children[c- 'a'];
        }
        node.isWord = true;
    }
    
    public boolean search(String word) {
        Node node = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(node.children[c- 'a'] == null){
                return false;
            }
            node = node.children[c - 'a'];
        }
        return node.isWord;
    }
    
    public boolean startsWith(String word) {
        Node node = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(node.children[c- 'a'] == null){
                return false;
            }
            node = node.children[c - 'a'];
        }
        return true;
    }
    
    
    class Node{
        char val ;
        Node [] children = new Node[26] ;
        boolean isWord= false;
        public Node(){}
        public Node(char val){
            this.val = val;
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */