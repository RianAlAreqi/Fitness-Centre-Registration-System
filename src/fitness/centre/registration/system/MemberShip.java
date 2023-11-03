
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness.centre.registration.system;



/**
 *
 * @author Rian Alareqi
 */
public class MemberShip extends Member {

     static Object[][] fitness = new Object[2][3];
     static String[] registernationtype = {"Silvermembership", "VIPmembership"};
     static double[] registrationprice = {50.00, 150.00};
// private String name;
//    private int id;
//    private int PhoneNumber;
    public MemberShip(String name, int id, int PhoneNumber) {
        super(name, id, PhoneNumber);

    }

    public double CalculateSilverMembership() {
        double SilverMember = 0;
        double tax = 0.10;
         SilverMember = registrationprice[0];
         double SilverMember1 = (SilverMember * tax) + SilverMember;
        return SilverMember1;
    }

    public double CalculateVIPMembership() {
        double VIPMembership = 0;
        double tax = 0.10;
        VIPMembership = registrationprice[1];
         double VIPMembership1 = VIPMembership * tax + VIPMembership;
        return VIPMembership1;
    }
    
}