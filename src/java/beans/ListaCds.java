/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Collection;
import dao.*;
/**
 *
 * @author juan
 */
public class ListaCds {

    private String whereClause = new String();

    public String getWhereClause() {
        return whereClause;
    }

    public void setWhereClause(String whereClause) {
        this.whereClause = whereClause;
    }

    public Collection<CdBean> getCds() {
        /*Collection<MaterialUsadoDTO> materialesUsados = ModelFacade.getMaterialesUsados(whereClause);
         return materialesUsados;*/

        // if no 'where' clause string is passed in, create an empty string
        if (whereClause == null) {
            whereClause = new String();
        }
        CdDAO cdDAO = new CdDAO();
        Collection<CdBean> listaCds = cdDAO.getCds();
        //Collection<FuncionDTO> listaFunciones = funcionDAO.listaFunciones(whereClause);
        return listaCds;
    }
}
