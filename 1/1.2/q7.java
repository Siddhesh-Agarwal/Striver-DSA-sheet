class q7 {
    public static void main(String args[]) {
        int n = 5;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<=2*i+1; k+=2) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}