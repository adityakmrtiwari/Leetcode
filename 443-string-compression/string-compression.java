class Solution {
    public int compress(char[] chars) {
        int read =0;
        int write =0;
        while(read<chars.length){
            int start = read;
            while(read < chars.length && chars[read]==chars[start]){
                read++;
            }
            chars[write]=chars[start];
            write++;
            int ct=read-start;
            if(ct>1){
                for(char c: String.valueOf(ct).toCharArray()){
                    chars[write]=c;
                    write++;
                }
            }
        }
        return write;
    }
}