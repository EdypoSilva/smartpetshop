/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClass.Repositorio;

import AllClass.Cliente;
import static BancoDeDados.BancoPetshop.BancoListCliente;

public class RepositorioCliente {

    public static boolean setCadastroCliente(Cliente c) {
        boolean result = false;
        try {
            BancoListCliente.add(c);
            result = true;
        } catch (Exception e) {
            result = false;
        }
        return result;
        //Cadastrando Cliente
    }

    public static boolean setAlterarCliente(Cliente c) {
        boolean clienteAlterado = false;
        Cliente clienteX;
        try {
            for (int i = 0; i < BancoListCliente.size(); i++) {
                clienteX = BancoListCliente.get(i);
                if (clienteX.getCpf().equals(c.getCpf())) {
                    c.setSaldo(clienteX.getSaldo());
                    BancoListCliente.set(i, c);
                    clienteAlterado = true;
                }
            }
        } catch (Exception e) {
        }
        return clienteAlterado;
        //Alterando Cliente
    }

    public static boolean setRemoverCliente(String cpf) {
        boolean clienteRemovido = false;
        Cliente c = new Cliente();
        if ((!RepositorioCompra.getExisteClienteCompra(cpf)) && (!RepositorioAnimal.getExisteClienteAnimal(cpf))) {
            for (int i = 0; i < BancoListCliente.size(); i++) {
                c = BancoListCliente.get(i);
                if (c.getCpf().equals(cpf)) {
                    BancoListCliente.remove(i);
                    clienteRemovido = true;
                }
            }
        } else {
            clienteRemovido = false;
        }
        return clienteRemovido;
        //Remover Cliente
    }

    public static boolean setCreditar(String cpf, double valor) {
        boolean testcreditar = false;
        try {
            Cliente c = new Cliente();
            for (int i = 0; i < BancoListCliente.size(); i++) {
                c = BancoListCliente.get(i);
                if (c.getCpf().equals(cpf)) {
                    c.setSaldoCreditar(valor);
                    BancoListCliente.set(i, c);
                    testcreditar = true;
                }
            }
        } catch (Exception e) {
            testcreditar = false;
        }
        return testcreditar;
        //Adicionar valor ao cliente
    }

    public static boolean setDebitar(String cpf, double valor) {
        boolean statusDebitar = false;
        try {
            Cliente c = new Cliente();
            for (int i = 0; i < BancoListCliente.size(); i++) {
                c = BancoListCliente.get(i);
                if (c.getCpf().equals(cpf) && c.getSaldo() >= valor) {
                    c.setSaldoDebitar(valor);
                    BancoListCliente.set(i, c);
                    statusDebitar = true;
                }
            }
        } catch (Exception e) {
        }
        return statusDebitar;
        //Remover valor do cliente
    }

    public static Cliente getExibirCliente(String cpf) {
        Cliente exbCliente = new Cliente();
        for (int i = 0; i < BancoListCliente.size(); i++) {
            Cliente x = BancoListCliente.get(i);
            if (x.getCpf().equals(cpf)) {
                exbCliente = x;
            }
        }
        return exbCliente;
    }

    public static boolean setValidarCPF(String cpf) {
        boolean CPFativo = false;
        Cliente c = new Cliente();
        try {
            for (int i = 0; i < BancoListCliente.size(); i++) {
                c = BancoListCliente.get(i);
                if (c.getCpf().equals(cpf)) {
                    CPFativo = true;
                }
            }
        } catch (Exception e) {
            CPFativo = false;
        }

        return CPFativo;
        //validando CPF
    }

    //FimClass
}
