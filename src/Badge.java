public class Badge{
    private static int totalNumberOfEmployee;
    private String badgeIdCode;
    public Employee employee;

    public Badge(Employee employeeThatNeedBudge){
        Badge.keepTrackOfEmployee();
        this.employee = employeeThatNeedBudge;
        this.badgeIdCode = generateBadgeIdCode();
    }

    private static void keepTrackOfEmployee(){
        Badge.totalNumberOfEmployee ++;
    }

    private String generateBadgeIdCode(){
        return "bifasf - " + employee.getName() +  employee.getSurname() + " - jkghfi";
    }

    public void showBadgeDetails(){
        System.out.println("Tot employee - " + Badge.totalNumberOfEmployee);
        System.out.println(employee.getEmployeeDetails());
        System.out.println("Badge ID code - " + this.badgeIdCode);
    }


}
