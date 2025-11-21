public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean [] isPrime = new boolean[n+1];
        
        for (int i = 2 ; i < n+1 ; i++){
            isPrime[i] = true;
        }

        for (int i = 2; i <= (int)Math.sqrt(n); i++){

            if(isPrime[i]==true){
                int x = i + i;

                while (x <= n){
                    isPrime[x] = false;
                    x = x + i;
                }
            }
        }
        int sum = 0;

        System.out.println("Prime numbers up to "+n+":");
        for(int i = 0; i < isPrime.length-1; i++){
            if(isPrime[i] == true){
                System.out.println(i);
                sum++;
            }
        }
        System.out.println("There are "+sum+" primes between 2 and "+n+" ("+(sum*100)/n+"% are primes)");
    }
}