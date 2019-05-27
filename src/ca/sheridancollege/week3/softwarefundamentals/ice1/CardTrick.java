/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha
 * @tanvir 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)((Math.random()*13)+1));
           //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
           c.setSuit(c.SUITS[(int)((Math.random())*3)]);
           
           System.out.println("card num" + i + ":" + c.getValue()+ "  "+ c.getSuit());
           //Then report the result here
           Scanner input= new Scanner(System.in);
           int luck=input.nextInt();
           System.out.println("luck card is lucky for me "+luck);
    }
    
}
}
