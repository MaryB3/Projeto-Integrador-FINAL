/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author MaryBeds  / Wellington
 */
public class Dependente extends Pessoa{
    //ATRIBUTOS:
    public String grauDeParentesco;   // combobox com: esposo(a) , filho(a)
    public int socioIndicador;  //criar combobox pegando matricula do socio no banco
    
    //METODOS:
   
    /**
     * @return the grauDeParentesco
     */
    public String getGrauDeParentesco() {
        return grauDeParentesco;
    }

    /**
     * @return the socioIndicador
     */
    public int getSocioIndicador() {
        return socioIndicador;
    }

    /**
     * @param grauDeParentesco the grauDeParentesco to set
     */
    public void setGrauDeParentesco(String grauDeParentesco) {
        this.grauDeParentesco = grauDeParentesco;
    }

    /**
     * @param socioIndicador the socioIndicador to set
     */
    public void setSocioIndicador(int socioIndicador) {
        this.socioIndicador = socioIndicador;
    }
    
  
}
