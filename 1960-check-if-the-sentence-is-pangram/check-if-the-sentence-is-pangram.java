class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<sentence.length();i++){
            set.add((int)sentence.charAt(i));
        }if(set.size()==26){
            return true;
        }else{
            return false;
        }
    }
}