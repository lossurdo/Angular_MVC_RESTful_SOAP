package com.lossurdo.amrs.crud;

import com.lossurdo.amrs.bean.Seriado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lossurdo
 */
public class MockBancoDados {
    
    private static List<Seriado> lista;
    
    private MockBancoDados() {
        lista = new ArrayList<>();
        
        Seriado s1 = new Seriado(100, "Game of Thrones");        
        s1.setNota(9.4);
        s1.setElenco("Daenerys, Cersei, Tyrion...");
        lista.add(s1);
        
        lista.add(new Seriado(200, "Homeland"));
        
        Seriado s2 = new Seriado(300, "Jessica Jones");
        s2.setSumario("MARVEL");
        lista.add(s2);
        
        lista.add(new Seriado(400, "The Big Bang Theory"));
        Seriado s3 = new Seriado(500, "X-Files");
        s3.setElenco("Fox Mulder e Dana Scully");
        lista.add(s3);
    }
    
    public static MockBancoDados getInstance() {
        return MockBancoDadosHolder.INSTANCE;
    }
    
    private static class MockBancoDadosHolder {
        private static final MockBancoDados INSTANCE = new MockBancoDados();
    }

    public List<Seriado> getLista() {
        return lista;
    }
    
    public Seriado get(Integer pk) {
        for (Seriado seriado : lista) {
            if(seriado.getId().equals(pk)) {
                return seriado;
            }
        }
        return null;
    }
        
}
