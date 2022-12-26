package 상속기본2;
public class PersonMain {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.viewWorker();
        Student student = new Student();
        student.viewStudent();
        HouseWife houseWife = new HouseWife();
        houseWife.viewHouseWife();
    }
}
