class Solution {
    public String reverseVowels(String s) {
        char [] ch=s.toCharArray();
        
        int j=ch.length/2;
        for(int i=0;i<ch.length/2;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                char temp=ch[i];
               while(j>ch.length/2){
                    if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u'||ch[j]=='A'||ch[j]=='E'||ch[j]=='I'||ch[j]=='O'||ch[j]=='U'){
                       ch[i]=ch[j];
                       ch[j]=temp;  
                    }
                    j--;
               }
            }
        }

        String result=new String(ch);
        return result;
    }
}

public class ReverseVowel{
    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.reverseVowels("IceCreAm");
    }
}