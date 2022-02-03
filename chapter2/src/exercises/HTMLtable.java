package captainCiaoCiao.CaptainCiaoCiao.chapter2.src.exercises;

public class HTMLtable {
    public void startHTML(){
        System.out.println("<html>");
    }
    public void startTable(){
        System.out.println("<table>");
    }
    public void tableHead(){
        System.out.println("<tr><th>Quantity</th><th>Flamethrower</th><th>Fire extinguisher</th></tr>");
    }
    public void tableRow(int priceThrower, int priceExtinguisher){
        for(int i = 1; i <= 10; i++){
            System.out.printf("<tr><td>%d</td><td>%d</td><td>%d</td></tr>%n", i, priceThrower * i, priceExtinguisher * i);
        }
    }
    public void endTable() {
        System.out.println("</table>");
    }

    public void endHTML() {
        System.out.println("</html>");
    }

}
