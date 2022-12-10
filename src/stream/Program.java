package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream();
		// tString converte stream em vetor
		System.out.println(Arrays.toString(st1.toArray()));
		//map aplica uma função no stream
		Stream<Integer> st2 = list.stream().map(x -> x*10);
		System.out.println(Arrays.toString(st2.toArray()));
		
		//of permite colocar os valores diretamente
		Stream<String> st3 = Stream.of("Maria","Jose","Alex","Filipe");
		System.out.println(Arrays.toString(st3.toArray()));
		
		//iterate função de iteração (primeiro item, função)
		Stream<Integer> st4 = Stream.iterate(0, x -> x+2);
		//como é infinita, é necessária usar limit
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
		//Sequencia de fibonacci
		//precisa do map, pois o long retorna pares
		Stream<Long> fibonacci = Stream.iterate(new Long[] {0L,1L}, p-> new Long[] {p[1],p[0]+p[1]}).map(p->p[0]);
		System.out.println(Arrays.toString(fibonacci.limit(10).toArray()));
	
	}

}
