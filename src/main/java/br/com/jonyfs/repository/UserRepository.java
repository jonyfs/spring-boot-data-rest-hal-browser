/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jonyfs.repository;

import br.com.jonyfs.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jony Santos <jony.santos@bematech.com.br>
 */
public interface UserRepository extends CrudRepository<User, Long> {
    
}
