package exemplos;

public class Exemplo {
	
	 public static void main(String[] args){
	        int[] arr=new int[10];
	        for(int i=0;i<arr.length;i++){
	            arr[i]=(i+1)*(i+1);
	        }
	        System.out.println(arr[9]+arr[10]);
	    }
}