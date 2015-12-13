
/**
 * Write a description of class MIPSCompiler here.
 * 
 * @author (your name) 
 * @version 1.1
 * wrote switch case for registers
 */

import java.util.Scanner;
import java.io.*;
public class MIPSCompiler
{
    String[] readIn = new String[5];
    
    public MIPSCompiler(String filename){
        Scanner inFile = null;
        try{
            inFile = new Scanner( new File( filename )  );
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error opening file ");
            System.exit(0);
        }

    }

    public static String registerFunction(String r)
    {
        String register = r;
        String regBinary;
        switch (register)
        {
            case "$zero": regBinary = "00000";
                break;
            case "$at": regBinary = "00001";
                break;
            case "$v0": regBinary = "00010";
                break;
            case "$v1": regBinary = "00011";
                break;
            case "$a0": regBinary = "00100";
                break;
            case "$a1": regBinary = "00101";
                break;
            case "$a2": regBinary = "00110";
                break;
            case "$a3": regBinary = "00111";
                break;
            case "$t0": regBinary = "01000";
                break;
            case "$t1": regBinary = "01001";
                break;
            case "$t2": regBinary = "01010";
                break;
            case "$t3": regBinary = "01011";
                break;
            case "$t4": regBinary = "01100";
                break;
            case "$t5": regBinary = "10101";
                break;
            case "$t6": regBinary = "01110";
                break;
            case "$t7": regBinary = "01111";
                break;
            case "$s0": regBinary = "10000";
                break;
            case "$s1": regBinary = "10001";
                break;
            case "$s2": regBinary = "10010";
                break;
            case "$s3": regBinary = "10011";
                break;
            case "$s4": regBinary = "10100";
                break;
            case "$s5": regBinary = "10101";
                break;
            case "s6$": regBinary = "10110";
                break;
            case "$s7": regBinary = "10111";
                break;
            case "$t8": regBinary = "11000";
                break;
            case "$t9": regBinary = "11001";
                break;
            case "$k0": regBinary = "11010";
                break;
            case "$k1": regBinary = "11011";
                break;
            case "$gp": regBinary = "11100";
                break;
            case "$sp": regBinary = "11101";
                break;
            case "$fp": regBinary = "11110";
                break;
            case "$ra": regBinary = "11111";
                break;
            default: regBinary = "Invalid register";
                break;
        }
        return regBinary;
        
    }

    public String getOpcode(String op)
    {
        String opCode = op;
        String opBinary;
        switch (opCode)
        {
            case "sll": opBinary = "000000";
            break;
            default: opBinary = "Invalid opCode";
                break;
        }
        return opBinary;
    }
}
