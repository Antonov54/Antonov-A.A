public class main {
    public static void main(String args[]) {
        String login = "user";
        String password = "12345";
        if (login.equals(args[0]) && password.equals(args[1]))
            System.out.println("Вас узнали. Добро пожаловать");
        else
            System.out.println("Логин и пароль не распознаны. Доступ запрещен");
    }
}