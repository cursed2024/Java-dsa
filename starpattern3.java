class starpattern3{
    public static void main(String args[]){
        int n=5;
        for(int row=1; row<=n; row++){
            for(int colomn=1; colomn<=row; colomn++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}