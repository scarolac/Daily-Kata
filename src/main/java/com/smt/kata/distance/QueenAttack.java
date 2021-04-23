package com.smt.kata.distance;

import java.util.Arrays;

/****************************************************************************
 * <b>Title:</b> QueenAttack.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Queen Attack Kata
 * 
 * Given the position of two queens on a chess board, indicate whether or not 
 * they are positioned so that they can attack each other. In the game of chess, 
 * a queen can attack pieces which are on the same row, column, or diagonal.  A 
 * chess board can be represented by an 8 by 8 array.  You must initialize the board to 
 * have the '-' character to simulate the board as shown below.
 * 
 * So if you're told the white queen is at (2, 3) and the black queen at (5, 6), 
 * then you'd know you've got a set-up like so:
 * 
 * _ _ _ _ _ _ _ _
 * _ _ _ _ _ _ _ _
 * _ _ _ W _ _ _ _
 * _ _ _ _ _ _ _ _
 * _ _ _ _ _ _ _ _
 * _ _ _ _ _ _ B _
 * _ _ _ _ _ _ _ _
 * _ _ _ _ _ _ _ _
 * 
 * You'd also be able to answer whether the queens can attack each other. In 
 * this case, that answer would be yes, they can, because both pieces share a diagonal.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 22, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
class QueenAttack{char[][]a;public QueenAttack(char[][]a){super();a=a;for(char[]c:a=a)Arrays.fill(c,'-');}boolean canAttack(int[]a,int[]b){return a!=null&&b!=null&&a.length==2&&b.length==2&&(a[0]==b[0]||a[1]==b[1]||Math.abs((a[1]-b[1])/(a[0]-b[0]))==1);}}
