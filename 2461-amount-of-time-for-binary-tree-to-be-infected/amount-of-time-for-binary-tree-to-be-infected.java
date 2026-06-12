/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int amountOfTime(TreeNode root, int start) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();

        TreeNode tem = root;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode node = q.poll();
            int v1 = node.val;
            if(!map.containsKey(v1)){
                map.put(v1,new ArrayList<>());
            }

            if(node.left != null){
                int v2 = node.left.val;
                if(!map.containsKey(v2)){
                    map.put(v2,new ArrayList<>());
                }
                map.get(v1).add(v2);
                map.get(v2).add(v1);
                q.add(node.left);

            }
            if(node.right != null){
                int v2 = node.right.val;
                if(!map.containsKey(v2)){
                    map.put(v2,new ArrayList<>());
                }
                map.get(v1).add(v2);
                map.get(v2).add(v1);
                q.add(node.right);
            }
        }

        // System.out.print(map);

        return dis(map,start);
    }
    public int dis(HashMap<Integer,List<Integer>> map,int start ){
        HashSet<Integer> vis = new HashSet<>();

        int hei=0;

        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while(!q.isEmpty()){
            hei++;
            int sz = q.size();

            for(int i=0;i<sz;i++){
                int rp = q.poll();
                vis.add(rp);

                for(int nei : map.get(rp)){
                    if(!vis.contains(nei)){
                        q.add(nei);
                    }
                }
            }
        }

        return hei-1;


    }
}