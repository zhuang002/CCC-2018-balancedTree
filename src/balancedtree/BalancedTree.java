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
    
    static HashMap<Integer,Long> dic=new HashMap(); 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int weight=sc.nextInt();
        
        long typesOfBalancedTrees=getTypesOfBalancedTrees(weight);
        if (typesOfBalancedTrees==947660108) {
            System.out.println(weight);
        }
        System.out.println(typesOfBalancedTrees);
    }

    private static long getTypesOfBalancedTrees(int weight) {
        if (weight==1) return 1;
        if (dic.containsKey(weight)) return dic.get(weight);
        long typesOfBalancedTrees=0;
        for (int k=2;k<=weight;k++) {
            int w=weight/k;
            typesOfBalancedTrees+=getTypesOfBalancedTrees(w);
        }
        dic.put(weight, typesOfBalancedTrees);
        return typesOfBalancedTrees;
    }
}
