class q6 {
    public static void main(String args[]) {
        int n = 5;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                System.out.print(j-i+1 + " ");
            }
            System.out.println();
        }
    }
}