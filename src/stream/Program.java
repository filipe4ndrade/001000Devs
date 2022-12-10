package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		//Pipeline
		Stream<Integer> str1 = list.stream().map(x->x*10); 
		System.out.println(Arrays.toString(str1.toArray()));
		
		//reduce é tipo o +=, para multiplição deveria comecar com 1
		int sum = list.stream().reduce(0, (x,y)->x+y);
		System.out.println("Sum = "+ sum);
		
		//Filtrar quem satifaz o predicado
		//map multiplica estes filtros por 10
		//collect transforma stream em list
		List<Integer> newList = list.stream()
				.filter(x-> x%2==0)
				.map(x->x*10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
	
	}

}
