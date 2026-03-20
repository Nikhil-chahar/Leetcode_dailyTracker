/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node,Node> map;

    public Node cloneGraph(Node node) {
        if(node == null) return null;
        map = new HashMap<>();
        Node clone = new Node(node.val);
        map.put(node,clone);

        dfs(node ,clone);
        return clone;
    }

    public void dfs(Node node,Node clone){

        for(Node neighbors : node.neighbors){
            if(!map.containsKey(neighbors)){
                Node cloneNei = new Node(neighbors.val);
                map.put(neighbors,cloneNei);

                clone.neighbors.add(cloneNei);
                dfs(neighbors,cloneNei);
            }else{
                clone.neighbors.add(map.get(neighbors));
            }
        }
    }
}