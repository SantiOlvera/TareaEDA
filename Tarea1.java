/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDA;

/**
 *
 * @author santiagoolvera
 */
public class Tarea1 {
    public static int edit(String s1, String s2, int cont){
        if(s1==null || s2==null)
            return -1;
        if(s1.length()==0 || s2.length()==0)
            return cont+s1.length()+s2.length();
        if(s1.charAt(0)==s2.charAt(0))
            return edit(s1.substring(1),s2.substring(1),cont);
        int sus=edit(s1.substring(1),s2.substring(1),cont+1);
        int ins=edit(s1.substring(1),s2,cont+1);
        int bor=edit(s1,s2.substring(1),cont+1);
        if (sus<ins && sus<bor)
            return sus;
        if(ins<bor)
            return ins;
        return bor;
    }
    
    public static void main(String[] args) {
        String s1="fernando";
        String s2="ernandof";
        System.out.println(edit(s1,s2,0));
        
        String s3="fernando";
        String s4="ernanfof";
        System.out.println(edit(s3,s4,0));
        
        String s5="santi";
        String s6="aints";
        System.out.println(edit(s5,s6,0));
        
        String s7="santi";
        String s8="santi";
        System.out.println(edit(s7,s8,0));
        
        String s9="jueveebes";
        String s10="jueves";
        System.out.println(edit(s9,s10,0));
        
        String s11="beesjuebetp";
        String s12="jueves";
        System.out.println(edit(s11,s12,0));
        
        String s13=null;
        String s14=null;
        System.out.println(edit(s13,s14,0));
        
        String s15="el nniño";
        String s16=" el";
        System.out.println(edit(s15,s16,0));
    }
}
