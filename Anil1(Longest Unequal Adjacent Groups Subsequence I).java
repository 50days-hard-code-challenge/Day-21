class Solution {
    public List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
        ArrayList<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i = 0; i<groups.length-1; i++){
            if(groups[i]!=groups[i+1]){
                list.add(words[i+1]);
            }
            
        }
        return list;
    }
}
