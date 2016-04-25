package com.lossurdo.amrs.bd;

import com.lossurdo.amrs.bean.Seriado;
import com.lossurdo.amrs.crud.CrudGenericoRN;
import com.lossurdo.amrs.crud.MockBancoDados;
import java.util.List;

/**
 *
 * @author lossurdo
 */
public class SeriadoBD extends CrudGenericoRN<Seriado> {

    @Override
    public Seriado consultar(Seriado bean) {
        return MockBancoDados.getInstance().get(bean.getId());
    }

    @Override
    public boolean excluir(Seriado bean) {        
        return MockBancoDados.getInstance().getLista().remove(bean);
    }

    @Override
    public Seriado salvar(Seriado bean) {
        bean.setId(getFakeID());
        MockBancoDados.getInstance().getLista().add(bean);
        return bean;
    }

    @Override
    public Seriado alterar(Seriado bean) {        
        excluir(bean);
        return salvar(bean);
    }

    @Override
    public List<Seriado> pesquisar(Seriado bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Seriado> pesquisar(String valor) {
        return MockBancoDados.getInstance().getLista();
    }
    
}
