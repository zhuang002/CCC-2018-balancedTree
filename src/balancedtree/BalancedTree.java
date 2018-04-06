/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancedtree;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class BalancedTree {

    /**
     * @param args the command line arguments
     */
    
    static HashMap dic=new HashMap(); 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int weight=sc.nextInt();
        
        int typesOfBalancedTrees=getTypesOfBalancedTrees(weight);
        System.out.println(typesOfBalancedTrees);
    }

    private static int getTypesOfBalancedTrees(int weight) {
        if (weight==1) return 1;
        if (dic.containsKey(weight)) return (int)dic.get(weight);
        int typesOfBalancedTrees=0;
        for (int i=weight;i>=2;i--) {
            typesOfBalancedTrees+=getTypesOfBalancedTrees(weight/i);
        }
        dic.put(weight, typesOfBalancedTrees);
        return typesOfBalancedTrees;
    }
}
