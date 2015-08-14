/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.pas.md5jar;

/**
 *
 * @author Andre Labuschagne
 */
public class StaticOut {
    
    
    private static void addVersion(StringBuilder sbInOut, int startOffSet, int end) {
        for(int i = 0; i < startOffSet; i++) {
            sbInOut.append(" ");
        }
        sbInOut.append("|");
        
        int startVer = end - 2 - MD5Jar.VER.length();
        if((startVer > 0) && (startVer >= startOffSet + 1)) {
            for(int i = startOffSet + 1; i < startVer - 1; i++) {
                sbInOut.append(" ");
            }
        }
        sbInOut.append("v").append(MD5Jar.VER).append(" |\n");        
    }
    
    public static void PrintStart() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append("                               __  __  ___   ____    \n");  
        sb.append("                              (  \\/  )| __) (_  _) \n");  
        sb.append("                             _-)    (-|__ \\.-_)(--+\n"); 
        sb.append("                            | (_/\\/\\_)(___/\\____)  |\n");  
        sb.append("                            |                      |\n");        
        sb.append("                            |       \\~~~~~~/       |\n");       
        sb.append("                            |        )    (        |\n");       
        sb.append("                            |         |  |         |\n");
        sb.append("                            |         |  |         |\n");
        sb.append("                            |         |  |         |\n");
        sb.append("                            |     ____+  +____     |\n");
        sb.append("                            |    /            \\    |\n");
        sb.append("                            |   /     MD5Jar   \\   |\n");
        sb.append("                            |   +---___  ___---+   |\n");
        sb.append("                            |          \\/          |\n");
        addVersion(sb,28, 52);
        sb.append("                            +----------------------'\n");
        //         0123456789012345678901234567890123456789012345678901
        System.out.println(sb);
    }
    
       
    public static void PrintUsage() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append("              __  __  ____   ___   ____   __    ____\n");
        sb.append("             (  \\/  )(  _ \\ | __) (_  _) /__\\  (  _ \\\n");
        sb.append(" _------------)    (  )(_) )|__ \\.-_)(  /(__)\\  )   /--------------+\n");
        sb.append("|            (_/\\/\\_)(____/ (___/\\____)(__)(__)(_)\\_)                |\n");
        sb.append("| Usage:                                                                       |\n");
        sb.append("|   java -jar MD5Jar jarfile                                                   |\n");
        addVersion(sb, 0, 80);
        sb.append("|                                                                              |\n");
        sb.append("+------------------------------------------------------------------------------'");
        
        System.err.println(sb);
    }
    
}
//Character ruler \m/ \m/
//          1         2         3         4         5         6         7         8
//012345678901234567890123456789012345678901234567890123456789012345678901234567890

/**
.(….\…………../….)
. \….\……….. /…./
…\….\………./…./
….\…./´¯.I.¯`\./
…./… I….I..(¯¯¯`\
…I…..I….I…¯¯.\…\
…I…..I´¯.I´¯.I..\…)
…\…..` ¯..¯ ´…….’
….\_________.?´
…..lo o o o o ol
…..lo o o o o ol
…..lo o o o o o|
 */