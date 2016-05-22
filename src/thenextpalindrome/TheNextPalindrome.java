package thenextpalindrome;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Patricia
 */
public class TheNextPalindrome {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter printWriter = new PrintWriter(System.out);

        int count = Integer.parseInt(bufferedReader.readLine());
        while(count-- > 0) {
            String number = (bufferedReader.readLine()).trim();
            char[] palindromeArray = calcTheNextPalindrome(number);
            printWriter.println(palindromeArray);
            printWriter.flush();
        }
        bufferedReader.close();
        printWriter.close();
    }

    public static char[] calcTheNextPalindrome(String number) {
        char[] palindrome = number.toCharArray();
        
        int length = palindrome.length;         
        boolean tudoNove = true;
        
        int i = 0;
        //Verifica se todos os dígitos são 9
        while((tudoNove) && (i < length)){
            if(palindrome[i] != '9'){
                tudoNove = false;
            }
            i++;
        }
        
        //Se for tudo nove adiciona uma posição no array, seta a primeira e última como 1 e o resto 0
        if(tudoNove){
            palindrome = new char[length + 1];
            palindrome[0] = '1';
            for (i = 1; i < length; i++){
                palindrome[i] = '0';
            }
            palindrome[length] = '1';
            
            return palindrome;
        }
        
        //Caso não seja tudo 9 será verificado se ao dividir o array em dois, o último da esquerda é menor que o primeiro da direita
        int meio = length / 2;
        i = 0;
        boolean reprocessar = true;
        while(i < meio){
            if(palindrome[i] < palindrome[length - 1 - i]){
                reprocessar = true;
            }else if(palindrome[i] > palindrome[length - 1 - i]){
                reprocessar = false;
            }
            palindrome[length - 1 - i] = palindrome[i];
            i++;
        }
        
        //Indica que o número palíndrome ficou menor que o informado, neste caso é preciso reprocessar
        if(reprocessar){
            meio = ((length % 2) == 0) ? (meio - 1) : meio;
            int qtdNove = 0;
            while(palindrome[meio - qtdNove] == '9'){
                palindrome[meio - qtdNove] = '0';
                palindrome[length - 1 - meio + qtdNove] = '0';
                qtdNove++;
            }
            palindrome[meio - qtdNove]++;
            palindrome[length - 1 - meio + qtdNove] = palindrome[meio - qtdNove];          
        }
        
        return palindrome;
    }

}
