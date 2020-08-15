import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String senha = "null";

        System.out.println("Insira seu nome completo:");
        String nome = ler.nextLine();

        StringBuilder ultimo = new StringBuilder("_");

        for (int i = nome.lastIndexOf(" ")+1; i <= nome.length(); i++){
            if (i < nome.length()) {
                ultimo.append(nome.charAt(i));
            }
        }

        String login = nome.charAt(0)+ultimo.toString();

        System.out.println("Seu login é: " + login);


        boolean validaSenhaPadrao = false;

        while (validaSenhaPadrao == false){

            System.out.println("Insira uma senha:");
            senha = ler.nextLine();

            if (senha.length() >= 8 && senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+")){
                System.out.println("Tudo certo");
                validaSenhaPadrao = true;
            } else{
                System.out.println("Senha não confere:");
            }
        }

        boolean doLogin = false;

        while (doLogin == false){

            System.out.println("Insira seu login:");
            String vLogin = ler.nextLine();

            System.out.println("Insira sua senha:");
            String vSenha = ler.nextLine();

            if (vLogin.equals(login) && vSenha.equals(senha)){
                System.out.println("Login realizado com sucesso!");
                doLogin = true;
            }else{
                System.out.println("Login ou senha errados, tente novamente!");
            }

        }

    }
}
