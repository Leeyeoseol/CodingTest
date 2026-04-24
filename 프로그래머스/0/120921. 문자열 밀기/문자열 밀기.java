class Solution {
    public int solution(String A, String B) {
        String temp = A;

        for (int i=0;i< A.length();i++) {
            //B랑 같은지 확인
            if (temp.equals(B)) return i;
            
            // 밀기
            temp =temp.substring(temp.length()-1)+temp.substring(0,temp.length()-1);
        }
        return -1;
    }
}