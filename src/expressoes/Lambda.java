package expressoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import modelo.Pessoa;

public class Lambda {

	public static void main(String[] args) throws InterruptedException {
		
		  List<Pessoa> pessoas = new ArrayList<>();
	        
	        pessoas.add(new Pessoa("Marcelo", 28, "Marechal Rondom"));
	        pessoas.add(new Pessoa("Tiago", 32, "Motoki koto"));
	        pessoas.add(new Pessoa("Rubens", 40, "José de alencar"));
	        pessoas.add(new Pessoa("Esladiane", 30, "Carlos Bombonato"));
	        pessoas.add(new Pessoa("Stella", 5, "Jose Bonini"));
	        pessoas.add(new Pessoa("Cleiton", 20, "Julio Marcari"));
	        pessoas.add(new Pessoa("Luiz", 358, "José Bonifacio"));
	        
//	        Runnable runnable = new Runnable() {
//	        	
//				@Override
//				public void run() {	
//			
//				  Collections.sort(pessoas, (p1,p2) -> p1.getNome().compareTo(p2.getNome()));
//				  pessoas.forEach(e -> System.out.println(e.getNome()));
//				
//				}
//			};
//	     
//			new Thread(runnable).start();
	        
	        
//	        Runnable runnable = () ->  {
//				Collections.sort(pessoas, (p1,p2) -> p1.getNome().compareTo(p2.getNome()));
//				pessoas.forEach(e -> System.out.println(e.getNome()));
//				};
//			
//			new Thread(runnable).start();
	      
	        
			new Thread(() ->  {
				Collections.sort(pessoas, (p1,p2) -> p1.getNome().compareTo(p2.getNome()));
				pessoas.forEach(e -> System.out.println(e.getNome()));
				}).start();
		
				
	
       
	}
}
