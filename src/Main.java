public class Main {
    public static void main(String[] args) {

        // לבדוק את המספרים עד 10 איזה מהם אי זוגיים ולהדפיס אותם

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0){
                continue;   //מדלג על שאר גוף הלולאה וחוזר לבדוק את התנאי 
            }
            System.out.println(i + " ");
        }
    }
}