/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author User
 */
public class Produto {
    //ATRIBUTOS:
    public int codigoDoProduto;
    public String nomeDoProduto="";
    public float precoDoProduto;
    public int qtd_EmEstoque;
    public int codigoDoFornecedor;
    
    //METODOS
  
    /**
     * @return the codigoDoProduto
     */
    public int getCodigoDoProduto() {
        return codigoDoProduto;
    }

    /**
     * @return the nomeDoProduto
     */
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    /**
     * @return the precoDoProduto
     */
    public float getPrecoDoProduto() {
        return precoDoProduto;
    }

    /**
     * @return the qtd_EmEstoque
     */
    public int getQtd_EmEstoque() {
        return qtd_EmEstoque;
    }

    /**
     * @return the codigoDoFornecedor
     */
    public int getCodigoDoFornecedor() {
        return codigoDoFornecedor;
    }

    /**
     * @param codigoDoProduto the codigoDoProduto to set
     */
    public void setCodigoDoProduto(int codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    /**
     * @param nomeDoProduto the nomeDoProduto to set
     */
    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    /**
     * @param precoDoProduto the precoDoProduto to set
     */
    public void setPrecoDoProduto(float precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    /**
     * @param qtd_EmEstoque the qtd_EmEstoque to set
     */
    public void setQtd_EmEstoque(int qtd_EmEstoque) {
        this.qtd_EmEstoque = qtd_EmEstoque;
    }

    /**
     * @param codigoDoFornecedor the codigoDoFornecedor to set
     */
    public void setCodigoDoFornecedor(int codigoDoFornecedor) {
        this.codigoDoFornecedor = codigoDoFornecedor;
    }
    
}
