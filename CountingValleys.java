class CountingValleys {

    public static int CountValles(int n, String steps) {
        char[] arrayOfSteps = steps.toCharArray();
        return 1;
    }
    public static void main(String[] args) {
        // if(steps.length() != n){
        //     System.out.print("the number of steps must be equal to the strings number of chars");
        //     return;
        // }
        String s = "DDDUUDUUUDDUU";
        char[] arrayOfSteps = s.toCharArray();
        int n = 13;
        int level = 0;
        int numOfVall = 0;
        int temp;
        int[] levelsTrack = new int[n];

        for(int i = 0; i < s.length(); i++){
            if(arrayOfSteps[i] == 'D'){
                // level--;
                levelsTrack[i] = -1;
            }else if(arrayOfSteps[i] == 'U'){
                // level++;
                levelsTrack[i] = +1;
            }
        }
        for(int i = 0; i < levelsTrack.length;  i++){
            if(i == 0){
                temp = 0;
            }else{
                temp = levelsTrack[i - 1];
            }

            level += levelsTrack[i];
            if(level == 0 && levelsTrack[i] == 1){
                numOfVall++;
            }
        }
        System.out.print(numOfVall);

    }
}