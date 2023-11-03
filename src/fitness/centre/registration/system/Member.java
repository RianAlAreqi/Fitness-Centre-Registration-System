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
public abstract class Member {

    private String name;
    private int id;
    private int PhoneNumber;

    public Member(String name, int id, int PhoneNumber) {
        this.name = name;
        this.id = id;
        this.PhoneNumber = PhoneNumber;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return this.id;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public double getPhoneNumber() {
        return this.PhoneNumber;
    }

    public String toString() {
        return this.name + ", " + this.id + ", " + this.PhoneNumber;
    }

    public abstract double CalculateSilverMembership();
    public abstract double CalculateVIPMembership();
}
