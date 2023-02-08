
class CountingValleys {
    public static void main(String[] args) {
        // DDDUUDUUUDDUU 13  not at sea level
        
        String s = "DDDUUDUUUDDUU";
        int n = 13;
        char[] arrayOfSteps = s.toCharArray();
        int level = 0;
        int numOfVall = 0;

        if ( n < 2 || n > 1000000) {
            System.out.print("The number of steps (n) must be greater or equal to 2 and less or equal to 10^6!");
            return;
        }
       
        for(int i = 0; i < s.length();  i++){
            if(arrayOfSteps[i] == 'D'){
            level--;
        }else if(arrayOfSteps[i] == 'U'){
            level++;
        }
        if(level == 0 && arrayOfSteps[i] == 'U'){
            numOfVall++;
        }
        }
        if(level !=0) {
        System.out.println("You're not at sea level yet, keep going!");
        }
        System.out.print(numOfVall);
    }
}