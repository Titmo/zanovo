package org.example;

public class EmployeeBook {
    private Employee[] staff = new Employee[10];

    public EmployeeBook() {
        staff[0] = new Employee("Чернов Д.И.", 135_845, 2);
        staff[1] = new Employee("Григорьев М. Д.", 118_702, 3);
        staff[2] = new Employee("Беляев Д. А.", 66_132, 4);
        staff[3] = new Employee("Александров А. И.", 82_077, 4);
        staff[4] = new Employee("Савина М. С.", 64_450, 5);
        staff[5] = new Employee("Голубев А. А.", 224_679, 1);
        staff[6] = new Employee("Белоусова Е. И.", 221_751, 2);
        staff[7] = new Employee("Бычков Д. А.", 81_302, 1);
        staff[8] = new Employee("Кузнецов П. С.", 131_841, 5);
        staff[9] = new Employee("Комарова Е. И.", 180_025, 3);

    }



    public void allStaff() {
        for (int i = 0; i < staff.length; i++) {
                System.out.println(this.staff[i].toString());

        }

    }

    public int totalSalary() {
        int totalSalary = 0;
        for (int i = 0; i < staff.length; i++) {
            totalSalary += staff[i].getSalary();
        }
        return totalSalary;
    }

    public int min() {
        int min = staff[0].getSalary();
        for (int i = 0; i < staff.length; i++) {
            if (min > staff[i].getSalary()) {
                min = staff[i].getSalary();
            }
        }
        return min;
    }

    public int max() {
        int max = staff[0].getSalary();
        for (int i = 0; i < staff.length; i++) {
            if (max < staff[i].getSalary()) {
                max = staff[i].getSalary();
            }
        }
        return max;
    }

    public int averageSalary() {
        return totalSalary() / staff.length;
    }

    public void getAllName() {
        for (int i = 0; i < staff.length; i++) {
            System.out.println("staff[i].getName() = " + staff[i].getName());
        }
//
    }

    public void salaryIndexation(float percent) {
        for (int i = 0; i < staff.length; i++) {
            staff[i].setSalary((int) (staff[i].getSalary() + (staff[i].getSalary() * (percent / 100))));
            System.out.println("staff[i].getSalary() = " + staff[i].getSalary());
        }
    }

    public int minDepartmentSalary(int department) {
        int min = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getDepartment() == department) {
                min = staff[i].getSalary();
                break;
            }
        }
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getDepartment() == department) {
                if (min > staff[i].getSalary()) {
                    min = staff[i].getSalary();
                }
            }
        }

        return min;
    }

    public int maxDepartmentSalary(int department) {
        int max = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getDepartment() == department) {
                max = staff[i].getSalary();
                break;
            }
        }
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getDepartment() == department) {
                if (max < staff[i].getSalary()) {
                    max = staff[i].getSalary();
                }
            }
        }
        return max;
    }

    public int totalSalaryDep(int dep) {
        int totalSalaryDep = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getDepartment() == dep) {
                totalSalaryDep += staff[i].getSalary();
            }
        }
        return totalSalaryDep;
    }

    public int averageSalaryDep(int dep) {
        int c = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getDepartment() == dep) {
                c++;
            }
        }
        return totalSalaryDep(dep) / c;
    }

    public void salaryIndexationDep(int dep, float percent) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getDepartment() == dep) {
                staff[i].setSalary((int) (staff[i].getSalary() + (staff[i].getSalary() * (percent / 100))));
                System.out.println("staff[i].getSalary() = " + staff[i].getSalary());
            }
        }
    }

    public void getAllNameDap(int dep) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getDepartment() == dep) {
                System.out.println(staff[i].getName() + " " + staff[i].getSalary() + " " + staff[i].getId());
            }
        }

    }

    public void salaryLess(int salaryMin) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getSalary() > salaryMin) {
                System.out.println(staff[i].getName() + " " + staff[i].getSalary() + " " + staff[i].getId());
            }
        }
        System.out.println("всё");
    }

    public void salaryHigher(int salaryMax) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getSalary() <= salaryMax) {
                System.out.println(staff[i].getName() + " " + staff[i].getSalary() + " " + staff[i].getId());
            }
        }
        System.out.println("Всё");
    }
}
