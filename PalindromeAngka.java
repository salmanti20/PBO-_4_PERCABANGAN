/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author salman
 */
public class PalindromeAngka{

 public static void main(String[] args){
		new PalindromeKata().palindrome("Katak");
                new PalindromeKata().palindrome("Makan");
                new PalindromeKata().palindrome("Kasur");
                new PalindromeKata().palindrome("kasur ini rusak");
	}
	
	private void palindrome(int=0;){		
		String poli = "";		

		for(int i=teks.length();i>0;i--){
			String test1 = teks.substring(i-1, i);
			poli += test1;
		}
		
		if(teks.equals(poli)){
			System.out.println("==== "+teks+" adalah Palindrome =====");
		}else{
			System.out.println("==== "+teks+" bukan Palindrome =====");
		}
	}
}