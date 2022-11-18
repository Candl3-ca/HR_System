package com.fp.fp;

public class Staff extends Person implements PayRoll {

    private String Duty;
    private int workload;

    public Staff() {
        super(0, null, null, null, null, null, null);
    }

    public Staff(int PersonID, String FirstName, String LastName, String Email, String address, String Password, String Phone, String Duty, int workload) throws Exception {
        super(PersonID, FirstName, LastName, Email, address, Password, Phone);
        this.Duty = Duty;
        setWorkload(workload);
    }

    public String getDuty() {
        return Duty;
    }

    public void setDuty(String duty) {
        Duty = duty;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) throws Exception {
        if (workload > 40) {
            throw new Exception("Workload is too high"
                    + "\nPlease re-input your workload");
        }
        this.workload = workload;
    }

    public String getCSVInfo() {
        return "Staff," + super.getCSVInfo() + "," + Duty + "," + workload;
    }

    @Override
    public String getCategory() {
        return "Staff";
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString() + ", "
                + "Duty='" + Duty + '\''
                + ", workload=" + workload
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Staff)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Staff staff = (Staff) o;
        return getWorkload() == staff.getWorkload() && getDuty().equals(staff.getDuty());
    }

    @Override
    public double ComputePayRoll() {
        return (workload * 32 * 2) * 0.75;
    }
}
