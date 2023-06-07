import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ClienteController
{
    int opcao=0;
    List<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---- Cadastro de Clientes ----");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Atualizar cliente");
            System.out.println("4. Remover cliente");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarCliente(clientes, scanner);
                    break;
                case 2:
                    listarClientes(clientes);
                    break;
                case 3:
                    atualizarCliente(clientes, scanner);
                    break;
                case 4:
                    removerCliente(clientes, scanner);
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 5);
    }

    private static void cadastrarCliente(List<Cliente> clientes, Scanner scanner) {
        System.out.println("---- Cadastro de Cliente ----");
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o e-mail do cliente: ");
        String email = scanner.nextLine();
        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();

        Cliente novoCliente = new Cliente(nome, email, telefone);
        clientes.add(novoCliente);

        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void listarClientes(List<Cliente> clientes) {
        System.out.println("---- Lista de Clientes ----");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    private static void atualizarCliente(List<Cliente> clientes, Scanner scanner) {
        System.out.println("---- Atualizar Cliente ----");
        System.out.print("Digite o e-mail do cliente a ser atualizado: ");
        String email = scanner.nextLine();

        Cliente clienteEncontrado = null;

        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            System.out.print("Digite o novo nome do cliente: ");
            String novoNome = scanner.nextLine();
            System.out.print("Digite o novo e-mail do cliente: ");
            String novoEmail = scanner.nextLine();
            System.out.print("Digite o novo telefone do cliente: ");
            String novoTelefone = scanner.nextLine();

            clienteEncontrado.setNome(novoNome);
            clienteEncontrado.setEmail(novoEmail);
            clienteEncontrado.setTelefone(novoTelefone);

            System.out.println("Cliente atualizado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void removerCliente(List<Cliente> clientes, Scanner scanner) {
        System.out.println("---- Remover Cliente ----");
        System.out.print("Digite o e-mail do cliente a ser removido: ");
        String email = scanner.nextLine();

        Cliente clienteEncontrado = null;

        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            clientes.remove(clienteEncontrado);
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    static class Cliente {
        private String nome;
        private String email;
        private String telefone;

        public Cliente(String nome, String email, String telefone) {
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", E-mail: " + email + ", Telefone: " + telefone;
        }
    }
    
}
