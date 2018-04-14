public class WorkingDay {
    public static void main(String[] args) {
        byte day = 3;
        switch (day) {
            case 1:
            case 7:
                System.out.println("final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia útil");
                break;
            default:
                System.out.println("opção inválida");
        }
    }
}
