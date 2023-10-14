class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> ans = new ArrayList<>();
        helper(words,ans);
        return ans;
        
    }
    public void helper(List<String> words,List<Integer> ans){
        ArrayList<Integer> temp = new ArrayList<>();
        int count = 0;
        for(int i = 0; i<words.size(); i++){
            if(words.get(i).length()<=3){
                String s = words.get(i);
                int p = Integer.parseInt(s);
                temp.add(p);
                count = 0;
            }
            else{    // words.get(i).equals("prev")

                int n = temp.size();
                if(count < n){
                    ans.add(temp.get(n-1-count));
                }
                else{
                      ans.add(-1);
                }
                count++;
           }
        }
    }
}   
