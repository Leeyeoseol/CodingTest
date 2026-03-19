import java.util.Arrays;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        for(int i=0;i<dic.length;i++){//dic배열 ex) 5
            boolean check = true; 
            String str=dic[i];
            String []dicdic=new String[str.length()];
            for(int k=0;k<dicdic.length;k++){
                 dicdic[k]=String.valueOf(str.charAt(k));
            }
            if(spell.length!=dicdic.length) continue;
            Arrays.sort(dicdic);
            for(int j=0;j<spell.length;j++){//spell배열 ex)3
                if(!spell[j].equals(dicdic[j])){
                    check = false;
                    break;
                }
            }
            if(check) return 1;
        }
        return answer;
    }
}
//string배열 안에 잇는거 하나 때고 분리해서 정렬?
//정렬하고 정렬
// Arrays.sort()