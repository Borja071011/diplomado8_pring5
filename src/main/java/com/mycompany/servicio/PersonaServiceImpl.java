/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servicio;
import com.mycompany.dao.PersonaDao;
import com.mycompany.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * 
 */
@Service
public class PersonaServiceImpl implements PersonaService{
    @Autowired
    private PersonaDao personaDao;
   
    @Transactional(readOnly=true)
    
    @Override
    public List<Persona> listarPersonas(){
    return (List<Persona>)personaDao.findAll();
    
    }
    @Transactional
    @Override
    public void guardar(Persona persona){
    
        personaDao.save(persona);
        
    }
     @Transactional
    @Override
    public void eliminar(Persona persona){
    
        personaDao.delete(persona);
        
    }
     @Transactional(readOnly=true)
    @Override
    public Persona encontrarPersona(Persona persona){
    
        return personaDao.findById(persona.getIdPersona()).orElse(null);
        
    }

   
    
    
}