class Solution {
    public void reverseString(char[] s) {
        int start = 0;int end = s.length-1;
        while(start<end)
        {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            end--;start++;
        }
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
        
    }
}