package br.com.etec.ariane.trabalhoApi.Respository.resource;


import br.com.etec.ariane.trabalhoApi.Respository.ClienteRepository;
import br.com.etec.ariane.trabalhoApi.Respository.filter.ClienteFilter;
import br.com.etec.ariane.trabalhoApi.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/todos")
    public List<Cliente> listarTodosClientes(){
        return clienteRepository.findAll();
    }

@GetMapping()
        public Page<Cliente> pesquisar(ClienteFilter clienteFilter, Pageable pageable){
        return clienteRepository.filtrar(clienteFilter, pageable);
}

}

