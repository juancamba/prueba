/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Collection;
import dao.*;
import dto.*;
/**
 *
 * @author juan
 */
public class ListaCds {

    private String whereClause = new String();
    private Collection<CdDTO> listaCds;
    
    public String getWhereClause() {
        return whereClause;
    }

    public void setWhereClause(String whereClause) {
        this.whereClause = whereClause;
    }

    public Collection<CdDTO> getListaCds() {
     
        if (whereClause == null) {
            whereClause = new String();
        }
        CdDAO cdDAO = new CdDAO();
        listaCds = cdDAO.getCds();
        //Collection<FuncionDTO> listaFunciones = funcionDAO.listaFunciones(whereClause);
       
        return listaCds;
    }
}
