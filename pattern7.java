public class pattern7 {
    public static void main(String[] args) {
        int n = 4;
        for(int row=0; row<n; row++){
            for(int space = 0; space < n-row-1; space++){
                System.out.print(" ");
            }
            for(int star = 0; star < 2*row+1; star++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

//Time Complexity:O(n^2) due to nested loops,
// where the inner loop runs proportional to 'n' in total across all iterations