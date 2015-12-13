
/**
 * Write a description of class Compiler1 here.
 * 
 * @author (your name) 
 * @version v1.1
 * takes the instruction, figures out the format, and calls the correct format method.
 * 
 */
public class Compiler1
{
    public String getFormat(String[] codeLine){
        String instruction = codeLine[0];
        String format;
        switch(instruction){
            case "add": format = "r";
                break;
            case "addu": format = "r";
                break;    
            case "and": format = "r";
                break;
            case "jr": format = "r";
                break;
            case "nor": format = "r";
                break;
            case "or": format = "r";
                break;
            case "slt": format = "r";
                break;
            case "sltu": format = "r";
                break;
            case "sll": format = "r";
                break;    
            case "srl": format = "r";
                break;
            case "sub": format = "r";
                break;    
            case "subu": format = "r";
                break;
            case "div": format = "r";
                break;
            case "divu": format = "r";
                break;    
            case "mfhi": format = "r";
                break;    
            case "mflo": format = "r";
                break;    
            case "mthi": format = "r";
                break;    
            case "mtlo": format = "r";
                break;    
            case "mult": format = "r";
                break;
            case "multu": format = "r";
                break;    
            case "sra": format = "r";
                break;
            case "syscall": format = "r";
                break;
            case "break": format = "r";
                break;    
            case "xor": format = "r";
                break;    
            case "addi": format = "i";
                break;    
            case "addiu": format = "i";
                break;
            case "andi": format = "i";
                break;    
            case "beq": format = "i";
                break;
            case "bgtz": format = "i";
                break;
            case "blez": format = "i";
                break;    
            case "bne": format = "i";
                break;    
            case "lbu": format = "i";
                break;      
            case "lui": format = "i";
                break;
            case "lb": format = "i";
                break;    
            case "lw": format = "i";
                break;    
            case "ori": format = "i";
                break;
            case "xori": format = "i";
                break;    
            case "slti": format = "i";
                break;    
            case "sltiu": format = "i";
                break;   
            case "sw": format = "i";
                break;    
            case "j": format = "j";
                break;    
            case "jal": format = "j";
                break;   
        }
        
        if (format.equals("r")){
            return makeR(codeLine);
        }
        else if(format.equals("i")){
            return makeI(codeLine);
        }
        else if(format.equals("j")){
            return makeJ(codeLine);
        }
        else{
            return "Error: Enter a valid instruction code.";
        }
    }
    
    
    public String makeR(String[] codeLine){
    }
    
    public String makeI(String[] codeLine){
    }
    
    public String makeJ(String[] codeLine){
    }
}
