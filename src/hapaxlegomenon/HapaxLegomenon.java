/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hapaxlegomenon;

import java.util.Scanner;

/**
 *
 * @author etwat3497
 */
public class HapaxLegomenon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        Boolean run = true;
        String userWord = "";
        int numLines = 0, counter = 0;
        String[] words = new String[0];
        
        while(run){
            numLines = Integer.parseInt(sc.nextLine());
            if(numLines <1 || numLines>1000){
            }
            else{
                run = false;
            }
        }
        
        words = new String[numLines];
        
        run = true;
        for(int i=0; i<numLines;i++){
            userWord = sc.nextLine();
            while(run){
                if(userWord.length()>16 || userWord.length()<1){
                }
                else{
                    words[i] = userWord;
                    run = false;
                }
            }
            run = true;
        }
        
        for(int i=0; i<words.length;i++){
            for(int k=i+1;k<words.length;k++){
                if(words[i].equals(words[k])){
                    counter++;
                }
                else{
                }
            }
        }
        System.out.println(numLines-counter);
        
        
        
    }
    
}
