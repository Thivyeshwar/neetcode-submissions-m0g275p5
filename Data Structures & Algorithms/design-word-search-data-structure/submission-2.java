class WordDictionary {

    class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }

    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = root;

        for(char ch : word.toCharArray()){
            int index = ch - 'a';

            if(node.children[index] == null){
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        return searchHelper(word,0,root);
    }

    boolean searchHelper(String word, int j, TrieNode node){

        for(int i=j;i<word.length();i++){
            char ch = word.charAt(i);

            if(ch == '.'){
                for(TrieNode child : node.children){
                    if(child != null && searchHelper(word, i+1,child)){
                        return true;
                    }
                }
                return false;
            }
            int index = ch - 'a';
            if(node.children[index] == null){
                return false;
            }
            node = node.children[index];
        }
        return node.isEnd;
    }
}
