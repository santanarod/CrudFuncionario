package up.edu.br.crudfuncionario.dao;

import java.util.ArrayList;
import java.util.List;

import up.edu.br.crudfuncionario.model.Funcionario;

public class FuncionarioDao {

    static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void salvar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void deletar(int index) { funcionarios.remove(index);}

    public List<Funcionario> listar() {
        return funcionarios;
    }

}
