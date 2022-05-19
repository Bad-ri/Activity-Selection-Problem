package task3q4;

/*
This Assignment was done by:
Name                     |ID
Noor al-fattha Tarek     20192107
Mohamed Mahmoudel-badri  20194841
Eyad abdellatif          20192959
Mahmoud Aladin           20195445
Omar Mostafa             2019374
UNDER SUPERVISION OF TA/ Amany Hussien
*/

public class Task3Q4 {

    public static void main(String[] args) {
        
        int[] start ={1,3,0,5,3,5,6 ,8 ,8 ,2 ,12};
        int[] finish ={4,5,6,7,8,9,10,11,12,13,14};
        insertionSort(start,finish);
        int i = 0;
        
        System.out.println(start[i]+" , "+finish[i]);
        
       for(int x = 1 ; x < finish.length;x++){
           
            if(start[x] >= finish[i]){
                
                System.out.println(start[x]+" , "+finish[x]);
                i = x;
            }
       }
    }
    
     public static void insertionSort(int start[],int finish[]){  
         
        int n = finish.length;
        
        for (int j = 1 ; j < n ; j++) {
            
            int key = finish[j];  
            int i = j-1;
            
            while ( (i > -1) && ( start [i] > key ) ) {  
                finish [i+1] = finish [i];
                start [i+1] = finish [i];
                i--;  
            }  
            finish[i+1] = key;  
        }  
    }
}
