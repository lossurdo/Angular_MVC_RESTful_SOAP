package com.lossurdo.amrs.rn;

import com.lossurdo.amrs.bd.SeriadoBD;
import com.lossurdo.amrs.bean.Seriado;
import com.lossurdo.amrs.crud.CrudGenericoRN;
import java.util.List;

/**
 *
 * @author lossurdo
 */
public class SeriadoRN extends CrudGenericoRN<Seriado> {

    private final SeriadoBD seriadoBD;

    public SeriadoRN() {
        seriadoBD = new SeriadoBD();
    }    
    
    @Override
    public Seriado consultar(Seriado bean) {
        return seriadoBD.consultar(bean);
    }

    @Override
    public boolean excluir(Seriado bean) {
        return seriadoBD.excluir(bean);
    }

    @Override
    public Seriado salvar(Seriado bean) {
        return seriadoBD.salvar(bean);
    }

    @Override
    public Seriado alterar(Seriado bean) {
        return seriadoBD.alterar(bean);
    }

    @Override
    public List<Seriado> pesquisar(Seriado bean) {
        return seriadoBD.pesquisar(bean);
    }

    @Override
    public List<Seriado> pesquisar(String valor) {
        return seriadoBD.pesquisar(valor);
    }
    
}
