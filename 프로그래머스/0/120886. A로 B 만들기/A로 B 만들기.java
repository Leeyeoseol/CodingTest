class Solution {
    public int solution(String before, String after) {
        int []count=new int[26];//개수 확인 용 a(97) ~ z(122)
    
        for(char c:before.toCharArray()){
            count[c-'a']++;
        }

        for(char c:after.toCharArray()){
            count[c-'a']--;
        }
        for(int n:count){
            if(n!= 0) return 0;
        }
        return 1;
    }
}
//Before, After 각각의 a의 개수, b의 개수 ... z의 개수를 세서 비교하면 O(N)으로 처리 가능하겠네요!