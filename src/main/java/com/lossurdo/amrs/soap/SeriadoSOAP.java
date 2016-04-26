package com.lossurdo.amrs.soap;

import com.lossurdo.amrs.bean.Seriado;
import com.lossurdo.amrs.rn.SeriadoRN;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author lossurdo
 */
@WebService
public class SeriadoSOAP {

    @WebMethod
    public List<Seriado> listagem() {
        SeriadoRN rn = new SeriadoRN();
        return rn.pesquisar("");
    }
    
}
