/**
 * @Elliot Parker @2020-07-30
 */

public class Flight { // Class that is intended to be created as an object. Stores data about singular
                      // flight.

    private String dep;
    private String arr;
    private String airline;
    private String fltNum;
    private String acftType;
    private String acftReg;

    public Flight() {
    }

    public Flight(String dep, String arr, String airline, String fltNum, String acftType, String acftReg) {
        this.dep = dep;
        this.arr = arr;
        this.airline = airline;
        this.fltNum = fltNum;
        this.acftType = acftType;
        this.acftReg = acftReg;
    }

    public Flight(String[] arr) {
        this.dep = arr[0];
        this.arr = arr[1];
        this.airline = arr[2];
        this.fltNum = arr[3];
        this.acftType = arr[4];
        this.acftReg = arr[5];
    }

    public String toString() { // Convert object data to string
        return this.dep + ", " + this.arr + ", " + this.airline + ", " + this.fltNum + ", " + this.acftType + ", "
                + this.acftReg;
    }

    public String getDep() {
        return this.dep;
    }

    public String getArr() {
        return this.arr;
    }

    public String getAirline() {
        return this.airline;
    }

    public String getFltNum() {
        return this.fltNum;
    }

    public String getAcftType() {
        return this.acftType;
    }

    public String getAcftReg() {
        return this.acftReg;
    }
}