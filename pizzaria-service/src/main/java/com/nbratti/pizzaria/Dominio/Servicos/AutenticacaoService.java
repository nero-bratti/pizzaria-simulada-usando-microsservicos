package com.nbratti.pizzaria.Dominio.Servicos;

import com.nbratti.pizzaria.Dominio.Dados.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.nbratti.pizzaria.Dominio.Entidades.Cliente;

import java.util.List;

@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired
    private ClientesRepository repository;

    public AutenticacaoService(ClientesRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Cliente cliente = repository.findByEmail(email);
        if (cliente == null) {
            throw new UsernameNotFoundException("Cliente não encontrado");
        }

        return org.springframework.security.core.userdetails.User.builder()
                .username(cliente.getEmail())
                .password(cliente.getSenha())
                .roles("USER")
                .build();
    }
}
