/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanFlores
 */
public class IEstudianteImplement implements IEstudianteIterator {
    
      private List<estudiante> ListEstudianteGeneral = new ArrayList<estudiante>(); 
      private List<estudiante> ListEstudianteCursando = new ArrayList<estudiante>(); 
      private List<estudiante> ListEstudianteRetirado = new ArrayList<estudiante>(); 
      private List<estudiante> ListEstudianteGraduado = new ArrayList<estudiante>(); 
      
      public void addEstudiante(estudiante e){
        this.ListEstudianteGeneral.add(e);
    }

    @Override
    public void getCursando() {
        var rep=0;
        for(var estudiante:  this.ListEstudianteGeneral){
            if(estudiante.getEstado().equals("Cursando"))
            {
           this.addCursando(estudiante);
           System.out.println("Nombre: "+this.ListEstudianteCursando.get(rep).getNombre()+
                   "Estado:"+
                   this.ListEstudianteCursando.get(rep).getEstado());
            }
            rep=rep+1;
        }
    }
    
    public void addCursando(estudiante e){
        this.ListEstudianteCursando.add(e);
    }

    @Override
    public void getGraduado() {
        var rep=0;
        for(var estudiante:  this.ListEstudianteGeneral){
            if(estudiante.getEstado().equals("Graduado"))
            {
           this.addGraduado(estudiante);
           System.out.println("Nombre: "+this.ListEstudianteGraduado.get(rep).getNombre()+
                   "Estado:"+
                   this.ListEstudianteGraduado.get(rep).getEstado());
            }
            rep=rep+1;
            }
        } 

    public void addGraduado(estudiante e){
        this.ListEstudianteGraduado.add(e);
    }
    
    @Override
    public void getRetirado() {
        var rep=0;
        for(var estudiante:  this.ListEstudianteGeneral){
            if(estudiante.getEstado().equals("Retirado"))
            {
           this.addRetirado(estudiante);
            System.out.println("Nombre: "+this.ListEstudianteRetirado.get(rep).getNombre()+
                   "Estado:"+
                   this.ListEstudianteRetirado.get(rep).getEstado());
            }
            rep=rep+1;
        } }
    
    public void addRetirado(estudiante e){
        this.ListEstudianteRetirado.add(e);
    }

    @Override
    public void getGeneral() {
    var rep=0;
        for(var estudiante:  this.ListEstudianteGeneral){
            
            System.out.println("Nombre: "+this.ListEstudianteGeneral.get(rep).getNombre()+
                   "Estado:"+
                   this.ListEstudianteGeneral.get(rep).getEstado());
            rep=rep+1;
        }    
    }
    
}
