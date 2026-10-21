class counteve {
    public static void main (String [] args){
        int arr[] = { 1,2,3,4,5,6,7,8};
        int eve = 0, odd = 0;
            for(int i = 0; i <= 7; i ++){
                if(arr[i]%2==0){
                    eve++;
                }
                else{
                    odd++;
                }
        }
        System.out.println("Even numbers in Array :"+eve);
        System.out.print("Odd numbers in Array :"+odd);

    }
}