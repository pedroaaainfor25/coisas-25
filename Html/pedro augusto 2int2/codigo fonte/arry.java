import java.util.Arrays;

public class arry {
public static void main (String[] args){
/*
String pais1 = "Brasil";
String pais2 = "russia";
String pais3 = "india"; 
String pais4 = "china";
*/

String[]paises = {"brasil", "russia", "india", "china"};

//pARA DESCOBRIR QUANTAS POSICÕES DO Array(length = lenf)
System.out.println(paises.length);
 
          //para descobrir todos os conteudos de um array
          System.out.println(Arrays.toString(paises));
		  
//para descobrir a posicão de um  determinado elemento
   int posicao = Arrays.binarySearch (paises,"brasil");
   System.out.println("posicao do pais e:"+posicao);
   
  //ordenar meu arry em ordem alfabetica
Arrays.sort(paises, 0,paises.Length); 
System.out.println(Array.toString(paises));
}
}
 