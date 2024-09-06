package br.com.kilobyte.crud.service;

import br.com.kilobyte.crud.entity.Cliente;
import br.com.kilobyte.crud.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 *
 * @author Vinicius
 */

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    
    public List<Cliente> listaCliente(){
        return clienteRepository.findAll();
    }
    
    public Optional<Cliente> buscarPorId(Long id){
        return clienteRepository.findById(id);
    }
    
    public void removerPorId(Long id){
        clienteRepository.deleteById(id);
    }
}
