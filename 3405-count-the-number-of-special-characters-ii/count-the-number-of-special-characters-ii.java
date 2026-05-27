class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,List<Integer>> map = new HashMap<>();

        for(char ch : word.toCharArray()){
            map.put(ch,new ArrayList<>());
        }

        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
            map.get(ch).add(i);
        }

        HashSet<Character> set = new HashSet<>();
        int c = 0;
        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch >= 'A' && ch <='Z'){
                char ch2 = (char)(ch +32);
                if(map.containsKey(ch2) && !set.contains(ch2)){
                    set.add(ch2);
                    int ind = map.get(ch).get(0);
                    boolean fl = true;
                    for(int vl : map.get(ch2)){
                        if(ind < vl){
                            fl = false;
                            break;
                        }
                    }
                    if(fl){
                        c++;
                    }
                }
            }
        }
        // System.out.print(map);

        return c;
    }
}