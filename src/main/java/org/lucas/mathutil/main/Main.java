/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lucas.mathutil.main;

import org.lucas.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test case #1: n=0
        System.out.println("Check getF(0) 0! | expected: 1 | actual: "+ MathUtility.getFactorial(0));
        //Test case #2: n=1
        System.out.println("Check getF(1) 1! | expected: 1 | actual: "+ MathUtility.getFactorial(1));
        //Test case #3: n=2
        System.out.println("Check getF(2) 2! | expected: 2 | actual: "+ MathUtility.getFactorial(2));
        //Test case #4: n=3
        System.out.println("Check getF(3) 3! | expected: 6 | actual: "+ MathUtility.getFactorial(3));
        //Test case #5: n=5
        System.out.println("Check getF(5) 5! | expected: 120 | actual: "+ MathUtility.getFactorial(5));
        //Test case #6: n=-1
        System.out.println("Check getF(-1) -1! | expected: exception | actual: ");
        MathUtility.getFactorial(-1);
        //vì ngoại lệ sẽ ngắt lệnh println()
        //in trước r chờ ngoại lệ xh
        //thiết kế hàm giai thừa: âm giai thừa và >20! thì ko tính đc
        //hàm sẽ ném ra ngoại lệ
        //ta đã có hàm tính giai thừa, ta phải test hàm
        //test thông qua các test case, những tình huống xài hàm
        // chuẩn bị bộ data và expected value
        // sau đó run các test case để coi đúng sai
        //test case 1: check if getF()returns well with n = 0;
        //Steps/Procedures
        //I - input n = 0 to the function/method
        // - run the method to get the actual value of 0! getF(n=0)
        //Expected: getF(0) 0! must be is 1, expected value = 1
        
        //test case 2: check if getF()returns well with n = 1;
        //Steps/Procedures
        //I - input n = 1 to the function/method
        // - run the method to get the actual value of 1! getF(n=1)
        //Expected: getF(1) 1! must be is 1, expected value = 1
        
        //TDD: Test Driven DEvelopment: viết code, làm app theo style
        //code và test song hành với nhau
        //phải nghĩ ngay luôn các bộ test khi bắt đầu viết code
        //đặc trưng của TDD: XAnh xanh đỏ đỏ
    }
    
}
