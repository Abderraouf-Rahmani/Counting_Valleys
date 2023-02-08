
class CountingValleys {
    public static void main(String[] args) {
        // DDDUUDUUUDDUU 13  not at sea level
        
        String s = "DDDUUDUUUDDUUD";
        int n = 14;
        char[] arrayOfSteps = s.toCharArray();
        int level = 0;
        int numOfVall = 0;
        int[] levelsTrack = new int[n];
        
        if(s.length() != n){
            System.out.print("the number of steps must be equal to the number of charachters of the string!");
            return;
        }
        if ( n < 2 || n > 1000000) {
            System.out.print("The number of steps (n) must be greater or equal to 2 and less or equal to 10^6!");
            return;
        }
        for(int i = 0; i < s.length(); i++){
            if(arrayOfSteps[i] == 'D'){
                levelsTrack[i] = -1;
            }else if(arrayOfSteps[i] == 'U'){
                levelsTrack[i] = +1;
            }
        }
        for(int i = 0; i < levelsTrack.length;  i++){
            level += levelsTrack[i];
            if(level == 0 && levelsTrack[i] == 1){
                numOfVall++;
            }
        }
        if(level !=0) {
        System.out.print("You're not at sea level, keep going!");
        return;
        }
        System.out.print(numOfVall);
    }
}