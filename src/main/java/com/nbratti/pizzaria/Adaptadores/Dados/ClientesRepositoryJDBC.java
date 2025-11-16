package com.nbratti.pizzaria.Adaptadores.Dados;

import com.nbratti.pizzaria.Dominio.Dados.ClientesRepository;
import com.nbratti.pizzaria.Dominio.Entidades.Cliente;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ClientesRepositoryJDBC implements ClientesRepository {

    private final JdbcTemplate jdbc;

    public ClientesRepositoryJDBC(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    private final RowMapper<Cliente> mapper = (rs, rowNum) ->
            new Cliente(
                    rs.getString("cpf"),
                    rs.getString("nome"),
                    rs.getString("celular"),
                    rs.getString("endereco"),
                    rs.getString("email"),
                    rs.getString("senha")
            );

    public Cliente findByEmail(String email) {
        var list = jdbc.query("SELECT * FROM clientes WHERE email = ?", mapper, email);
        return list.stream().findFirst().orElse(null);
    }

    public void save(Cliente cliente) {
        jdbc.update(
                "INSERT INTO clientes (cpf, nome, celular, endereco, email, senha) VALUES (?, ?, ?, ?, ?, ?)",
                cliente.getCpf(),
                cliente.getNome(),
                cliente.getCelular(),
                cliente.getEndereco(),
                cliente.getEmail(),
                cliente.getSenha()
        );
    }
}
