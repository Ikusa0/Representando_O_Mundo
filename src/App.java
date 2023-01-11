import java.lang.System.Logger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String option;
        Subject[] subjects = new Subject[10];
        int subjects_quantity = 0;
        User[] users = new User[10];
        int users_quantity = 0;

        while (true) {
            System.out.println("Bem-vindo ao RespondeAí!!!");
            System.out.println("O que deseja fazer?");
            System.out.println("S = Sair | U = Criar Usuário | M = Inserir Matéria | E = Cadastrar Usuário na Matéria");

            option = scanner.nextLine();

            if (option.equals("S")) {
                break;
            }

            if (option.equals("U")) {
                User user = new User();

                System.out.println("Qual o nome do usuário?");
                user.setName(scanner.nextLine());

                System.out.println("Qual o e-mail do usuário?");
                user.setEmail(scanner.nextLine());

                System.out.println("Qual a senha do usuário?");
                user.setPassword(scanner.nextLine());

                users[users_quantity] = user;
                users_quantity++;

                System.out.println("Usuário criado!");
                continue;
            }

            if (option.equals("M")) {
                Subject subject = new Subject();

                System.out.println("Qual o nome da Matéria?");
                subject.setName(scanner.nextLine());

                subjects[subjects_quantity] = subject;
                subjects_quantity++;

                System.out.println("Matéria criada!");
                continue;
            }

            if (option.equals("E")) {
                String userName;
                String subjectName;

                int userIndex = -1;
                int subjectIndex = -1;

                System.out.println("Qual o nome do Usuário?");
                userName = scanner.nextLine();

                for (int i = 0; i < users.length; i++) {
                    if (users[i] == null) {
                        break;
                    }

                    if (users[i].getName().equals(userName)) {
                        userIndex = i;
                        break;
                    }
                }

                if (userIndex == -1) {
                    System.out.println("Nenhum usuário encontrado.");
                    continue;
                }

                System.out.println("Qual o nome da Matéria?");
                subjectName = scanner.nextLine();

                for (int i = 0; i < subjects.length; i++) {
                    if (subjects[i] == null) {
                        break;
                    }

                    if (subjects[i].getName().equals(subjectName)) {
                        subjectIndex = i;
                        break;
                    }
                }

                if (subjectIndex == -1) {
                    System.out.println("Nenhuma matéria encontrado.");
                    continue;
                }

                users[userIndex].enroll(subjects[subjectIndex]);

                System.out.println("Usuário cadastrado na matéria!");
                continue;
            }

        }
    }
}
