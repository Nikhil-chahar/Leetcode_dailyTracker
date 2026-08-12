class Solution {
    public String pushDominoes(String dom) {
        // int le = 0,ri=0;
        int n = dom.length();
        List<Integer> ll = new ArrayList<>();

        char ans[] = new char[n];

        for(int i=0;i<n;i++){
            char ch = dom.charAt(i);
            if(ch != '.'){
                ll.add(i);
                ans[i] = ch;
            }else{
                ans[i] = '.';
            }
        }

        int len = ll.size();
        int prev = 0;

        for(int i=0;i<len;i++){
            int in = ll.get(i);
            int tem = in;
            
            if(i == 0){
                if(dom.charAt(in) == 'L'){
                    while(--in >=0){
                        ans[in] = 'L';
                    }
                }
            }
            // L...L
            else if(dom.charAt(prev) == 'L' && dom.charAt(in) == 'L'){
                while(++prev < in){
                    ans[prev] = 'L';
                }
            }
            // R....R
            else if(dom.charAt(prev) == 'R' && dom.charAt(in) == 'R'){
                while(++prev < in){
                    ans[prev] = 'R';
                }
            }
            // Ṛ....L
            else if(dom.charAt(prev) == 'R' && dom.charAt(in) == 'L'){
                int left = prev + 1;
                int right = in - 1;

                while (left < right) {
                    ans[left++] = 'R';
                    ans[right--] = 'L';
                }

            }
            prev = tem;
        }

        if(len > 0){
            int in = ll.get(len - 1);
            if(dom.charAt(in) == 'R'){
                while(++in <n){
                    ans[in] = 'R';
                }
            }
        }

        return String.valueOf(ans);
    }
}