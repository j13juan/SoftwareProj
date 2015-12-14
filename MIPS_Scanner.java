
/**
 * Contains the Scanner classes for the compiler. 
 * 
 * @version 1.3 
 * compiler is working. The file actually needs to be scanned twice. 
 * labelScanner will be the initial scan and search for all labels and house the line numbers. 
 * 
 * 1.2
 * started work on scanner -Nick 
 * 
 * 
 * 1.1
 * wrote switch case for registers
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class MIPS_Scanner
{
    public void labelScanner(){
    }    

    public void compiler(){
        Scanner inFile = null;

        try{
            inFile = new Scanner( new File( "test.txt" )  );
        }

        catch (FileNotFoundException e)
        {
            System.out.println("Error opening file ");
            System.exit(0);
        }

        String lineIn = null;
        String lineOut = null;
        while(inFile.hasNextLine()){
            lineIn = inFile.nextLine();

            //first check for # and remove everything after it. 
            if(lineIn.indexOf('#') != -1){
                lineIn = lineIn.substring(0, lineIn.indexOf('#')-1);
            }
            //removes labels. 
            if(lineIn.indexOf(':') != -1){
                lineIn = lineIn.substring(lineIn.indexOf(':')+1);
            }

            //store a boolean and a temp string for the label
            String[] inLineFrag = lineIn.split(" "); //split it up into "frags" string[0...4]

            //loop through array and remove commas
            for(int i=1; i<inLineFrag.length; i++){
                if(inLineFrag[i].indexOf(',') != -1){
                    inLineFrag[i] = inLineFrag[i].substring(0, inLineFrag[i].indexOf(','));
                }
            }
            //pass the array
            return;
            //             lineOut = getFormat(lineIn);
            //             System.out.println(lineOut);

        }
    }

}
