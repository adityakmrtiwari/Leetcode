class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentLine = new LinkedList<>();

        for (int i = 0; i < students.length; i++) {
            studentLine.offer(students[i]);
        }

        int ct = 0;
        int k=0;
        while (!studentLine.isEmpty() && ct < studentLine.size()) {
            if(studentLine.peek()==sandwiches[k]){
                studentLine.poll();
                k++;
                ct=0;
            }
            else{
                studentLine.offer(studentLine.poll());
                ct++;
            }
        }
        return ct;
    }
}