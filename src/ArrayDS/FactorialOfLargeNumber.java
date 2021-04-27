package ArrayDS;

import java.util.ArrayList;

public class FactorialOfLargeNumber {
    public static void main(String[] args) {
        System.out.println(fact(3));
    }
    private static ArrayList<Integer> fact(int n){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        for(int i = 1;i<=n;i++){
            int k = 0;
            int carry = 0;
            while(k < al.size()){
                int mul = al.get(k) * i; // 1 * 1
//                if(carry != 0){
//                    mul+=carry;
//                }
//                if(mul > 9){
//                    if(k + 1 > al.size() - 1){
//                        al.add(k, mul % 10);
//                        al.add(mul / 10);
//                    }else{
//                        al.add(k, mul % 10);
//                        carry = mul /10;
//                    }
//                }else{
                    al.add(k, mul); // 1
               // }
                k++;
            }
        }
        return al;
    }
}
