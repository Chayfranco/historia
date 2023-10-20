package src;

public class Lab01-2023-1 {
    
public static int encontrar(int[] array, int num){
    for(int i = 0; i < array.length; i++){
        if (num == array[i]){
            return num;
        }
    return 0;

    }

}

public static int maior(int[] array){
    int num = array[0];
    for(int i = 0; i < array.length ; i++){
        while (num < array[i]){
            num = array[i];      
        }
    }
    return num;
    }



}
    
