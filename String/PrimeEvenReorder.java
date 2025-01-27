package String;

public class PrimeEvenReorder {
   

        // Function to check if a number is prime
        private static boolean isPrime(int num) {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    
        public static void main(String[] args) {
            int[] arr = {8, 5, 9, 7, 8, 5, 4, 2, 3}; // Input array
    
            int n = arr.length;
    
            // Rearrange the array
            int primeIndex = 0; // Index to place the next prime
            int evenIndex = 1;  // Index to place the next even
    
            for (int i = 0; i < n; i++) {
                // Place prime numbers at even indices
                if (isPrime(arr[i]) && primeIndex < n) {
                    swap(arr, i, primeIndex);
                    primeIndex += 2; // Move to the next possible position for primes
                }
            }
    
            for (int i = 0; i < n; i++) {
                // Place even numbers at odd indices
                if (arr[i] % 2 == 0 && evenIndex < n) {
                    swap(arr, i, evenIndex);
                    evenIndex += 2; // Move to the next possible position for evens
                }
            }
    
            // Print the rearranged array
            System.out.print("Reordered Array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    
        // Function to swap two elements in the array
        private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    

