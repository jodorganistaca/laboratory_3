public class TheBlob //antipatron The God o The Blob
{
    public void HireEmployee(String employee) {
        System.out.printf(employee + " contratado");
    }
    public void TerminateEmployee(int employeeID) {
        System.out.printf(employeeID + " despedido");
    }
    public void EditEmployee(String employee) {
        System.out.printf(employee +" editado");
    }
    public void AddVacationTime(int employeeID, String vacationDate) {
        System.out.printf(employeeID + " vacaciones en " + vacationDate);
    }
    public void CancelVacationTime(int employeeID, String vacationDate) {
        System.out.printf(employeeID + " vacaciones canceladas en " + vacationDate);
    }
    public void AddAddress(int employeeID, String address) {
        System.out.printf(employeeID + " direccion: " + address);
    }
    public void RemoveAddress(int employeeID, int addressID) {
        System.out.printf(employeeID + " direccion" +addressID+ "removida " );
    }
    public void GiveBonus(int employeeID, float bonus) {
        System.out.printf(employeeID + " bonus: " + bonus);
    }
    public void AssignEquipment(int employeeID, String equipment) {
        System.out.printf(employeeID + " equipo: " + equipment);
    }
    public void GiveRaise(int employeeID, float amount) {
        System.out.printf(employeeID + " aumento de: " + amount);
    }
    public void DockPay(int employeeID, float amount) {
        System.out.printf(employeeID + " pago de: " + amount);
    }
    public void AddSchedule(int employeeID, String schedule) {
        System.out.printf(employeeID + " horario: " + schedule);
    }
    public void AddPhoneNumber(int employeeID, String phoneNumber) {
        System.out.printf(employeeID + " telefono: " + phoneNumber);
    }
}
